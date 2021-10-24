/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadsemana9.pkg10;
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
         int  n, s=0, x;
     double p;
     
     Scanner teclado = new Scanner (System.in);
        System.out.println("cantida promedio: ");
        n=teclado.nextInt();
        
        for (int i=1; i<=n; i++)
        {
            System.out.println("Elemento ["+i+"]=");
            x=teclado.nextInt();
            
            s=s+x;
        }
        
        p=s/n;
        System.out.println("El promedio es: "+p); // TODO code application logic here
    }
    
}
