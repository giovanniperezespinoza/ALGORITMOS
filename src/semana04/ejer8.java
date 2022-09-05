
package semana04;

interface constante {

    int n = 20;
}

class fruta {

    private String name;
    private float price;

    public fruta(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String informacion() {
        return "Nombre: " + name + " Precio: " + price;
    }

}

class Canasta implements constante {

    fruta lista[] = new fruta[n];
    int cont = 0;

    void llenar(fruta p) {
        lista[cont++] = p;

    }

    void mostrar() {
        for (fruta e : lista) {
            System.out.println(e.informacion());
        }
    }
}

public class ejer8 {

    public static void main(String[] args) {
        Canasta canasta1 = new Canasta();
        canasta1.llenar(new fruta("platano", 1));
canasta1.mostrar();
    }
}
