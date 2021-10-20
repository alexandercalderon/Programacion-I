 
package Sentencias;

import static java.lang.System.in;
import java.util.Scanner;

public class Ejercicio3 {

  
    public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in); 

int mes;

 System.out.println(" Ingrese el numero de mes :");
 mes = teclado.nextInt();
 
if (mes == 4 || mes == 6  || mes == 9 || mes == 11  ) {
 
    System.out.println(" el mes tiene 30 dias"); 
    
 
 } else  {
 
    System.out.println(" ERROR el mes tiene mas de 30 dias"); 
}
    
}
}