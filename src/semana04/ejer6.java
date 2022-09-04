/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana04;

/**
 *
 * @author GIOVANNI
 */
class numero{
    int x;
    public numero(int r){
        x=r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
}
public class ejer6 {
    public static void main(String[] args) {
        numero p=new numero(20);
        modificar(p);
        System.out.println(p.getX());
    }

    private static void modificar(numero x) {
        x.setX(100);
    }
}