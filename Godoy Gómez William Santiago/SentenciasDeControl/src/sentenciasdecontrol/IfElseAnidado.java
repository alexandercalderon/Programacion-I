
package sentenciasdecontrol;
import java.util.Scanner;
public class IfElseAnidado {
    public static void main(String[] args) {
     Scanner mayor = new Scanner (System.in);
     int x , y ;
     System.out.println("Digite un núnmero entero entre 1 y 10");
     x = mayor.nextInt();
     System.out.println("Digite otro núnmero entero entre 1 y 10");
     y = mayor.nextInt();
     if (x > 5)
     {
        if (y > 5) 
            System.out.println("x e y son > 5");
    }
     else 
         System.out.println("x es <= 5");
    
}
}
