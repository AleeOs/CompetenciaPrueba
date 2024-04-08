/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1061017158
 */
public class Atleta {
    private String Nombre;
    private String Nacionalidad;
    private int Hora;
    private int Minutos;

    public Atleta(String Nombre, String Nacionalidad, int Hora, int Minutos) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Hora = Hora;
        this.Minutos = Minutos;
    }
    // Métodos de acceso (getters) para los atributos
     public String getNombre() {
        return Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public int getHora() {
        return Hora;
    }

    public int getMinutos() {
        return Minutos;
    }
    
    
    // Método para obtener el tiempo total en minutos
    public int getTiempoTotalEnMinutos() {
        return Hora * 60 + Minutos;
    }
    
    // Método para comparar dos atletas por su tiempo
    public int compararPorTiempo(Atleta otroAtleta) {
        int tiempoTotal1 = this.getTiempoTotalEnMinutos();
        int tiempoTotal2 = otroAtleta.getTiempoTotalEnMinutos();

        return Integer.compare(tiempoTotal1, tiempoTotal2);
    }
}
