/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadsemana9.pkg10;
import java.util.Scanner;
/**
 *
 * @author fabia
 */
public class Actividadsemana910 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int  e, Total;
     Scanner entregas = new Scanner (System.in);
         System.out.println("Introduzca el número de entregas de hoy");
         e = entregas.nextInt();
        Total = 1000 - e;
     if (Total<=200)
         System.out.println("¡ALERTA! El número de vacunas restantes es igual o menor a 200: "+Total);
        else 
        System.out.println("El numero de vacunas restantes es mayor a 200: "+Total);
    }
    
}
