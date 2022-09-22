/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;

/**
 *
 * @author GIOVANNI
 */
public class ejer01 {

    public static void main(String[] args) {
        int acu = 0;
        long vector[] = new long[100];

        //        for (int i = 0; i < 100000000; i++) {
//            acu += i;
//        }
        for (int i = 0; i < 100; i++) {
            long inicio = System.currentTimeMillis();
            int j = 0;
            while (j < 100000000) {
                acu += j;
                j++;
            }
            long fin = System.currentTimeMillis();
            vector[i] = fin - inicio;
        }
        int p = 0;
       double acu2=0;
        double men = 99999, may = -1;
        for (long l : vector) {
            if (p % 10 == 0) {
                System.out.println("");
            }
            if (l < men) {
                men = l;
            } else if (l>may) {
                may = l;
            }
            System.out.print("[" + l + "]");
            acu2+=l;
            p++;
        }
double promedio=acu2/100;
        System.out.println("\nmenor :" + men);

        System.out.println("mayor :" + may);
        System.out.println("promedio: "+promedio);
    }
}
