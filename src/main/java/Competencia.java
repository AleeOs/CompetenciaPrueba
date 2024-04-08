/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1061017158
 */
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Competencia {
    private ArrayList<Atleta> atletas;

    public Competencia() {
        atletas = new ArrayList<Atleta>();
    }

    public void nuevoAtleta(String nombre, String nacionalidad, int hora, int minutos) {
        Atleta nuevoAtleta = new Atleta(nombre, nacionalidad, hora, minutos);
        atletas.add(nuevoAtleta);
    }

    public Atleta obtenerCampeon() {
        if (atletas.isEmpty()) {
            return null;
        }
        
        // Ordenar la lista de atletas por tiempo
        Collections.sort(atletas, (a1, a2) -> a1.compararPorTiempo(a2));

        // El campeón es el primer atleta en la lista (el que tiene el menor tiempo)
        return atletas.get(0);
    }

    public void mostrarAtletasPorPais(String pais) {
        boolean encontrado = false;
        
        for (Atleta atleta : atletas) {
            if (atleta.getNacionalidad().equalsIgnoreCase(pais)) {
                JOptionPane.showMessageDialog(null,"Atletas de " + pais + ": \n "  
                        + atleta.getNombre());
                encontrado = true;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No hay atletas registrados de " + pais);
        }
    }

    public double calcularTiempoPromedio() {
        if (atletas.isEmpty()) {
            return 0;
        }

        int totalMinutos = 0;
        for (Atleta atleta : atletas) {
            totalMinutos += atleta.getTiempoTotalEnMinutos();
        }

        return (double) totalMinutos / atletas.size();
    }
}
