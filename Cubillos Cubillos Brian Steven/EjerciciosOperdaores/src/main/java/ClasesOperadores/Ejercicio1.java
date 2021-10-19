
package ClasesOperadores;
import java.util.Scanner;





public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        double nota1 = 3.15;
        double nota2 = 4.25;
        double nota3 = 3.47;
        double nota4 = 4.15;
        double nota5 = 4.87;
        double promedio;
        promedio = (nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println(" "+nombre);
        System.out.println("Su promedio es de: "+promedio);
    }
    
}
