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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero de mes: ");                                                        
        mes = sc.nextInt();
        switch (mes) {  //inicio del switch
                case 1 -> System.out.println("ENERO");
                case 2 -> System.out.println("FEBRERO");
                case 3 -> System.out.println("MARZO");
                case 4 -> System.out.println("ABRIL");
                case 5 -> System.out.println("MAYO");
                case 6 -> System.out.println("JUNIO");
                case 7 -> System.out.println("JULIO");
                case 8 -> System.out.println("AGOSTO");
                case 9 -> System.out.println("SEPTIEMBRE");
                case 10 -> System.out.println("OCTUBRE");
                case 11 -> System.out.println("NOVIEMBRE");
                case 12 -> System.out.println("DICIEMBRE");
                default -> System.out.println("Mes no válido");
        }
        
    }
}

         
         
     
     
    
   

 
