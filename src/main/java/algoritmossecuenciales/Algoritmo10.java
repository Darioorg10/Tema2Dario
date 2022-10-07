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
public class Algoritmo10 {
    
    public static void main(String[] args) {
        
        double ladoA;
        double ladoB;        
        double ladoC;
        double alturaTriangulo;
        double areaTriangulo;
        double areaRectangulo;
        double areaTotal;
        
        String ladoAString = JOptionPane.showInputDialog("Introduce "
                + "la medida del lado A en metros");
        
        ladoA = Double.parseDouble(ladoAString);
        
        String ladoBString = JOptionPane.showInputDialog("Introduce "
                + "la medida del lado B en metros");
        
        ladoB = Double.parseDouble(ladoBString);
        
        String ladoCString = JOptionPane.showInputDialog("Introduce "
                + "la medida del lado C en metros");
        
        ladoC = Double.parseDouble(ladoCString);
        
        alturaTriangulo = (ladoA-ladoC);
        areaTriangulo = (ladoB*alturaTriangulo/2);
        areaRectangulo = (ladoB*ladoC);
        areaTotal = (areaTriangulo+areaRectangulo);
        
        JOptionPane.showMessageDialog(null, "El area total es "
        + areaTotal + " m²");
        
        
    }
    
}
