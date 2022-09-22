/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GIOVANNI
 *
 */
interface constante {

    static final int n = 100;
}

class fruta {

    private String name;
    private int price;

    public fruta(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void informacion() {
        System.out.println("Nombre: " + this.name + " Precio: " + this.price);
    }

}

class cesta implements constante {

    String ListaFrutas[] = {"mango", "pera", "durazno", "manzana", "palta", "chirimoya"};
    private fruta lista[] = new fruta[n];
    private int con = 0;
    private float acumulador = 0;
    private float promedio;

    public void agregar() {
        fruta f1 = new fruta(ListaFrutas[aletorio(0, 4)], aletorio(0, 16));
        lista[con] = f1;
        con++;
    }

    public void mostrar() {
        int i = 0;
        do {
            lista[i].informacion();
            acumulador += lista[i].getPrice();
            i++;
        } while (con != i);
        promedio = acumulador / con;
    }

    public void mostrar_precios_mayores() {
mostrar();
        System.out.println("\nlas fruras con los precios mas altos son: ");
        int i = 0;
        do {
            if (lista[i].getPrice() > promedio) {
                lista[i].informacion();
               
            } i++;
        } while (con != i);
    }

    public void mostrar_precios_menores() {
mostrar();
 System.out.println("las fruras con los precios mas bajos son: \n\n");
        int i = 0;
        do {
            if (lista[i].getPrice() < promedio) {
                lista[i].informacion();
                
            }
i++;
        } while (con != i);
    }

    private int aletorio(int min, int max) {
        Random rd = new Random();
        return rd.nextInt(max - min + 1) + min;
    }
}

public class Ultimapractica {

    public static void main(String[] args) {
        cesta c1 = new cesta();
        int opcion, bandera = 0;
        for (int i = 0; i < 10; i++) {
            c1.agregar();
        }
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println("1.-mostrar precios mayores.\n2.-mostrar precios menores\n3.-Salir");
            opcion = cin.nextInt();
            switch (opcion) {
                case 1:
                    c1.mostrar_precios_mayores();
                    break;
                case 2:
                    c1.mostrar_precios_menores();
                    break;
                case 3:
                    bandera = 3;
                    System.out.println("gracias, vuelva pronto");
                default:
                    System.out.println("opcion no disponible");
            }
        } while (bandera != 3);
    }
}
