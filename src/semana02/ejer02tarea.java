package semana02;

import java.util.Scanner;

class Circulo {

    private int radio;
    private double area;

    public Circulo(int radio) {
        this.radio = radio;
    }

    private void Calculo() {
        this.area = Math.PI * Math.pow(radio, 2);
    }

    public void Mostrar() {
        Calculo();
        System.out.println("El triangulode radio " + radio + " tiene como area: " + area + " unidades cuadradas.");
    }
}

public class ejer02tarea {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("DIGITE LA LONGITUD DEL RADIO: ");

        int radio = cin.nextInt();
        Circulo circulo1 = new Circulo(radio);

        circulo1.Mostrar();
    }
}
