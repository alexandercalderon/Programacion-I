package paquete;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes; 
        System.out.println("Por favor ingrese el numero correspondiente a un mes del año(1-12): ");
        mes = scanner.nextInt();
        if(mes > 0 && mes < 13){
            switch(mes){
                case 1:  case 3: case 5: case 6: case 8: case 10:  case 12:
                    System.out.println("El mes ingresado corresponden a un mes con treint dias (30)");
                break;
                default: 
                    System.out.println("El mes ingresado no corresponde a un mes con treinta dias (30)");
            }
        }
    }
 
}
