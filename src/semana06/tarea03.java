
package semana06;
interface Interface1{
}
interface Interface2{
}
interface Interface3{
}
class ClaseBase{
}
class ClaseDerivada extends ClaseBase implements Interface1,Interface2,Interface3{

}
public class tarea03 {
    public static void main(String[] args) {
        ClaseDerivada cd1=new ClaseDerivada();
    }
}
