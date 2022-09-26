/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author dario
 */
public class Ej03 {
    
    public static void main(String[] args) {
        
        //apartado A y B
        
        int a = 10, b = 5, i = 0;
        double c = 71.3, d = 4.8;
        
        //apartado C
        
        int resultadoSumaAB;
        int resultadoRestaAB;
        int resultadoProductoAB;
        int resultadoDivisionAB; // Si quiero decimales dividiendo dos int tengo
        // que forzar que uno de los operadores se double o float
        double resultadoSumaCD;
        double resultadoRestaCD;
        double resultadoProductoCD;
        double resultadoDivisionCD;
        
        
        resultadoSumaAB = (a + b);
        resultadoRestaAB = (a - b);
        resultadoProductoAB = (a * b);
        resultadoDivisionAB = (a / b);
        resultadoSumaCD = (c + d);
        resultadoRestaCD = (c - d);      
        resultadoProductoCD = (c * d);
        resultadoDivisionCD = (c / d);
        
        // También se podría hacer con un string, en vez de System.out.printf
        // pondríamos String resultado = """ y ya hacemos el textblock, luego
        //solo tendríamos que poner System.out.printf(resultado);
                
        System.out.printf("""
                          Resultado suma a y b: %d 
                          Resultado resta a y b: %d
                          Resultado multiplicacion a y b: %d
                          Resultado division a y b: %d
                          Resultado suma c y d: %.3f
                          Resultado resta c y d: %.4f
                          Resultado multiplicacion c y d: %.2f
                          Resultado division c y d: %.1f \n"""
                , resultadoSumaAB, resultadoRestaAB,resultadoProductoAB
        ,resultadoDivisionAB, resultadoSumaCD, resultadoRestaCD,
        resultadoProductoCD,resultadoDivisionCD);
        
        System.out.println("a: " + a);
        a*=3; // a = a*3
        System.out.println("a: " + a);
        
        System.out.println("b: " + b);
        b-=1; // b = b-1;
        System.out.println("b: " + b);
        
        System.out.println("a/b: " + a/b);
        a/=b; // a = a/b;
        System.out.println("a/b: " + a/b);
        
        System.out.println("c+d: " + c+d);
        c+=d; // c = c+d;
        System.out.println("c+d: " + c+d);
        
        
        System.out.println("i: " + i);
        System.out.println("i++: " + (i++)); //significa que se autoincrementa 1
        System.out.println("i: " + i);
        System.out.println("++i: " + (++i)); //no hace falta poner el paréntesis verde
        // con el ++i en vez de el i++ se incrementa en esa misma línea
        
        // Módulo
        a = 11;
        b = 5;
        
        int cociente = a/b;
        int resto = a%b;
        
        System.out.println("Cociente " + cociente + "\n" + "Resto " + resto);
        
        
        
        
        
        
        
    }
    
}
