
package ClasesOperadores;


public class Ejercicio6 {
    public static void main(String[] args) {
        int ladoCuadrado = 8;
        int perimetroC,areaC;
        perimetroC = ladoCuadrado+ladoCuadrado+ladoCuadrado+ladoCuadrado;
        areaC = ladoCuadrado*ladoCuadrado;
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        int perimetroT,areaT;
        perimetroT = baseTriangulo+ladoUnoTriangulo+ladoDosTriangulo;
        areaT = (baseTriangulo*alturaTriangulo)/2;
        int baseRectangulo = 8;
        int alturaRectangulo = 6;
        int perimetroR,areaR;
        perimetroR = (2*baseRectangulo)+(2*alturaRectangulo);
        areaR = baseRectangulo*alturaRectangulo;
        System.out.println("El perimetro del cuadrado es:"+perimetroC);
        System.out.println("El area del cuadrado es:"+areaC);
        System.out.println("El perimetro del triangulo es:"+perimetroT);
        System.out.println("El area del cuadrado es:"+areaT);
        System.out.println("El perimetro del rectangulo es:"+perimetroR);
        System.out.println("El area del rectangulo es:"+areaR);
        
    }
     
     
    
}
