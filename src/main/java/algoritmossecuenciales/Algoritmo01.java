/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Algoritmo01 {
    public static void main(String[] args) {
        
        // Variables
        double gradosC;
        double resultF;
        
        // Constantes
        final double CONSTANTE_MULTIPLICACION = (9.0/5); // Hay que poner el decimal
        // para que lo detecte como Double, porque es un número entero
        final int CONSTANTE_SUMA = 32;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los grados Celsius que quieras "
                + "convertir a Fahrenheit: ");
        
        gradosC = teclado.nextDouble();
        
        resultF = gradosC*CONSTANTE_MULTIPLICACION+CONSTANTE_SUMA;
        
        System.out.println(gradosC + " grados Celsius son " + resultF 
        + " grados Fahrenheit");
    }
    
}
