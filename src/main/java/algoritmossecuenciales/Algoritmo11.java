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
public class Algoritmo11 {
    
    public static void main(String[] args) {
        
        // H al cuadrado es la suma de los catetos cada uno al cuadrado
        // El cateto es la raíz el H al cuadrado - cateto al cuadrado
        
        double r;
        double h;
        double areaFinal;
        double areaTriangulo;
        double areaSemiCirculo;
        double alturaTriangulo;
        
        String rString = JOptionPane.showInputDialog("Introduce el radio");
        r = Double.parseDouble(rString);
        
        String hString = JOptionPane.showInputDialog("Introduce la medida del lado h");
        h = Double.parseDouble(hString);
        
        areaSemiCirculo = (Math.PI*Math.pow(r,2)/2);
        
        alturaTriangulo = Math.sqrt(Math.pow(h, 2)- Math.pow(r,2));
        
        areaTriangulo = (r*alturaTriangulo);
        
        areaFinal = areaSemiCirculo+areaTriangulo;
        
        String texto = """
                       El área total es %.2f unidades cuadradas""".formatted(areaFinal);
        
        JOptionPane.showMessageDialog(null, texto);
        
    }
    
    
}
