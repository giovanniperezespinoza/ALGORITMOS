package semana08;

/**
 * giovanni -> tiene 8 letras[8,7,9,3,4,7] Mayor 𝑥8+[𝑥]
 */
public class ejer01 {

    public static void main(String[] args) {
        int vec[] = {8, 7, 9, 3, 4, 7};
        System.out.println("Vector sin ordenar:");
        mostrarInt(vec);

        ordenar(vec);//se ordena el vector 

        System.out.println("\nVector ordenado de mayor a menor:");
        mostrarInt(vec);

        System.out.println("\nLos numeros pares del vector son:");
        pares(vec);//se muestra los numeros pares


        acu_promedio(vec);//calcula acumulado y promedio

        double vec1[] = operacion(vec);//se hace la operacion y se guarda en otro vector 
        System.out.println("\nEl vector con la operacion");
        mostrardou(vec1);//se muestra en el vector con datos double
    }

    public static void ordenar(int vec[]) {// se este metodo statico solo para esta practica
        int aux = 0;
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length - 1; j++) {
                if (vec[j] < vec[j + 1]) {
                    aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
        }
    }

    public static void mostrarInt(int vec[]) {
        for (int i : vec) { //se usa el fore para recorrer el vector 
            System.out.print("[" + i + "]"); //imprime los valores del vector 
        }
    }

    public static void acu_promedio(int vec[]) {
        double acu = 0, promedio;
        int cont = 0;
        for (int i : vec) {
            acu += i;
            cont++;
        }
        promedio = acu / cont;
        System.out.println("\nEL ACUMULADO ES: " + acu);
        System.out.println("\nEL PROMEDIO ES: " + promedio);
    }

    public static void pares(int ve[]) {
        for (int i : ve) {
            if (i % 2 == 0) {
                System.out.print("[" + i + "]");
            }
        }
    }

    public static double[] operacion(int vec[]) {//fucion hacer la operacion que retorna vr 
        double vr[] = new double[vec.length];
        int con = 0;
        for (int i : vec) {
            vr[con] = Math.pow(i, 8) + i;//se hace los calculos
            con++;
        }
        return vr;
    }

    public static void mostrardou(double vec[]) {
        for (double i : vec) { //se usa el fore para recorrer el vector 
            System.out.print("[" + i + "]"); //imprime los valores del vector 
        }
    }
}
