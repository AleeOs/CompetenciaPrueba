
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 1061017158
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Competencia competencia = new Competencia(); // Crear una instancia de Competencia
        
        boolean x = true;
        while(x){
        String Menu = JOptionPane.showInputDialog("*****COMPETENCIA***** \n"
                + "1. Registrar Atleta. \n"
                + "2. Datos del campeon. \n"
                + "3. Atletas por pais. \n"
                + "4. Tiempo promedio de todos los Atletas. \n"
                + "5. Salir");
        int opcion = Integer.parseInt(Menu);
        switch (opcion){
            case 1:
                String NombreAtleta = JOptionPane.showInputDialog("Ingresar Nombre :");
                
                String Nacionalidad = JOptionPane.showInputDialog("Ingresar Nacionalidad:");
                    int Hora = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Hora:"));
                    int Minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Minutos:"));
                    Atleta nuevoAtleta = new Atleta(NombreAtleta, Nacionalidad, Hora, Minutos);
                    
                    competencia.nuevoAtleta(NombreAtleta, Nacionalidad, Hora, Minutos);
                    
            break;
            
            case 2:
                Atleta campeon = competencia.obtenerCampeon();
                    if (campeon != null) {
                        JOptionPane.showMessageDialog(null, "El campeón es: " + campeon.getNombre() +
                                "\nNacionalidad: " + campeon.getNacionalidad() +
                                "\nTiempo total: " + campeon.getHora() + " horas y " + campeon.getMinutos() + " minutos");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay atletas registrados");
                    }
            break;
            
             case 3:
                 String pais = JOptionPane.showInputDialog("Ingrese el país:");
                    competencia.mostrarAtletasPorPais(pais);
            break;
            
             case 4:
                 double tiempoPromedio = competencia.calcularTiempoPromedio();
                    JOptionPane.showMessageDialog(null, "Tiempo promedio de todos los atletas: " + tiempoPromedio + " minutos");
            break;
            
             case 5:
                 x = false;
            break;
            
            default:
                System.out.println("Opcion no valida. Intenta de nuevo");
            break;    
        }
        
    } // Finliza while
  }
}
