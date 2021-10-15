/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemath;

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
           double numero1 = Math.random() * 50;
        double numero2 = Math.random() * 50;

        numero1 = Math.ceil(numero1);
        numero2 = Math.ceil(numero2);

        double numeroMayor = Math.max(numero1, numero2);
        System.out.println("El número mayor es = " + numeroMayor);
        System.out.println("Número uno = " + numero1);
        System.out.println("Número dos = " + numero2);
    }
    
}
