package semana07;

abstract class Pokemon {//clase abstracta: que es

    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();

    protected abstract void atacarAraniazo();

    protected abstract void atacarMordico();

}

interface Ielectrico {//inreface: que hacen 

    public void atacarImpacttrueno();
}

interface IFuego {

    public void atacarPunioFuego();

    public void atacarLanzaLLamas();
}

interface IAgua {

    public void atcarHidrobomba();

    public void atacarBurbuja();

    public void atacarPistolaAgua();
}

interface IPlanta {

    public void atacarDrenaje();

    public void atacarParalizar();
}

class Pikachu extends Pokemon implements Ielectrico {


    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy PIcachu, este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy Picachu, este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordico() {
        System.out.println("hola soy PIcachu, este es mi ataque mordirsco");

    }

    @Override
    public void atacarImpacttrueno() {
        System.out.println("hola soy PIcachu, este es mi ataque impactrueno");
    }
}

class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy Charmander, este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy Charmander, este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordico() {
        System.out.println("hola soy Charmander, este es mi ataque mordirsco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("hola soy Charmander, este es mi ataque puniofuego");
    }

    @Override
    public void atacarLanzaLLamas() {
        System.out.println("hola soy Charmander, este es mi ataque lanzallamas");
    }
}

class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy bulbasaur, este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy bulbasaur, este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordico() {
        System.out.println("hola soy bulbasaur, este es mi ataque mordirsco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("hola soy bulbasaur, este es mi drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("hola soy bulbasaur, este es mi ataque paralizar");
    }

}

class Squirtle extends Pokemon implements IAgua {

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy Squirtle, este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy Squirtle, este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordico() {
        System.out.println("hola soy Squirtle, este es mi ataque mordirsco");
    }

    @Override
    public void atcarHidrobomba() {
        System.out.println("hola soy Squirtle, este es mi ataque hidribomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("hola soy Squirtle, este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("hola soy Squirtle, este es mi ataque agua");
    }

}

public class ejer06 {

    public static void main(String[] args) {
   Squirtle sq1=new Squirtle();
   Charmander cha1=new Charmander();
Bulbasaur bul1=new Bulbasaur();
Pikachu pic1=new Pikachu();
sq1.atacarAraniazo();
sq1.atcarHidrobomba();
pic1.atacarImpacttrueno();
    }
}
