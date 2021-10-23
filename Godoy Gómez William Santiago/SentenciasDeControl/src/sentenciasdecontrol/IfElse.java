
package sentenciasdecontrol;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
      Scanner calificacionEstudiante= new Scanner (System.in);
     int Nota;
     System.out.println("Digite la nota del estudiante");
         Nota = calificacionEstudiante.nextInt();
         if ( Nota >= 90)
            System.out.println("A");
         else if (Nota >=80)           
            System.out.println("B");
         else if (Nota >=70)           
            System.out.println("C");
         else if (Nota >=60)           
            System.out.println("D");
         else           
            System.out.println("F");
    }
   
}