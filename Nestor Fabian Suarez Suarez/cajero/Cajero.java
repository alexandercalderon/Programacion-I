/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;
import java.util.Scanner;
/**
 *
 * @author fabia
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             double saldo = 1.000;
        int c = 0;
   
       while (c<=3){
          Scanner entrada=new Scanner (System.in);
          int contrasena = 2403;
          System.out.print("Ingrese la contraseña");
          contrasena = entrada.nextInt();
          
          if(contrasena==2403){
          c=4;
          int respuesta=0;
          if (respuesta==4) {
              
          }
          else {
              Scanner respuesta2 =new Scanner (System.in);
              System.out.print("Presione 1 para consultar saldo");
              System.out.print("Presione 2 para retirar saldo");
              System.out.print("Presione 3 para salir");
              respuesta = respuesta2.nextInt();
              
              switch(respuesta){
                  case 1: System.out.print("Su saldo actual es de: $"+ saldo);
                  case 2:
                     double retiro;
                     Scanner menu=new Scanner (System.in);
                     System.out.print("Ingrese la cantidad a retirar: "+ saldo);
                     retiro = menu.nextDouble();
                     if(retiro>saldo){
                         saldo=saldo-retiro;
                         System.out.print("Su nuevo saldo es: $"+ saldo);
                     }
                     else{
                         System.out.print("Su cantidad supera el saldo");
                         System.out.print("Su saldo actual es: $"+saldo);
                     }   
              } 
          }
          }
          else {
              c++;
              if(c==3) {
                  System.out.print("Haz fallado los 3 intentos");
              }
              else {
                  System.out.print("La contraseña es incorrecta");
              }
          } 
    }
    }
}






