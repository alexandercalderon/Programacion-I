/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios13.pkg10.pkg2021;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte H, M, S;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca LA HORA:");
        H = sc.nextByte();
        System.out.println("Introduzca LOS MINUTOS:");
        M = sc.nextByte();
        System.out.println("Introduzca LOS SEGUNDOS:");
        S = sc.nextByte();
        
        if ( !(H>=0 && H<=12) || !(M>=0 && M<=59) || !(S>=0 && S<=59))
        {
            System.out.println("La hora dada es incorrecta");
        }
        else {
                System.out.println("La hora dada es correcta");
        }
 