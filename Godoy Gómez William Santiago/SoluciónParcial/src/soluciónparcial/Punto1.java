
package soluciónparcial;
import java.util.Scanner;
public class Punto1 {
    public static void main(String[] args) {
         Scanner mayoromenor = new Scanner (System.in);
         int Nota;
         System.out.println("Digite la nota del estudiante");
         Nota = mayoromenor.nextInt();
         if (Nota >= 10) {
             System.out.println("La nota es mayor que 10");   
         } else{
             System.out.println("La nota es menor que diez");  
                     }
        }

    }