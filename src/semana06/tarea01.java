
package semana06;

import javax.swing.JOptionPane;

interface interfaceA{
void metodoA();
}

interface interfeceB{
void metodoB();
}

class ClassA{
protected int ID;
    public ClassA(int ID) {
        this.ID = ID;
    }
}

class classB extends ClassA implements interfaceA,interfeceB{
    public classB(int ID) {
        super(ID);
    }
@Override public void metodoA(){
    JOptionPane.showMessageDialog(null,"ejecutando el metodoA de la claseb con ID "+this.ID);
}
@Override public void metodoB(){
   JOptionPane.showMessageDialog(null,"ejecutando el metodoB de la claseb con ID "+this.ID);
}
}

public class tarea01{
    public static void main(String[] args) {
classB cb1=new classB(2);
cb1.metodoA();
cb1.metodoB();
//        interfaceA ia= new classB(20);
//ia.metodoA();
    }
}