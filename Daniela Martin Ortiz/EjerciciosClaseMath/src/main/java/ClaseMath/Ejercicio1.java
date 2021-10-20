
package ClaseMath;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner potencia = new Scanner (System.in);
        int base,exponente;
        System.out.println("Digite un numero base: ");
        base = potencia.nextInt();
        System.out.println("Digite un numero de exponente: \n");
        exponente = potencia.nextInt();
        
        System.out.println("El resultado de la potencia es: "+Math.pow(base, exponente));

    }
    
}
