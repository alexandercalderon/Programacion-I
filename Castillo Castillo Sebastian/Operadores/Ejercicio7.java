package clasesoperadores;

public class Ejercicio7 {

    public static void main(String args[]) {

        int ladoCuadrado = 8;
        int perimetro, area;

        perimetro = ladoCuadrado * 4;
        area = ladoCuadrado * ladoCuadrado;

        int baseTriangulo = 9;
        int alturaTriangulo = 8;

        int ladoUnoTriangulo = 8, ladoDosTriangulo = 8;

        int areaTriangulo, perimetroTriangulo;

        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        perimetroTriangulo = ladoUnoTriangulo + ladoDosTriangulo + baseTriangulo;

        int baseRectangulo = 8;
        int alturaRectangulo = 6;

        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = (baseRectangulo * 2) + (alturaRectangulo * 2);

        System.out.println("Perimetro del cuadrado = " + perimetro);
        System.out.println("area del cuadrado = " + area);
        System.out.println("area del triangulo = " + areaTriangulo);
        System.out.println("area del rectangulo = " + areaRectangulo);
        System.out.println("perimetro del rectangulo = " + perimetroRectangulo);

    }

}
