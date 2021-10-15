/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclasemath;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner entrada = new Scanner(System.in);
          double nota1,nota2,nota3,nota4,nota5,promedio;
          
         
          System.out.println("Ingrese la primera nota: ");
          nota1= entrada.nextDouble();
          System.out.println("Ingrese la segunda nota: ");
          nota2= entrada.nextDouble();
          System.out.println("Ingrese la tercera nota: ");
          nota3= entrada.nextDouble();
          System.out.println("Ingrese la cuarta nota: ");
          nota4= entrada.nextDouble();
          System.out.println("Ingrese la quinta nota: ");
          nota5= entrada.nextDouble();
          
          promedio = (nota1+nota2+nota3+nota4+nota5)/5;
          System.out.println("El promedio de la nota es: " +promedio);
    }
    
}
