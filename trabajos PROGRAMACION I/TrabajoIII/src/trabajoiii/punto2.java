package trabajoIII;
import java.util.Scanner;
     public class punto2{
        public static void main(String[]args){
            Scanner teclado=new
            Scanner (System.in);
               int H;
               int M;
               int S;
               
        System.out.println("digite el valor de H:");
                H = teclado.nextInt();
        System.out.println("digite el valor de M:");
                M = teclado.nextInt();
        System.out.println("digite el valor de S:");
                S = teclado.nextInt();
             if (H<=12&& M<=59 && S<=59) {
                 System.out.println("la hora valida es:");
             } else
                 System.out.println("la hora que no es valida es:");
             
        }    
        }
