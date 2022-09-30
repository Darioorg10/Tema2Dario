/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Algoritmo04 {
    
    public static void main(String[] args) {
        
        final double PRECIOFIJO = 1.25;
        final double PRECIOVARIABLE = 0.08;
        double kilometrosRecorridos;
        double precio;
        
        String kilometrosRecorridosString = JOptionPane.showInputDialog("Introduce"
                + " los kilómetros recorridos");
        
        kilometrosRecorridos = Double.parseDouble(kilometrosRecorridosString);
        precio = (PRECIOFIJO + kilometrosRecorridos*PRECIOVARIABLE);
        
        System.out.println("El precio es " + precio + "€");
        
    }
    
    
}
