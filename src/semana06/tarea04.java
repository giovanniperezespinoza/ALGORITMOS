package semana06;

abstract class Figura {
    
    protected int x;
    protected int y;
    
    public abstract double area();
}

class cuadrado extends Figura {
    
    private int lado;
    
    public cuadrado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public double area() {
        return this.lado * this.lado;
    }
}

class circulo extends Figura {
    
    private int radio;
    
    public circulo(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}

class PrintFigura {

    public void PrintFigura(Figura figura) {
        System.out.println("Area: " + figura.area());
    }
}

public class tarea04 {

    public static void main(String[] args) {
        Figura f1 = new circulo(3);
        Figura f2 = new cuadrado(4);
        PrintFigura p1 = new PrintFigura();
        System.out.println("area del circulo");
        p1.PrintFigura(f1);
        System.out.println("area del cuadrado");
        p1.PrintFigura(f2);
    }
}
