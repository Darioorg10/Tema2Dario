/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidortiempo;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Ej14 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int cantidadTiempo;
        System.out.println("Introduce los segundos : ");
        cantidadTiempo = teclado.nextInt();
        
        final int MINUTOSHORA = 60;
        final int SEGUNDOSHORA = 3600;
        
        int horas = cantidadTiempo / SEGUNDOSHORA;
        
        int minutos = (cantidadTiempo % SEGUNDOSHORA) / MINUTOSHORA;
        
        int segundos = cantidadTiempo % MINUTOSHORA;
        
        System.out.println("Hemos pasado " + cantidadTiempo + " segundos " + "\n" + " Nos sale " + horas
        + " horas " + minutos + " minutos " + segundos + " segundos");
        
        
    }
    
}
