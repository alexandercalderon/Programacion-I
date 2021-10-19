
package ClaseMath;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        double raiz;
        System.out.println("Raiz de 2 es :"+Math.sqrt(2));
        System.out.println("Raiz de 8 es :"+Math.sqrt(8));
        System.out.println("Raiz de 9 es :"+Math.sqrt(9));
        System.out.println("Raiz de 27 es :"+Math.sqrt(27));
        System.out.println("Raiz de 28 es :"+Math.sqrt(28));
        System.out.println("Raiz de 55 es :"+Math.sqrt(55));
        System.out.println("Raiz de 121 es :"+Math.sqrt(121));
        
         Scanner rz = new Scanner(System.in);
         System.out.println("Raiz cuadrada de: ");
         raiz = rz.nextDouble();
        System.out.println(" "+Math.sqrt(raiz));
        
    }
    
}
