package semana04;

import java.util.Random;
import java.util.Scanner;

interface in_uno {

    int n = 100;
}

class Fruta {

    private String name;
    private float price;

    public Fruta(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void informacion() {
        System.out.println("NOMBRE: " + this.name + " PRECIO: " + this.price);
    }
}

class canasta implements in_uno {

    String listaFrutas[] = {"naranja", "platano", "mandarina", "pera", "mango", "papaya", "chirimoya", "lucma", "sandia", "durazno", "fresa", "maracuya", "palta"};
    Fruta lista[] = new Fruta[n];
    int con = 0;
    float acumulador = 0, promedio;

    public void llenar() {
        Fruta p = new Fruta(listaFrutas[aleatorio(0, 11)], aleatorio(1, 16));
        lista[con] = p;
        con++;

    }

    public void mostrar() {
        int i = 0;
        do {
            lista[i].informacion();
            this.acumulador += lista[i].getPrice();
            i++;
        } while (con != i);
        promedio = acumulador / con;
        System.out.println("TOTAL ACUMULADO: " + this.acumulador + " NUMERO DE FRUTAS: " + this.con + " PROMEDIO: " + this.promedio);
    }

    public void mayorPromedio() {
        int i = 0;
        do {
            if (lista[i].getPrice() > promedio) {
                lista[i].informacion();
            }
            i++;
        } while (con != i);
    }

    public void menorPromedio() {
        mostrar();
        int i = 0;
        do {
            if (lista[i].getPrice() <= promedio) {
                lista[i].informacion();
            }
            i++;
        } while (con != i);
    }

    private int aleatorio(int min, int max) {
        Random rd = new Random();
        return rd.nextInt(max - min + 1) + min;
    }
}

public class ejer9 {

    public static void main(String[] args) {
        canasta c1 = new canasta();
        boolean bandera = true;
        int n;
        Scanner cin = new Scanner(System.in);
        do {
            System.out.print("ingrese un numero positivo menor que 100: ");
            n = cin.nextInt();
        } while (n > 100 || n < 0);
        for (int i = 0; i < n; i++) {
            c1.llenar();
        }
        int opcion;

        while (bandera) {
            System.out.println("1.- mostrar precios mayores que el promedio\n2.-mostrar precios menores que el promedio");
            opcion = cin.nextInt();
            switch (opcion) {
                case 1:
                    c1.mayorPromedio();
                    break;
                case 2:
                    c1.menorPromedio();
                    break;
                case 3:
                    bandera = false;
                    System.out.println("gracias. vuelva pronto");
                default:
                    System.out.println("caracter no identificado");
            }
        }
    }
}
