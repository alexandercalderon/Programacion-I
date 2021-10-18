
package Switch;

import java.util.Scanner;

public class PruebaLibrodeCalificaciones {


    public static void main(String[] args) {
        String nombreDelCurso;
        int total=0;
        int ContadorCaliff=0;
        int aCuenta=0;
        int bCuenta=0;
        int cCuenta=0;
        int dCuenta=0;
        //private int eCuenta;
        int fCuenta=0;
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        System.out.printf(
        "Escriba las calificaciones enteras en el rango de 0 a 100");
        System.out.println("Escriba el indicador de fin en el archivo para terminar la entrada");
        System.out.println("En UNIX/LINUX/MAC OS X escriba <ctrl> z y despues oprima intro");
        
        while(ContadorCaliff<10){
            calificacion = entrada.nextInt();
            total += calificacion;
            ++ContadorCaliff;
            
            switch(calificacion/10){
            case 9:
            case 10:
                ++aCuenta;
                break;
            case 8:
                 ++bCuenta;
                 break;
            case 7:
                ++cCuenta;
                break;
            case 6:
                ++dCuenta;
                break;
            default:
                ++fCuenta;
                break;
    }
        }
        System.out.println("\nReporte calificaciones ");
        if(ContadorCaliff!=0){
           double promedio = total / ContadorCaliff;
            System.out.printf("El total de las %d calificaciones introducidas es %d\n",
            ContadorCaliff, total);
            System.out.printf("El promedio de la clase es %.2f\n", promedio);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d",
            "Numero de estudiantes que recibieron cada calificacion:",
            "A: ", aCuenta,
            "B: ", bCuenta,
            "C: ", cCuenta,
            "D: ", dCuenta,
            "F: ", fCuenta);
        }else{
            System.out.println("No se introdujeron calificaciones");
        }
    }
    
}
