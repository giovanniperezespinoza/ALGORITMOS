/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana04;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author GIOVANNI
 */
public class ejer7 {

    public static void main(String[] args) {
        int a[] = new int[20];
llenar(a);
mostrar(a);
    }

    public static void llenar(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(11);
        }
    }

    public static void mostrar(int[] a) {
        for (Integer x: a) {
            System.out.print("\t"+x);
        }

    }
}
