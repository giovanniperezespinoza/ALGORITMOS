
import java.util.Random;

/*Diseñar un algoritmo para la lectura de 20 números y que nos muestre
la media de todos los números leídos y cuál ha sido el más pequeño.
package semana03;*/

class vectorE {

    static final int n = 20;
    private int cont = 0;
    int lista[] = new int[n];

    float acumulador = 0;
    float promedio;

    public void llenar() {
        Random rd = new Random();
        System.out.print("ingrese un numero: ");
        lista[cont] = rd.nextInt(100);
        System.out.println(lista[cont]);
        cont++;
    }

    void mostrar() {
        int i = 0;
        do {
            System.out.println(lista[i]);
            this.acumulador += lista[i];
            i++;
        } while (cont != i);
        promedio = acumulador / cont;
        System.out.println("suma total " + this.acumulador
                + " Total de numeros " + n + " Promedio: " + this.promedio + "\n");
    }

    int menor() {
        int min = 100;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
        }
        return min;
    }
}

public class enunciado1 {

    public static void main(String[] args) {
        vectorE v1 = new vectorE();
        for (int i = 0; i < 20; i++) {
            v1.llenar();
        }

        v1.mostrar();
        System.out.println("menor numero ingresado en la lista es: " + v1.menor());
    }
}
