
package ProgramacionJava;

import java.util.Scanner;


public class Ejercicio1 {

    
    public static void main(String[] args) {
      Scanner calificacion = new Scanner (System.in);
      int nota;
        System.out.println("Digite una nota: ");
        nota = calificacion.nextInt();
      if (nota > 10 ) {
                System.out.println("El nota " + nota + " es mayor a 10 ");                                             
            } else {
                System.out.println("El nota " + nota + " es menor a 10");     
            }
       
    }
}
    
         
    

