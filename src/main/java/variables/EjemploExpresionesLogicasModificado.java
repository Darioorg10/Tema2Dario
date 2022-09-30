/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class EjemploExpresionesLogicasModificado {
    
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
        System.out.println("Introduce tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Tu nombre es " + nombre);

        // Lectura de datos con JOption
        apellido = JOptionPane.showInputDialog("Introduce tu apellido: ");
        //System.out.println("El apellido es " + apellido);
        JOptionPane.showMessageDialog(null, "Tu apellido es " + apellido);
        
        // peso - double // el showInput siempre devuelve un String, lo tenemos que transformar
        String pesoString = JOptionPane.showInputDialog("Introduce el peso: ");
        // Cambio de String a double
        peso = Double.parseDouble(pesoString);
        peso+=10;
        JOptionPane.showMessageDialog(null, "Tu peso es " + peso);

        // estatura - int
        
        String estaturaString = JOptionPane.showInputDialog("Introduce la estatura: ");
        // Cambio de String a int
        estatura = Integer.parseInt(estaturaString);
        
        JOptionPane.showMessageDialog(null, "Tu estatura es " + estatura + "cm");                                 
        
        // Guardar en variables booleanas el resultado de evaluar las siguientes
        // expresiones
        
        // A. - Si la edad está comprendida entre 25 y 35 años 
        // incluidos
        
        boolean a = edad>=25&&edad<=35;
        System.out.println("¿Edad está entre 25 y 35? " + a);
        
        
        // B. - El peso es mayor de 50 kg o menor o igual de 100kg
        
        boolean b = peso>=50||peso<=100;                            
        
        // C. - No mide 175cm
        
        
        boolean c = estatura !=175;                
        
        
        // D. - La estatura está entre 100 cm y 180 cm, excluidos
        
        
        boolean d = estatura>100&&estatura<180;
        System.out.println("¿Tu estatura está entre 100 y 180 excluidos? " + d);
        
        
        // E. - La edad más 10 años no supera los 60 años
        
        
        boolean e = edad+10<60;
        System.out.println("¿Tu edad sumada a 10 años es menor a 60? " + e);
        
        
        // F. - El nombre es igual a "Pablo", ignorando mayúsculas y
        // minúsculas. Usa equalsIgnoreCase de los String
        
        boolean f = (nombre.equalsIgnoreCase("Pablo"));
        System.out.println("¿Tu nombre es Pablo? " + f);
        
        
        
        // G. - El apellido contiene la letra "j". Usa contains de los String
        
        boolean g = (apellido.contains("j"));
        System.out.println("¿Tu apellido contiene j? " + g);
        
        
        // H. - El apellido termina en "dez". Usa endsWith de los String
        
        boolean h = (apellido.endsWith("dez"));
        System.out.println("¿Tu apellido acaba en dez? " + h);
        
        
        // I. - La edad no está entre 40 y 50 años
        
        boolean i = edad>=40&&edad<=50;
        i=!i;
        System.out.println("Tu edad no está entre 40 y 50 años " + i);
    
    }
}
    

