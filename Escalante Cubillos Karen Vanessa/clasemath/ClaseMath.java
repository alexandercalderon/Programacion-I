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
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Valor absoluto= " +Math.abs(-123));
        System.out.println("Hipotenusa= " +Math.hypot(15,9));
        System.out.println("Logaritmo Natural= " +Math.log(4));
        System.out.println("Número mayor= " +Math.max(4, 9));
        System.out.println("Número menor= " +Math.min(4, 9));
        System.out.println("Potencia= " +Math.pow(5, 4));
        System.out.println("Número aleatorio= " +Math.random()*100);
        System.out.println("Número redondeado= " +Math.round(Math.random()*10));
        System.out.println("Raíz cuadrada= " +Math.sqrt(121));
        
        double valorPi=Math.PI;
        System.out.println("Valor pi:" +valorPi);
        
        double raiz =Math.sqrt(25);
        System.out.println("Raiz: " +raiz);
    }
    
}
