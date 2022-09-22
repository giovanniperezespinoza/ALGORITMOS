package semana06;

/**
 * alicia(trabajos de investigacion)
 * @author GIOVANNI
 */
class primo {
public int cd=0;
    public void esprimo(int n) {
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.print("," + n);
     cd++;
        }
    }
}

public class ejerprimo {

    public static void main(String[] args) {
        primo p1 = new primo();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            p1.esprimo(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("\n\nhay : "+p1.cd+ " primos \n\nTIEMPO DE EJECUCION: " + (fin - inicio));
    }

}
