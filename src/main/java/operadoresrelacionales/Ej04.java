/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresrelacionales;

/**
 *
 * @author dario
 */
public class Ej04 {
    public static void main(String[] args) {
        
        // Declaramos e inicializamos las variables (apartado A)
        int a = 10;
        int b = 20;
        
        // Declaramos 4 variables booleanas (apartado B)
        boolean primera;
        boolean segunda;
        boolean tercera;
        boolean cuarta;
        
        primera = a<b;
        segunda = a>b;
        tercera = a==b;
        cuarta = a!=b;

        System.out.printf("""
                          ¿a es menor que b?: %b
                          ¿a es mayor que b?: %b
                          ¿a es igual a b?: %b
                          ¿a es distinto a b?: %b""" ,primera,segunda
        ,tercera,cuarta);
        
        
        
        
    }
    
}
