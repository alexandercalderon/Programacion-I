 
package Sentencias;

import java.util.Scanner;
 
public class Ejercicio2 {

     
    public static void main(String[] args) {
 
Scanner teclado = new Scanner(System.in); 
int H;
int M;
int S;

System.out.println(" Intruduzca el valor para asignar a H: ");   
H = teclado.nextInt();

System.out.println(" Intruduzca el valor para asignar a M: ");   
M = teclado.nextInt();

System.out.println(" Intruduzca el valor para asignar a S: ");   
S = teclado.nextInt();

if (H<= 12 && M<=59 && S<=59 )  {
  
    System.out.println(" la hora es valida ");
    
    
    } else {
 
    System.out.println(" la hora no es valida ");     
}
}
 }