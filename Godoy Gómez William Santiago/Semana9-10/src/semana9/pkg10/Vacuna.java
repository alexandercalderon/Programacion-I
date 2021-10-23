
package semana9.pkg10;
import java.util.Scanner;
public class Vacuna {
    public static void main(String[] args) {
      int  P, T;
     Scanner entregas = new Scanner (System.in);
         System.out.println("Introduzca el número de entregas de hoy");
         P = entregas.nextInt();
        T = 1000 - P;
     if (T<=200)
         System.out.println("¡ALERTA! El número de vacunas restantes es igual o menor a 200: "+T);
        else 
        System.out.println("El numero de vacunas restantes es mayor a 200: "+T);
    }
}

             
    
    

