package semana02;

import java.util.Scanner;

class Hipotenusa {

    private int cateto1, cateto2;
    static private double tamano_hipotenusa;

    public Hipotenusa(int cateto1, int cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    private void Calculo() {
        Hipotenusa.tamano_hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public void Mostrar() {
        Calculo();
        System.out.println("Triangulo con cateto1: " + cateto1 + " y cateto2: " + cateto2 + " tiene como hipotenusa: " + tamano_hipotenusa);
    }
}

public class ejer01tarea {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Ingrese la longitud del cateto1: ");
        int cateto1 = cin.nextInt();
        System.out.print("Ingrese la longitud del cateto2: ");
        int cateto2 = cin.nextInt();
        Hipotenusa hioptenuso_uno = new Hipotenusa(cateto1, cateto2);
        hioptenuso_uno.Mostrar();
    }
}
