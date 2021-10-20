
package ClaseMath;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
  
Scanner num = new Scanner(System.in);
double nota1;
double nota2;
double nota3;
double nota4;
double nota5;
double promedio;

    System.out.println(" Digite el valor de la primer nota ");
    nota1 = num.nextDouble();
        System.out.println("");
        
    System.out.println(" Digite el valor de la segunda nota ");
    nota2 = num.nextDouble();
        System.out.println("");  
        
    System.out.println(" Digite el valor de la tercer nota ");
    nota3 = num.nextDouble();
        System.out.println("");
        
    System.out.println(" Digite el valor de la cuarta nota ");
    nota4 = num.nextDouble();
        System.out.println(""); 
    
    System.out.println(" Digite el valor de la quinta nota ");
    nota5 = num.nextDouble();
        System.out.println("");
        
    promedio = (nota1+nota2+nota3+nota4+nota5)/5 ;

System.out.println(" El promedio de notas es " + promedio );    

        
    }
    
}
