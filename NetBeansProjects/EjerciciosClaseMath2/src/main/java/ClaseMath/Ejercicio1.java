
package ClaseMath;

import java.util.Scanner;

public class Ejercicio1 {

    
public static void main(String[] args) {
  
   Scanner teclado = new Scanner(System.in);       
   int base;
   int exponente;
 
System.out.println(" Intruduzca el valor de la base: ");   
base = teclado.nextInt();

System.out.println(" Introduzca el valor del exponente: ");
exponente = teclado.nextInt();

System.out.println(" Resultado => " + Math.pow(base,exponente));

        
    }
    
}
