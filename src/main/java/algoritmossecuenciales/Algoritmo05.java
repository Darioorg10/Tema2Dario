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
public class Algoritmo05 {

    public static void main(String[] args) {

        final int HORASCLASE = 30;

        int numeroGrupos;
        int horasProfesorImpartidas;
        int profesoresNecesarios;

        String horasString = JOptionPane.showInputDialog("Introduce las horas que va a trabajar el profesor");

        horasProfesorImpartidas = Integer.parseInt(horasString);

        JOptionPane.showMessageDialog(null, "Las horas que va a trabajar son " + horasProfesorImpartidas);

        String grupoString = JOptionPane.showInputDialog("Introduce el numero de clases que hay en el instituto");

        numeroGrupos = Integer.parseInt(grupoString);

        JOptionPane.showMessageDialog(null, "El numero de clases del instituto es de " + numeroGrupos);

        profesoresNecesarios = (int)Math.ceil(((double)HORASCLASE * numeroGrupos) / horasProfesorImpartidas);

        JOptionPane.showMessageDialog(null, "El numero de profesores que se necesitan son:" + profesoresNecesarios);

    }

}
