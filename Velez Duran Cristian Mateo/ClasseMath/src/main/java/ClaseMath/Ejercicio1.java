
package ClaseMath;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Base, Exponente;
        System.out.println("Introduzca un numero: ");
        Base = sc.nextInt();
        System.out.println("Introduzca el eponente: ");
        Exponente = sc.nextInt();
        System.out.println("Exponente = "+ Math.pow(Base,Exponente));
    }
    
}
