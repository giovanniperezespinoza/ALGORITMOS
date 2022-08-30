/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana04;

import java.util.Random;

/**
 *
 * @author GIOVANNI
 */
public class ejer5 {

    public static void main(String[] args) {
        int vec[] = new int[5];
        int vect2[] = {5, 7, 7, 8};
       
        llenar(vec);
 mostrar(vec);
    }

    private static void mostrar(int[] vec) {
        System.out.println("");
        for (int i = 0; i < vec.length; i++) {
            System.out.println("\t" + vec[i]);

        }
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void llenar(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = aleatorio(20,10 );
        }

    }

    private static int aleatorio(int max, int min) {
        Random rd= new Random();
       // return (int) (Math.random() * ((max + 1)-min))+min;
return rd.nextInt(11);
    }
}
