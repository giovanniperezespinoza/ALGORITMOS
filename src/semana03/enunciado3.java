/*
 Enunciado03.java
Crear un clase perro (name, sexo) y almacenarlo en un vector de
 tamaño 10, se pide llenar los datos con valores aleatorios y mostrar en pantalla.
package semana03;
 */
package semana03;
import java.util.Random;
interface constante {

    int n = 100;
}

class perro {

    private String name, sexo;

    public perro(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public String Informacion() {
        return "NOMBRE: " + this.name + "\t Sexo: " + this.sexo;
    }
}

class criadero implements constante {

    String ListaPerros[] = {"fiufiu", "pepe", "firulays", "brand", "chicoca", "fina", "ush", "gaus", "fer", "liza"};
    perro galpon[] = new perro[n];
    int con = 0;

    public void acoger() {
        perro p1 = new perro(ListaPerros[aleatoreo(0, 9)], elegir_genero());
        galpon[con] = p1;
        con++;
    }

    public void mostrar() {
        int i = 0;
        do {
            System.out.println(galpon[i].Informacion());
            i++;
        } while (i != con);
    }

    private int aleatoreo(int min, int max) {
        Random rd = new Random();
        return rd.nextInt(max - min + 1) + min;
    }

    private String elegir_genero() {
        Random rd = new Random();
        return rd.nextBoolean() == true ? "macho" : "hembra";
    }
}
public class enunciado3 {

    public static void main(String[] args) {
        criadero c1 = new criadero();
        for (int i = 0; i < 10; i++) {
            c1.acoger();
        }
        c1.mostrar();
    }
}
