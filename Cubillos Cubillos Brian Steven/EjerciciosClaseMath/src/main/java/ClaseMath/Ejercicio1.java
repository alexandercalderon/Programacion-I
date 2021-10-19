
package ClaseMath;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        int base;
        int exponente;
        double potencia;
        
        Scanner bs = new Scanner(System.in);
        System.out.println("Ingrese la base");
        base = bs.nextInt();
        
        Scanner ex = new Scanner(System.in);
        System.out.println("Ingrese el exponente");
        exponente = ex.nextInt();
                
        potencia = Math.pow(base,exponente);
        System.out.println("La potencia es: "+potencia);
    }
    
}
