/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.Scanner;
/**
 *
 * @author fabia
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dias = new Scanner (System.in);
  System.out.println("ingrese un numero par saberl el dia de la semana y si tienes clase");
  int numero = 0;
  while ( numero >7 || numero<1){
   numero =dias.nextInt(); 
  
  switch(numero){
    case 1 -> System.out.println("lunes tienes clase de programacion");
    case 2 -> System.out.println("martes tienes clase de programacion");
    case 3 -> System.out.println("miercoles tienes clase de programacion");
    case 4 -> System.out.println("jueves no tienes clase de programacion");
    case 5 -> System.out.println("viernes no tienes clase de programacion");
    case 6 -> System.out.println("sabado no tienes clase de programacion");
    case 7 -> System.out.println("domingo no tienes clase de programacion");
    default -> System.out.println("error ");
  }
  
  }  // TODO code application logic here
    }
    
}
