/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana04;

/**
 *
 * @author GIOVANNI


 */
class Perro{
private String nombre,raza;
private char sexo;

    public Perro(String nombre, String raza, char sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
    }
public String toString(){
return "Nombre: "+ this.nombre+" Raza: "+this.raza+" Sexo: "+this.sexo;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
public class ejer1 {
    public static void main(String[] args) {
        Perro p= new Perro("Dukesa","Chusco",'H');
        System.out.println("Original: "+ p.toString());

    }
    
}
 