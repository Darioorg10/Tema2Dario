/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author dario
 */
public class Ej02 {

        //apartado A
        public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        //apartado B
        double d = 4.5, e = 5.7, f = 6.9;

        //apartado C
        System.out.println(a + "\s" + b + "\s" + c);
        System.out.println(d + "\s" + e + "\s" + f);

        //apartado D
        b = c;
        c = a;
        a = b;

        System.out.println(a + "\s" + b + "\s" + c);

    }

}

