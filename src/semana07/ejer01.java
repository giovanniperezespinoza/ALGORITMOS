
package semana07;

interface Rotable{
 void rotar();
}

interface figura {

    public abstract void calcuraArea();
}

interface dibujable {

    public abstract void dibujar();
}

class circulo implements Rotable,figura{

    private int radio;

    public circulo(int radio) {
        this.radio = radio;
    }
@Override 
public void rotar(){
}
@Override
public void calcuraArea(){
}
    
}

public class ejer01 {

}
