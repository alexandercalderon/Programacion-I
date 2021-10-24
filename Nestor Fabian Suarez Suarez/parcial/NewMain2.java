/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.Scanner;
/**
 *
 * @author fabia
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("nota entre 0 y 10: ");
        nota = sc.nextDouble();
        System.out.println("La calificación del alumno es ");
        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida");
        } else if (nota == 10) {
            System.out.println("Matrícula de Honor");
        } else if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");                                                                        
        } else if (nota >= 6) {
            System.out.println("Bien");
        } else if (nota >= 5) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Suspenso");
            }
    }
}


