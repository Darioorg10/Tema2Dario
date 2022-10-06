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
public class Algoritmo07 {
    
    public static void main(String[] args) {
        
        final double EUROENDOLARES = 0.988111;
        double euros;
        double dolares;
        
        String eurosString = JOptionPane.showInputDialog("Introduce los "
                + "euros que quieras convertir a dólares");
        
        euros = Double.parseDouble(eurosString);
        dolares = (euros*EUROENDOLARES);
        
        System.out.println(euros + "€ son " + dolares + "$");
        
    }
    
}
