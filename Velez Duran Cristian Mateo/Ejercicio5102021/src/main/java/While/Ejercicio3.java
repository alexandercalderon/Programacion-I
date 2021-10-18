
package While;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
        int ContadorCalif =0;
        int Calificacion=0;
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        double promedio;
        
        System.out.println("Escriba la calificacion o -1 ");
        Calificacion = entrada.nextInt();
        while(Calificacion!=-1){
            total = total+Calificacion;
            ContadorCalif++;
            System.out.println("Escriba la calificaciono -1 ");
            Calificacion = entrada.nextInt();
        }
        if(ContadorCalif!=0){
        promedio = total/ContadorCalif;
        System.out.println("\nEl total de las calificaciones introducidads es: "+ContadorCalif);
        System.out.println("El promedio de la clase es %d\n"+promedio);
        }else{
            System.out.println("No se introdujeron calificaciones");
        }
    }
    
}
