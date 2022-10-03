/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 * principio open close(abierta a extenciones pero cerrada a modificaciones) -
 * se utiliza polimorfismo trucos para detectar el error -si no cumple con
 * single responsabiliti -si las clases se modifican mucho
 *se aplica cuando neceitaremos cambios en el futuro
 * @author GIOVANNI
 */
interface Vehicle1 {

    void draw();
}

class car implements Vehicle1 {

    @Override
    public void draw() {
    }
}

class motorbike implements Vehicle1 {

    @Override
    public void draw() {
    }
}

//podemos implementar un truck si modificar nada
class truck implements Vehicle1{
@Override
public void draw(){
}
}
public class p2Openclose {

    public static void main(String[] args) {
        Vehicle1 car1 = new car();
        draw(car1);
    }

    public static void draw(Vehicle1 v1) {
        v1.draw();

    }
}
