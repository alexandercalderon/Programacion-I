
package soluciónparcial;
import java.util.Scanner;
public class Punto2 {
    public static void main(String[] args) {
        Scanner aprobacion = new Scanner (System.in);
        double Nota;
     System.out.println("Digite la nota del estudiante");
         Nota = aprobacion.nextInt();
         if (Nota >= 10){
                 System.out.println("Nota no valida");
         }else if (Nota <= 0){    
                 System.out.println("Nota no válida");
         }else if (Nota >= 10){
             System.out.println("Matricula de Honor"); 
         }else if (Nota >= 9){          
            System.out.println("Sobresaliente");
         }else if (Nota >= 8){           
            System.out.println("Notable");
         }else if (Nota >= 7){           
            System.out.println("Bien");
         }else if (Nota >= 6){          
            System.out.println("Suficiente");
         }else if ( Nota <= 5){
            System.out.println("Suspenso");
         }
    }
}
        
              
    
    

