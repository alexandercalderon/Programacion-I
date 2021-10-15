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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           double nota1 = Math.floor(Math.random() * 11);
        double nota2 = Math.floor(Math.random() * 11);
        double nota3 = Math.floor(Math.random() * 11);
        double nota4 = Math.floor(Math.random() * 11);
        double nota5 = Math.floor(Math.random() * 11);

        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("Promedio de las notas = " + promedio);
    }
    
}
