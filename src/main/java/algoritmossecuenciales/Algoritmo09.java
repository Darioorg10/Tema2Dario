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
public class Algoritmo09 {
    
    public static void main(String[] args) {
        
        final double IVA = 0.21;
        double precioProducto;
        double precioConIva;
        
        String precioProductoString = JOptionPane.showInputDialog("Introduce "
                + "el precio antes de IVA");
        
        precioProducto = Double.parseDouble(precioProductoString);
        precioConIva = (precioProducto*IVA+precioProducto);
        
        System.out.println("El precio después de iva es de " + precioConIva + "€");
        
                
        
    }
    
}
