package paquete;

import java.util.Scanner;

public class Ejercicio2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H, M, S;
        System.out.print("Por favor ingrese la hora: "); H = scanner.nextInt();
        System.out.print("Por favor ingrese los minutos: "); M = scanner.nextInt();
        System.out.print("Por favor ingrese los segundos: "); S = scanner.nextInt();
        if((H > 23 || M > 59 || S > 59) || (H < 0 || M < 0 || S < 0)){
            System.out.println("La hora ingresada no es valida");
        }else{
            System.out.println("La hora ingresada es valida :D");
        }
    }
}
