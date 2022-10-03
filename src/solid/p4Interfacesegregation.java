/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 *
 * principio de segruegacion de interfaces es mejor tener varias interfaces
 * pequeñas una clase nunca deveria depender de metodos que no usan -funciones
 * deverian ser inmportantes para la interfaz -evitar problemas de
 * predicibilidad
 *
 * -como detectar errores metodos que no se implementan en las clases hijas usar
 * todos los metodos para reutilizar los codigos en un futuro
 *
 * @author GIOVANNI
 */
/*interface product{
final static String nombre="";
static final int stock=0;
int nomberofdisk=0;
int releaseDate=0;
}
interface AgeAware{
public int recomendedage =0;
}
class cd implements product{
}
class DVD implements product,AgeAware{
}
class User{
int age;
    public User(int age) {
this.age=age;
    }
}*/
interface AveDeCorral {

    float pesoMedio();   
}
interface AveNadador{
void nadar();
}
interface AveVolador{void volar();
}
class Pato implements AveDeCorral,AveNadador,AveVolador {

    @Override
    public float pesoMedio() {
        return 1.5f;
    }
    @Override
    public void nadar() {
    }
    @Override
    public void volar() {
    }
}
class Pollo implements AveDeCorral,AveVolador {

    @Override
    public float pesoMedio() {
        return 2.5f;
    }
    @Override
    public void volar() {
    }
}
class Pavo implements AveDeCorral,AveVolador {
    @Override
    public float pesoMedio() {
        return 4.5f;
    }
    @Override
    public void volar() {
    }
}

class Corral {

    AveDeCorral Lista[] = {new Pato(), new Pollo(), new Pavo()};

    public void mostrarPesoMedio() {
        for (AveDeCorral aC : Lista) {
            System.out.println(aC.pesoMedio());
         
        }
    }
}

public class p4Interfacesegregation {

}
