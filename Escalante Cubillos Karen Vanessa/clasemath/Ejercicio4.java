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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    double Numero1= Math.random()*50+1;
    double Numero2= Math.random()*50+1;
     
    System.out.println("Número redondeado= " +Math.round(Numero1*10));
    System.out.println("Número redondeado= " +Math.round(Numero2*10));
    
    System.out.println("El número mayor es: " +Math.max(Numero1, Numero2));
    }
    
}
