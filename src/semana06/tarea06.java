package semana06;

import javax.swing.JOptionPane;

interface Rotable {

    public void rotar();
}

interface Dibujable {

    public void dibujar();
}

abstract class Figura6 {

    public abstract double area();
}

class Cuadrado6 extends Figura6 implements Dibujable {

    private double lado;

    public Cuadrado6(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        JOptionPane.showMessageDialog(null, "*Cuadrado dibujado\ncon exito*", "cuadrado", 3);
    }

    @Override
    public double area() {
        return lado * lado;
    }
}

class Circulo6 extends Figura6 implements Dibujable, Rotable {

    private double radio;

    public Circulo6(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        JOptionPane.showMessageDialog(null, "*CIRCULO DIBUJADO CON EXITO*", "circulo", 1);
    }

    @Override
    public double area() {
        return Math.pow(radio, 2) * Math.PI;
    }

    @Override
    public void rotar() {
        JOptionPane.showMessageDialog(null, " rotando !!", "circulo", 0);
    }
}

class MostrarArea {

    public void mostrar_area(Figura6 figura) {
        JOptionPane.showMessageDialog(null, " A= "+figura.area(), "AREA", -1);
    }
}
// 

public class tarea06 {

    public static void main(String[] args) {
        boolean bandera = true;
        String fig[] = {"CUADRADO", "CIRCULO","SALIR"};
        String op_cuad[] = {"DIBUJAR", "AREA", "MENU PRINCIPAL"};
        String op_cir[] = {"DIBUJAR", "AREA", "ROTAR", "MENU PRINCIPAL"};
        MostrarArea ma1 = new MostrarArea();
        do {
            int opcion = JOptionPane.showOptionDialog(null, "OPCIONES: ", "FIGURAS", 0, -1, null, fig, 0);
            switch (opcion) {
                case 0:
                    Cuadrado6 c1 = new Cuadrado6(4);
                    do {
                        opcion = JOptionPane.showOptionDialog(null, "\t CUADRADO ... ", "metodos", 0, -1, null,op_cuad, 0);
                        switch (opcion) {
                            case 0:
                                c1.dibujar();
                                break;
                            case 1:
                                ma1.mostrar_area(c1);
                                break;
                            default:
                                break;
                        }
                    } while (opcion != 2);
                    break;
                case 1:
                    Circulo6 cr = new Circulo6(4);
                    do {
                        opcion = JOptionPane.showOptionDialog(null, "\tCIRCULO ... ", "metodos", 0, -1, null, op_cir, 0);
                        switch (opcion) {
                            case 0:
                                cr.dibujar();
                                break;
                            case 1:
                                ma1.mostrar_area(cr);
                                break;
                            case 2:
                                cr.rotar();
                            default:
                                break;
                        }
                    } while (opcion != 3);
                    break;
                case 2:
                 bandera=false;
                    break;
                default:
                    break;
            }
        } while (bandera);
    }
}
