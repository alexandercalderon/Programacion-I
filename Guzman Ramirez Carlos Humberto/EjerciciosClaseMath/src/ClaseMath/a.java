package ClaseMath;

import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double matriz[][] = new double[3][3];
        double suma = 0, numeroMayor = 0;
        int mayorFila = 0, mayorColumna = 0;
        double columnaConSumaMayor = 0;
        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.printf("Por favor ingrese un numero[%d][%d]: ", i, j);
                double numero = scanner.nextInt();
                suma += numero;
            }
            if (suma > mayorFila) {
                mayorFila = i;
            }
        }
        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += matriz[j][i];
                if( numeroMayor <= matriz[i][j] ){
                    numeroMayor = matriz[i][j];
                }
            }
            if (suma >= columnaConSumaMayor) {
                columnaConSumaMayor = suma;
                mayorColumna = i;
            }
        }

        System.out.println("El mayor numero es: " + numeroMayor);
        System.out.println("La mayor fila es: " + mayorFila);
        System.out.println("La mayor columna es: " + mayorColumna);
    }
}
