/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//existen algunos codigos mas optimos y eficientes que otros. Teniendo en cuenta la agilida.
package semana04;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author GIOVANNI
 */
public class ejer3 {

    public static void main(String[] args) {
        int suma = 0, cont = 1;
        Scanner cin = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int n = cin.nextInt();
        while (cont <= n) {
            suma += cont;
            cont++;
        }
        System.out.println("suma: " + suma);
    }
}