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
public class Algoritmo06 {

    public static void main(String[] args) {

        double cantidad1;
        double cantidad2;
        double cantidad3;
        double total;
        double porcentaje1;
        double porcentaje2;
        double porcentaje3;

        String cantidad1String = JOptionPane.showInputDialog("Introduce la cantidad que invierte "
                + "la primera persona");

        cantidad1 = Double.parseDouble(cantidad1String);

        String cantidad2String = JOptionPane.showInputDialog("Introduce la cantidad que invierte "
                + "la segunda persona");

        cantidad2 = Double.parseDouble(cantidad2String);

        String cantidad3String = JOptionPane.showInputDialog("Introduce la cantidad que invierte "
                + "la tercera persona");

        cantidad3 = Double.parseDouble(cantidad3String);

        total = (cantidad1 + cantidad2 + cantidad3);

        porcentaje1 = (cantidad1 / total * 100);
        porcentaje2 = (cantidad2 / total * 100);
        porcentaje3 = (cantidad3 / total * 100);

        System.out.println("La primera persona invierte un "
                + porcentaje1 + "%" + " La segunda persona invierte un "
                + porcentaje2 + "%" + " La tercera persona invierte un "
                + porcentaje3 + "%");

        String resultados = ("""
                            La primera persona invierte un porcentaje del %.2f
                            La segunda persona invierte un porcentaje del %.2f
                            La tercera persona invierte un porcentaje del %.2f""".formatted(porcentaje1, porcentaje2, porcentaje3));

        JOptionPane.showMessageDialog(null, resultados);

    }

}
