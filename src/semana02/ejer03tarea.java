/*La clase productos deberá tener los siguientes atributos: Código, descripción, cantidad y precio unitario

Crear una aplicación que realice los siguientes cálculos:

- Calcular el precio total (cantidad por el precio)

- Calcular el igv

- Calcular el total*/
package semana02;

class productos {

    private int codigo, cantidad;
    private float precio_unitario;
    private String descripcion;

    public productos(int codigo, int cantidad, float precio_unitario, String descripcion) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.descripcion = descripcion;
    }

    private float calcular_precio_total() {
        return cantidad * precio_unitario;
    }

    private double calcularIGV() {
        return calcular_precio_total() * 0.18;
    }

    public double precioConIgv() {
        return calcular_precio_total() + calcularIGV();
    }
public void mostrarInformacion(){
    System.out.println("-------------------------------------------------------------------------------------");
    System.out.println("codigo: "+this.codigo+" cantidad: "+this.cantidad+" precio unitario: "+ this.precio_unitario+" decripcion:"+ descripcion);
    System.out.println("precio total sin igv: "+calcular_precio_total()+" impuesto aplicado: "+calcularIGV()+" precio final: "+ precioConIgv());
System.out.println("-------------------------------------------------------------------------------------");
    
}

}

public class ejer03tarea {
    public static void main(String[] args) {
        productos p1= new productos(01,2,2, "producto1");
  p1.mostrarInformacion();
    }
}
