/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
import static java.time.Clock.system;
import java.util.Scanner;
/**
 *
 * @author fabia
 */
public class dias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int mes;

        System.out.print("Digite el numero del mes: ");
        mes = sc.nextInt();

        switch (mes) {
            case 1 -> System.out.println("Enero tiene 31 dias.");
            case 2 -> System.out.println("Febrero tiene 28 dias, pero en año bisiesto son 29 dias.");
            case 3 -> System.out.println("Marzo tiene 31 dias.");
            case 4 -> System.out.println("Abril tiene 30 dias.");
            case 5 -> System.out.println("Mayo tiene 31 dias.");
            case 6 -> System.out.println("Junio tiene 30 dias.");
            case 7 -> System.out.println("Julio tiene 31 dias.");
            case 8 -> System.out.println("Agosto tiene 31 dias.");
            case 9 -> System.out.println("Septiembre tiene 30 dias.");
            case 10 -> System.out.println("Octubre tiene 31 dias.");
            case 11 -> System.out.println("Noviembre tiene 30 dias.");
            case 12 -> System.out.println("Diciembre tiene 31 dias.");
            default -> System.out.println("No introdujo un numero valido de mes.");
        }
    }
}
