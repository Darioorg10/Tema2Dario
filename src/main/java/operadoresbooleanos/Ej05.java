/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresbooleanos;

/**
 *
 * @author dario
 */
public class Ej05 {
    
    
    public static void main(String[] args) {
        
        boolean verdadero = true;
        boolean falso = false;
        
        System.out.println("verdadero y verdadero es " + (verdadero&&verdadero));
        System.out.println("verdadero y falso es " + (verdadero && falso));
        System.out.println("falso y verdadero es " + (falso && verdadero));
        System.out.println("falso y falso es " + (falso && falso));
        System.out.println("verdadero o verdadero es " + (verdadero || verdadero));
        System.out.println("verdadero o falso es " + (verdadero || falso));
        System.out.println("falso o verdadero es " + (falso || verdadero));
        System.out.println("falso o falso es " + (falso || falso));
        System.out.printf("%b %b",!verdadero,!falso);
    }
    
    
}
