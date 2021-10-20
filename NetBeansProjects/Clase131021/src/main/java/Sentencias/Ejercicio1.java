 
package Sentencias;

import java.util.Scanner;
 
public class Ejercicio1 {

  
    public static void main(String[] args) {
 
Scanner teclado = new Scanner(System.in); 
 
int A;
int B;
int C;

System.out.println(" Intruduzca el valor para asignar a A: ");   
A = teclado.nextInt();

System.out.println(" Intruduzca el valor para asignar a B: ");   
B = teclado.nextInt();

System.out.println(" Intruduzca el valor para asignar a C: ");   
C = teclado.nextInt();

if (A>B && A>C)  {
    System.out.println(" El numero mayor es : "+A);  
    
} else if (B>C) { 
    System.out.println(" El numero mayor es :"+B);
    
}  else {
    System.out.println(" El numero mayor es :"+C);
    }
     
}
}