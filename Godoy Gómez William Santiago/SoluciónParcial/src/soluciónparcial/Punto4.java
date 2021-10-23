
package soluciónparcial;
import java.util.Scanner;
public class Punto4 {
    public static void main(String[] args) {
        Scanner dia = new Scanner(System.in);
        int Semana;
        System.out.println("Elija el numero del dia de la semana");
        Semana = dia.nextInt();
        if(Semana < 1 && Semana > 7)                                   
            System.out.println("Elija un número del 1 al 7");
        else{  
            switch(Semana){                                  
                case 1 -> System.out.print("Si hay clase de programación");
                case 2 -> System.out.print("Si hay clase de programación");
                case 3 -> System.out.print("Si hay clase de programación");
                case 4 -> System.out.print("No hay clase de programación");
                case 5 -> System.out.print("No hay clase de programación");
                case 6 -> System.out.print("No hay clase de programación");
                case 7 -> System.out.print("No hay clase de programación");
              
            }
        }
    }
}
           
