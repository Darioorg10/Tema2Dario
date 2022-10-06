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
public class Algoritmo02 {
    public static void main(String[] args) {
        
        // Longitud= 2π*Radio
        // Area= π*Radio²
        // Volumen= (4/3)*π*Radio³
        
        double radio;
        double longitud;
        double area;
        double volumen;
        
        final double CONSTANTE_PI = Math.PI;
        final int CONSTANTE_MULTIPLICACION = 2;
        final double CONSTANTE_DIVISION = (4.0/3);
        
        // Introducimos el método de entrada
        
        String radioString = JOptionPane.showInputDialog("Introduce "
                + "el radio");
        
        radio = Double.parseDouble(radioString);
        
        longitud = CONSTANTE_MULTIPLICACION*CONSTANTE_PI*radio;
        area = CONSTANTE_PI*Math.pow(radio,2);
        volumen = CONSTANTE_DIVISION*CONSTANTE_PI*Math.pow(radio,3);
        
        System.out.printf("""
                           La longitud es: %f
                           El area es: %f
                           El volumen es: %f""",longitud,area,volumen);
        
    }
    
}
