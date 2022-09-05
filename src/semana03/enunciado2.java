/*Enunciado02.java

Ordenar un vector de tamaño 10, utilizar datos aleatorios y mostrar
 en pantalla un antes y un después.*/
package semana03;

import java.util.Random;

interface in_uno {

    int n = 10;
}

class vectorP implements in_uno {

    private final int lista[] = new int[n];

    public void cargar() {
        Random r1 = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = r1.nextInt(100);
        }
    }

    public void mostrar() {
        for (int i = 0; i < lista.length; i++) {
            System.out.print("[" + lista[i] + "]");
        }
        System.out.println("");
    }

    public void ordenar() {
        int aux;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }
}

public class enunciado2 {

    public static void main(String[] args) {
        vectorP v1 = new vectorP();
        v1.cargar();
        System.out.println("vector vector sin ordenar: ");
        v1.mostrar();
        v1.ordenar();
        System.out.println("vector ordenado: ");
        v1.mostrar();
    }
}
