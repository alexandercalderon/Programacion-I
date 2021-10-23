
package ClasesOperadores;
public class Ejercicio6 {
    public static void main(String[] args) {
        int ladoCuadrado = 8;
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        int perimetro1 = ladoUnoTriangulo+ladoDosTriangulo+baseTriangulo;
        int area1 = baseTriangulo*alturaTriangulo;
        int Baserectangulo = 8;
        int Alturarectangulo = 6;
        int area2 = Baserectangulo*Alturarectangulo;
        int perimetro2 = Baserectangulo+Baserectangulo+Alturarectangulo+Alturarectangulo;
        
        System.out.println("El area del cuadrado es "+ladoCuadrado * ladoCuadrado);
        System.out.println("El perimetro del cuadrado es "+ladoCuadrado*4);
         
        System.out.println("El area del triangulo es: "+area1);
        System.out.println("El perimetro del triangulo es: "+perimetro1);
        
        System.out.println("El area del rectangulo es: "+area2);
        System.out.println("El perimetro del rectangulo es: "+perimetro2);
        
    }   
}
