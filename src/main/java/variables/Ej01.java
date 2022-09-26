/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author dario
 */
//apartado A
public class Ej01 {

    public static void main(String[] args) {

        byte tipoByte;
        int númerosEnteros;
        short tipoShort;
        long tipoLong;
        float tipoFloat;
        double númerosReales;
        char carácteres;
        boolean booleano;

        //apartado B
        final double CONSTANTE;
        final int MESNACIMIENTO;

        //apartado C
        String texto;

        //apartado D
        tipoByte = 47;
        númerosEnteros = 10;
        tipoShort = 89;
        tipoLong = 87l; //el "87l" es lo que se llama literal, este es entero, long
        tipoFloat = 1.54789564f;
        númerosReales = 3.141516;
        carácteres = 'd';
        booleano = true;
        CONSTANTE = 27;
        MESNACIMIENTO = 2;
        texto = "Hola Mundo";

        //apartado E
        System.out.println(tipoByte + "\n" + númerosEnteros + "\n" + tipoShort 
        + "\n" + tipoLong + "\n" + tipoFloat + "\n" + númerosReales + "\n" 
        + carácteres + "\n" + booleano + "\n" + CONSTANTE + "\n" + MESNACIMIENTO
        + "\n" + texto);

        //apartado F
        System.out.printf("%.2f %.2f", númerosReales, tipoFloat);

        //printf es para imprimir en un formato, en este caso, 2 decimales
    }

}
