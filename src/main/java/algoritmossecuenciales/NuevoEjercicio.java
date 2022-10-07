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
public class NuevoEjercicio {
    
    public static void main(String[] args) {
        
        // Ejercicio con JOption y Scanner
        // Calcula el IMC de una persona que introduce su peso y su altura
        
        double peso;
        double altura;
        double imc;
        
        String pesoString = JOptionPane.showInputDialog("Introduce tu peso en kg");
        peso = Double.parseDouble(pesoString);
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu altura en metros:");
        altura = teclado.nextDouble();
        
        imc = (peso/Math.pow(altura, 2)); 
        
        System.out.printf("""
                          Tu imc es: %.2f""",imc);
        
        
        
        
        
        
        
                
        
        
        
        
        
    }
    
}
