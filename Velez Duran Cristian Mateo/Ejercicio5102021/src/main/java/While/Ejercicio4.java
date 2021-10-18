
package While;

import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aprobados=0;
        int reprobados=0;
        int ContadorEstudiantes = 1;
        int Resultado;
        while(ContadorEstudiantes<=10){
            System.out.println("Escriba el resultado (1 = aprobado) (2 = reprobado)");
            Resultado = entrada.nextInt();
            if(Resultado ==1){
                aprobados++;
            }else{
                reprobados++;
            }
            ContadorEstudiantes++;
        }
        System.out.printf("Arpobados: %d\nReprobados: %d\n", aprobados, reprobados);
        
        if(aprobados>8){
            System.out.println("Aumentar colegiatura");
        }
    }
    
}
