
package javaapplication11;

import CalculadoraGrafica.CalculadoraGrafica;


public class JavaApplication11 {
  @SuppressWarnings("UnusedAssignment") 
  
    public static void main(String[] args) {
        CalculadoraGrafica interfaz = new CalculadoraGrafica();//llamado a la clase JFrame
        
        interfaz.setVisible(true);//mostrando la interfaz
        interfaz.setLocationRelativeTo(null); // con el set location logramos visualisar la interfaz en cualquier lugar, con el atrubuto NULL  es relativo a nada.
    }  
    
}
