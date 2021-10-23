
package semana9.pkg10;
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
     
     int  n, s=0, x;
     double p;
     
     Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresar la cantidad de elementos a promediar: ");
        n=teclado.nextInt();
        
        for (int i=1; i<=n; i++)
        {
            System.out.println("Elemento ["+i+"]=");
            x=teclado.nextInt();
            
            s=s+x;
        }
        
        p=s/n;
        System.out.println("El promedio es: "+p);
    }
}
    
    
    

