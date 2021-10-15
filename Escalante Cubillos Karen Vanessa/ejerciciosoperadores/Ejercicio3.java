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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno = 8;
        int numeroDos = 2;
        int auxiliar;
        
        auxiliar = numeroUno;
        numeroUno = numeroDos;
        numeroDos = auxiliar;
        
        System.out.println("El número uno es:" +numeroUno);
        System.out.println("El número dos es:" +numeroDos);
                
    }
    
}
