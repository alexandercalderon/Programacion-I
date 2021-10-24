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
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner escaner = new Scanner(System.in);
        int nota;
        System.out.println("nota ");
        nota = escaner.nextInt();
 
 
        if (nota >= 10){
            System.out.println("nota mayor que 10");
        }else{
            System.out.println("nota menor que 10");
    }
    }

}