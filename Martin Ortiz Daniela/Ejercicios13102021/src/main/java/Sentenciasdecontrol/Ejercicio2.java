
package Sentenciasdecontrol;

import java.util.Scanner;

public class Ejercicio2 {

    
    public static void main(String[] args) {
       Scanner sentencia = new Scanner (System.in);
       int H,M,S;
        System.out.println("Dijite una hora: ");
        H = sentencia.nextInt();
        System.out.println("Digite los minutos: ");
        M = sentencia.nextInt();
        System.out.println("Digite los segundos: ");
        S = sentencia.nextInt();
       
        if(H>=0 && H<24) 
        if (M >=0 && M <=60)
        if (S>=0 && S <=60)
           System.out.println("Hora correcta");
        else
            System.out.println("Hora incorrecta");
    }
}
   