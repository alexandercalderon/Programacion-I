/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
import static java.time.Clock.system;
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
        // TODO code application logic here
  int H,M,S;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        H =  sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M =  sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S =  sc.nextInt();
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)                                                          
           System.out.println("Hora correcta");
        else
            System.out.println("Hora incorrecta");

    }
    
}
