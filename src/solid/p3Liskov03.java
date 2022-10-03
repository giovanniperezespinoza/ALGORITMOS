/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 * principio de sustitucion de liskov clases hijas puedan sustituir a la clase
 * padre trucos para detectar errores -metodo sobrescrito no hace nada o manda
 * una eception ejemplo el elefante. es una animal que no puede saltar-
 *
 * @author GIOVANNI
 */

/*class animal{
void walk(){
}
}

class animalligero extends animal{
void jump(){
}
}

class Elephant extends animal{

}

class dog extends animalligero{
}

public class p3Liskov03 {
    public static void main(String[] args) {
        
    }
public static void jumph(animalligero a){
a.walk();
a.jump();
a.walk();
}
}*/
//interface AveDeCorral {
//
//    float pesoMedio();
//}
//
//interface aveDecorralAgua extends AveDeCorral {
//
//    void nadar();
//}
//
//class Pato implements aveDecorralAgua {//el pato si puede nadar 
//
//    @Override
//    public float pesoMedio() {
//        return 1.5f;
//    }
//
//    @Override
//    public void nadar() {
//        System.out.println("el pato esta nadando");
//    }
//}
//
//class Pollo implements AveDeCorral { //el pollo  no puede nadar
//
//    @Override
//    public float pesoMedio() {
//        return 2.5f;
//    }
//}
//
//class Pavo implements AveDeCorral {//el pavo no puede nadar
//
//    @Override
//    public float pesoMedio() {
//        return 4.5f;
//    }
//}
//
//class Corral {
//
//    AveDeCorral Lista[] = {new Pato(), new Pollo(), new Pavo()};
//
//    public void mostrarPesoMedio() {
//        for (AveDeCorral aC : Lista) {
//            System.out.println(aC.pesoMedio());
//        }
//    }
//}
//
//public class p3Liskov03 {
//
//    public static void main(String[] args) {
//
//    }
//
//}
