/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 * los modulos de alto nivel no deven depender de los modulos de vajo nivel.
 * ambos deven depender de abstracciones. las abstraciones no deven depender de
 * los detalles los detalles deven depender de las abastraciones modulo de alto
 * nivel-> interfaz adaptador modulo de vajo nivel
 */
/**
 *PRINCIPIO DE INVERSION DE DEPENDENCIAS
-LAS CLASES DE ALTO NIVEL NO DEBERIAN DEPENDER DE LAS CLASES DE bajo nivel
sino que deverian depender de clases abstractas.
como detectar incumplimiento
*uso de una clase compleja dentro de otra clase
*

 * @author GIOVANNI
 */
interface ProcesadorPago {

    void pagar();
}

class AdaptadorBCP implements ProcesadorPago {

    protected BCPApi bc1;

    public AdaptadorBCP(BCPApi bc1) {
        this.bc1 = bc1;
    }

    @Override
    public void pagar() {
        this.bc1.cobrar();
    }
}

class AdaptadorYape implements ProcesadorPago {

    protected YapeApi y1;

    public AdaptadorYape(YapeApi y1) {
        this.y1 = y1;
    }

    @Override
    public void pagar() {
        this.y1.cobrarcliente();
    }
}

class BCPApi {

    public void cobrar() {
    }
}

class YapeApi {

    public void cobrarcliente() {
    }
}

class Feria {

    protected ProcesadorPago pp1;

    public Feria(ProcesadorPago pp1) {
        this.pp1 = pp1;
    }

    public void vender() {
        pp1.pagar();
    }

}


public class p5DependeciaInversion
 {

}
