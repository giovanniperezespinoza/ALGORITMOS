/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana04;

/**
 *
 * @author GIOVANNI
 */
interface constante{
int n=20;
}
class fruta{
private String name;
private float price;
public fruta(String name,float price){
this.name=name;
this.price=price;
}
public String informacion(){
return "Nombre: "+ name+" Precio: "+price;
}

}
class Canasta implements constante{
fruta lista[]=new fruta[n];
int cont=0;
void llenar(fruta p){
lista[cont++]=p;

}
void mostrar(){
for(fruta e: lista){
    System.out.println(p.informacion);
}
}
}
public class ejer8 {
    public static void main(String[] args) {
        Canasta canasta1=new Canasta();
   canasta1.llenar(new fruta("platano",1));
    }
}
