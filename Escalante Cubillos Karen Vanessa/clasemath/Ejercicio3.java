/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemath;

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
        double Nota1 = Math.random()*10;
        double Nota2 = Math.random()*10;
        double Nota3 = Math.random()*10;
        double Nota4 = Math.random()*10;
        double Nota5 = Math.random()*10;
       
        double promedio = (Nota1+Nota2+Nota3+Nota4+Nota5)/5; 
        System.out.println("El promedio es: " +promedio);
        
        
    }
    
}
