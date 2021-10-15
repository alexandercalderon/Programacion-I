/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosoperadores;

/**
 *
 * @author USUARIO
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ladoCuadrado = 8;
         System.out.println("El área de un cuadrado es: " + (ladoCuadrado * ladoCuadrado));
         System.out.println("El perímetro de un cuadrado es: " + (ladoCuadrado * 4));
         
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8, ladoDosTriangulo = 8;
        
        System.out.println("El área del Triangulo es: " + (baseTriangulo * alturaTriangulo));
        System.out.println("El perímetro del Triangulo es: " + (alturaTriangulo + ladoUnoTriangulo + ladoDosTriangulo));
        
        int baseRectangulo = 8;
        int alturaRectangulo = 6;
        
        System.out.println("El área de un rectangulo es: " + (baseRectangulo * alturaRectangulo));
        System.out.println("El perímetro de un rectangulo es: " + ((baseRectangulo*2)+(alturaRectangulo*2)));
    }
    
}
