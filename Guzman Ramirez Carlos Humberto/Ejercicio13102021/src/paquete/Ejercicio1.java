package paquete;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese el primer numero: "); float numero1 = scanner.nextFloat();
        System.out.print("Por favor ingrese el segundo numero: "); float numero2 = scanner.nextFloat();
        System.out.print("Por favor ingrese el tercer numero: "); float numero3 = scanner.nextFloat();
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El mayor de los numeros ingresados es el primero: " + numero1);
        }else if(numero2 > numero3){
            System.out.println("El mayor de los numeros ingresados es el segundo: " + numero2);
        }else if(numero3 > numero2){
            System.out.println("El mayor de los numeros ingresados es el tercero: " + numero3);
        }else{
            System.out.println("Los numeros ingresados son iguales");
        }

    }
}
