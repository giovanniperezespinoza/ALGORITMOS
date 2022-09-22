/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana07;

/**
 *
 * @author GIOVANNI
 */
abstract class animal {
// atributos metodos
// puede o no puede tener metdos abstractos

    abstract void comer();
}

class perro extends animal {

    @Override
    void comer() {
        System.out.println("come ricokan");
    }
}

class gato extends animal {

    @Override
    void comer() {
        System.out.println("come partes de pescado..");
    }
}

public class ejer02 {

    public static void main(String[] args) {
        animal perro1 = new perro();
        animal gato1 = new gato();

        perro1.comer();
        gato1.comer();
    }

}
