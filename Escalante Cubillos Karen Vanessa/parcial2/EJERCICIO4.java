/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        System.out.println("Digíte el dia : ");
        int dia;
        dia = sc.nextInt();
         

        if (dia <= 1 && dia <=3) {
            System.out.println("Lunes, si hay clase de programacion");
        } else if (dia == 2) {
            System.out.println("Martes, si hay clase de programacion");
        } else if (dia == 3) {
            System.out.println("Miercoles, si hay clase de programacion");
        } else if (dia == 4) {
            System.out.println("Jueves, no hay clase de programacion");
        } else if (dia == 5) {
            System.out.println("Viernes, no hay clase de programacion");
        } else if (dia == 6) {
            System.out.println("Sábado, no hay clase de programacion");
        } else if (dia == 7) {
            System.out.println("Domingo, no hay clase de programacion");
        } else {
            System.out.println("Número no valido");
        }
    }
}
  