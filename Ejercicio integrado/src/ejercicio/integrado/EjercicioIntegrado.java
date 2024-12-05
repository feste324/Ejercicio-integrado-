/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.integrado;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EjercicioIntegrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            String categoria;
            String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del corredor:");
            String Edad = JOptionPane.showInputDialog("Ingrese la edad del corredor ");
            String Tiempoestimado = JOptionPane.showInputDialog("Ingrese el tiempo estimado ");
            String Numerocorredor = JOptionPane.showInputDialog("Ingrese el nuemro de corredor ");
            Participante corre = new Participante(Nombre, Edad, Numerocorredor, Tiempoestimado);
            int edadd;
            edadd = Integer.parseInt(Edad);
            if (edadd < 18) {

                categoria = ("Juvenil");

            } else {
                if (edadd < 40) {

                    categoria = ("Adulto");

                } else {

                    categoria = ("Master");

                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro corredor ?");
                if (continuar != JOptionPane.YES_OPTION) {

                }

            }
            System.out.println("corredor " + Nombre);
            System.out.println("Edade  " + edadd);

            System.out.println("Numero de corredor  " + Numerocorredor);
            System.out.println("tiempo estimado  " + Tiempoestimado);
            System.out.println("categoria  " + categoria);

            int continuarr = JOptionPane.showConfirmDialog(null, "¿Desea ver una lista ordenada por categorias  ?");
            if (continuarr != JOptionPane.YES_OPTION) {
                System.out.println("El corredor " + corre.getNombre() + " " + corre.getEdad()
                        + "Numero " + corre.getNumerocorredor()
                        + "tiene un tiempo estimado de  " + corre.getTiempoestimado());

            }
             int continuarrr = JOptionPane.showConfirmDialog(null, "¿Desea buscar por numero de corredor ? ");
            if (continuarrr != JOptionPane.YES_OPTION) {
                 String buscar = JOptionPane.showInputDialog("Ingrese el numero del corredor "); 
                 int buscarr; 
                buscarr = Integer.parseInt(Edad);
                System.out.println("corredor"+Nombre);
                 
            

        }
           int continuarrrr = JOptionPane.showConfirmDialog(null, "¿Desea eliminar un corredor ? ");
            if (continuarrrr != JOptionPane.YES_OPTION) {
                
                String eliminar = JOptionPane.showInputDialog("Ingrese el nombre del corredor a eliminar  "); 
                System.out.println("Corredor eliminado ");
                
                
            } 
            int continuarrrrr = JOptionPane.showConfirmDialog(null, "¿Desea generar el resto de datos de manera aleatoria  ? ");
            if (continuarrrrr != JOptionPane.YES_OPTION) {
                String ii =JOptionPane.showInputDialog("Ingrese el nuemro de datos a generar  "); 
                int i=Integer.parseInt(ii);
                for ( i = 1; i <= 5; i++) {
                    

                    
}
                
                
                
            } 
            
            

    }

}}
// TODO code application logic here

