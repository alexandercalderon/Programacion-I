
package ClaseMath;


public class Ejercicio4 {


    public static void main(String[] args) {
        double Variable1, Variable2;
        int max = 50, min =1;
        Variable1 = Math.random()*(max - min)+min;
        Variable2 = Math.random()*(max - min)+min;
        Variable1 = Math.round(Variable1);
        Variable2 = Math.round(Variable2);
        System.out.println("Numero 1: "+Variable1);
        System.out.println("Numero 2: "+Variable2);
        System.out.println("Numero mayor = "+ Math.max(Variable1, Variable2));            
    }
    
}
