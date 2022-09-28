/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class EjemplosExpresionesLogicas {
    
    public static void main(String[] args) {
        
        // Leer por teclado nombre y apellido1 de una persona,
        // edad, peso (kg) y estatura (cm)
        
        String nombre, apellido;
        int edad, estatura;
        double peso;
        
        Scanner teclado = new Scanner(System.in);
        
        // SI HAY QUE LEER TEXTOS Y NUMEROS CON SCANNER
        // PRIMERO SE LEEN LOS TEXTOS Y AL FINAL LOS NUMEROS
        
        // SI LO ANTERIOR NO ES POSIBLE, HAY QUE TENER EN CUENTA
        // QUE DESPUÉS DE LEER UN NÚMERO SI VAMOS A LEER UN TEXTO
        // HAY QUE LIMIPAR EL BUFFER (teclado.nextLine())
        
        System.out.println("Introduce la edad");
        edad = teclado.nextInt();
        
        System.out.println("Tu edad es " + edad);
// Limpiar porquería
        teclado.nextLine();
        System.out.println("Introduce tu nombre ");
        nombre = teclado.nextLine();
        System.out.println("Tu nombre es " + nombre);
        
        System.out.println("Introduce tu peso ");
        peso = teclado.nextDouble();
        
        
        
        // Guardar en variables booleanas el resultado de evaluar las siguientes
        // expresiones
        
        // A. - Si la edad está comprendida entre 25 y 35 años 
        // incluidos
        
        boolean a = edad>=25&&edad<=35;
        System.out.println("¿Edad está entre 25 y 35? " + a);
        
        
        // B. - El peso es mayor de 50 kg o menor o igual de 100kg
        
        boolean b = peso>50||peso<=100;
        System.out.println("Tu peso es mayor de 50 o menor o igual de 100? " + b);
        
        
        
        
        // C. - No mide 175cm
        
        
        
        
        // D. - La estatura está entre 100 cm y 180 cm, excluidos
        
        
        
        
        // E. - La edad más 10 años no supera los 60 años
        
        
        
        
        // F. - El nombre es igual a "Pablo", ignorando mayúsculas y
        // minúsculas. Usa equalsIgnoreCase de los String
        
        
        
        
        // G. - El apellido contiene la letra "j". Usa contains de los String
        
        
        
        
        // H. - El apellido termina en "dez". Usa endsWith de los String
        
        
        
        
        // I. - La edad no está entre 40 y 50 años
        
        
        
        
    }
    
}
