
package semana05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GIOVANNI
 */
interface cant {

    static final int n = 100;
}

class verdura {

    private String name;
    private int price;

    public verdura(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String info() {
        return "NOMBRE: " + this.name + " precio: " + this.price;
    }
}

class cajaverduras implements cant {

    String listaVerduras[] = {"lechuga", "repollo", "brocoloi", "apio", "cilantro", "perejil"};
    verdura lista[] = new verdura[n];
    int contador = 0, acumulador = 0, promedio;

    public void agregarVerdura() {
        verdura v1 = new verdura(listaVerduras[aleatorio(0, 5)], aleatorio(0, 20));
        lista[contador] = v1;
        contador++;
    }

    public void mostrar() {
        int i = 0;
        do {
            System.out.println(i + 1 + ".-" + lista[i].info());
            acumulador += lista[i].getPrice();
            i++;
        } while (i != contador);
        promedio = acumulador / contador;
    }

    public void mostrar_precios_mayores() {
        int i = 0;
        System.out.println("ESTAS SON LAS VERDURAS CON MAYOR PRECIO: \n");
        do {
            if (lista[i].getPrice() > promedio) {
                System.out.println(lista[i].info());
            }
            i++;
        } while (i != contador);
    }

    public void mostrar_precios_menores() {
        int i = 0;
        System.out.println("ESTAS SON LAS VERDURAS CON MENOR PRECIO: \n");
        do {
            if (lista[i].getPrice() < promedio) {
                System.out.println(lista[i].info());
            }
            i++;
        } while (i != contador);
    }

    private int aleatorio(int min, int max) {
        Random r1 = new Random();
        return r1.nextInt(max - min + 1) + min;
    }
}

public class velocidad {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        cajaverduras c1 = new cajaverduras();
        int ct, opcion;
        boolean bandera = true;
        do {
            System.out.println("INGRESE LA CANTIDAD DE VERDURAS A ELEGIR: (0-100");
            ct = cin.nextInt();
        } while (ct > 100 || ct < 0);
        for (int i = 0; i < ct; i++) {
            c1.agregarVerdura();
        }
        c1.mostrar();

        do {
            System.out.println("\n\n1.-mostrar precios mayores\n2.-mostrar precios menores\n3.-salir");
            opcion = cin.nextInt();
            switch (opcion) {
                case 1:
                    c1.mostrar_precios_mayores();
                    break;
                case 2:
                    c1.mostrar_precios_menores();
                    break;
                case 3:
                    bandera = false;
                    System.out.println("GRACIAS REGRESE PRONTO");
                default:
                    break;
            }
        } while (bandera);
    }
}
