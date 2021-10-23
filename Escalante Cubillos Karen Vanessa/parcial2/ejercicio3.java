/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        System.out.println("Digíte numero del mes: ");
        int mes;
        mes = sc.nextInt();
        
      
        String nombre;
        
        
        switch (mes){
            case 1: nombre = "Enero";
            break;
            case 2: nombre = "Febrero";
            break;
            case 3: nombre = "Marzo";
            break;
            
            case 4: nombre = "Abril";
            break;
             case 5: nombre = "Mayo";
            break;
             case 6: nombre = "Junio";
            break;
             case 7: nombre = "Julio";
            break;
             case 8: nombre = "Agosto";
            break;
              case 9: nombre = "Septiembre";
            break;
             case 10: nombre = "Octubre";
            break;
             case 11: nombre = "Noviembre";
            break;
             case 12: nombre = "Diciembre";
            break;
            default:
                nombre = "Desconocido";
            
        }
        System.out.print("El mes es " +nombre);
        }
        }
        
