/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Algoritmo08 {
    public static void main(String[] args) {
        
        final double GINECOLOGIA=0.4;
        final double TRAUMATOLOGIA=0.3;
        final double PEDIATRIA=0.3;
        
        double presupuestoGinecologia;
        double presupuestoTraumatologia;
        double presupuestoPediatria;
        double presupuesto;
        
        String presupuestoString = JOptionPane.showInputDialog("Introduce el presupuesto");
        presupuesto = Double.parseDouble(presupuestoString);
        
        presupuestoGinecologia= GINECOLOGIA*presupuesto;
        presupuestoTraumatologia= TRAUMATOLOGIA*presupuesto;
        presupuestoPediatria= PEDIATRIA*presupuesto;
        
        System.out.printf("""
                           Con un presupuesto de %.2f€
                           se asigna a ginecologia %.2f€,
                           traumatologia %.2f€ y a pediatria %.2f€""",presupuesto,
                           presupuestoGinecologia,presupuestoTraumatologia,
                           presupuestoPediatria);
        
        
    }
            
            
    
}
