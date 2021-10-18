
package Ejercicios;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, result;
        System.out.println("Introduzca el valor del primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca el valor del segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Introduzca el valor del tercer numero: ");
        num3 = sc.nextInt();
        result = Math.max(num1, num2);
        if(num3>result){
            System.out.println("El numero "+num3+"Es el mayor");
        }else if(result>num3 && result ==num1){
            System.out.println("El numero "+num1+"Es el mayor");
        }else{
            System.out.println("El numero "+num2+"Es el mayor");
        }
        
    }
    
}
