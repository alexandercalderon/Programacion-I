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
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);

        int n1, n2, n3, nm;

        System.out.print("Digite un número entero: ");
        n1 = sc.nextInt();
        System.out.print("Digite un número entero: ");
        n2 = sc.nextInt();
        System.out.print("Digite un número entero: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            nm = Math.max(n1, n3);
        }
        else {
            nm = Math.max(n2, n3);
        }
        System.out.printf("El numero mayor es: %d", nm); 
    }
    
}
