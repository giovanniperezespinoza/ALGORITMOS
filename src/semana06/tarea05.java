package semana06;

interface Figuraa {
    public double area();
}

class Cuadrado implements Figuraa {
    private double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}

class Circulo implements Figuraa {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double area() {
        return Math.pow(radio, 2) * Math.PI;
    }
}

public class tarea05 {

    public static void main(String[] args) {
        Figuraa f1 = new Circulo(3);
        Figuraa f2 = new Cuadrado(4);

        System.out.println("Area del circulo "+f1.area());
       
        System.out.println("Area del cuadrado "+ f2.area());
       
    }

}
