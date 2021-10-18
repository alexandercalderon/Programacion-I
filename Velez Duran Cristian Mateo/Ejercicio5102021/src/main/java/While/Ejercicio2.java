
package While;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
        int ContadorCalif =1;
        int Calificacion;
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        int promedio;
        
        while(ContadorCalif<=10){
            System.out.println("Escriba la calificacion: ");
            Calificacion = entrada.nextInt();
            total = total+Calificacion;
            ContadorCalif++;
        }
        promedio = total/10;
        System.out.println("\nEl total de las calificaciones es: "+total);
        System.out.println("El promedio de la clase es %d\n"+promedio);
        
        
    }
    
}
