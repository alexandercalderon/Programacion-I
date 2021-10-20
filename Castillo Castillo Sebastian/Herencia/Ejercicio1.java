
package herencia1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]){
        
        int suma = 0;
        int promedio;
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < 15; i++){
            System.out.println("Ingresa un valor: ");
            suma+= in.nextInt();
            
        }
        promedio = suma / 15;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
    
}
