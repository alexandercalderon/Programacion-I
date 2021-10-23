
package soluciónparcial;
import java.util.Scanner;
public class Punto3 {
    public static void main(String[] args) {
    Scanner Mes = new Scanner(System.in);
        int Numero;
        System.out.println("Elija el numero que desee");
        Numero = Mes.nextInt();
        if(Numero < 1 && Numero > 12)                                   
            System.out.println("No es un numero valido (Hay 12 meses)");
        else{  
            switch(Numero){                                  
                case 1 -> System.out.print("Enero");
                case 2 -> System.out.print("Febrero");
                case 3 -> System.out.print("Marzo");
                case 4 -> System.out.print("Abril");
                case 5 -> System.out.print("Mayo");
                case 6 -> System.out.print("Junio");
                case 7 -> System.out.print("Julio");
                case 8 -> System.out.print("Agosto");
                case 9 -> System.out.print("Septiembre");
                case 10 -> System.out.print("Octubre");
                case 11 -> System.out.print("Noviembre");
                case 12 -> System.out.print("Diciembre");
            }
        }
    }
}
        
    
    

