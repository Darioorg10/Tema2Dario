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
public class Algoritmo03 {
    
    public static void main(String[] args) {
        
        float nota1;
        float nota2;
        float nota3;        
        
        String nota1String = JOptionPane.showInputDialog("Introduce la nota 1");
        nota1= Float.parseFloat(nota1String);
        
        String nota2String = JOptionPane.showInputDialog("Introduce la nota 2");
        nota2= Float.parseFloat(nota2String);
        
        String nota3String = JOptionPane.showInputDialog("Introduce la nota 3");
        nota3= Float.parseFloat(nota3String);
        
        double notaMedia;
        
        notaMedia = (nota1+nota2+nota3)/3;
        
        System.out.printf("Tu nota media es %.2f", notaMedia);
    }
    
}
