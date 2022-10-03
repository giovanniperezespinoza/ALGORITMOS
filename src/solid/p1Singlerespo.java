/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 * principipo de resoposabilidad unica(unica razon para cambiar)o (hace una
 * unica cosa) trucos para detectar error de responsabilidad unica -metodos que
 * usan las propiedades -si estan involucradas dos capas de arquitectura -por el
 * numero de metodos publicos -por el numero de lineas -por el numero de imports
 * -cuesta mucho hacer test -se modifica todo si escribes una nueva
 * funcionalidad -proivido inprimir por pantalla dentro de una clase,porque
 * podemos imprimer en texto,html o lo que sea...
 *
 * @author GIOVANNI
 */
//class Vehicle{
//int WheelCont;
//int maxSpeed;
//
//}
//class VheiclePrint{
//void print(Vehicle v1){
//    System.out.println("wheeleCount= " +v1.WheelCont+"  max speed: "+v1.maxSpeed);
//}}
class Alumno {

    private String codigo;
    private String nombre;

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }

}

class InfoPrinter {

    public void mostrarInfo(Alumno a) {
        System.out.println("CODIGO: " +a.getCodigo() + "NOMBRE: " + a.getNombre());
    }
}

public class p1Singlerespo {

}
