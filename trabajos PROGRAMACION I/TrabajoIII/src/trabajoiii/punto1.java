package TrabajoIII;
import java.util.Scanner;
public class punto1{
    public static void main (String[] args){
       Scanner teclado = new
            Scanner (System.in);
        
        int A;
        int B;
        int C;
        System.out.println ("digite el valor para A:");
        A = teclado.nextInt();
        System.out.println("digite el valor para B:");
        B = teclado.nextInt();
        System.out.println("digite el valor para C: ");
        C = teclado.nextInt();
        
        if (A>B && A>C){
            System.out.println("numero mayor:"+A); 
        } else if (B>C){
            System.out.println("numero mayor:"+B);           
        }else{
            System.out.println("numero mayor:"+C);
        }

    }
}