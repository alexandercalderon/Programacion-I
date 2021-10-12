package ejercicios21092021.EjerciciosOperadores.ClasesOperadores;

public class Ejercicio6 {
    public static void main(String[] args) {

        int ladoCuadrado = 8;

        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        int perimetroCuadrado = ladoCuadrado * 4;

        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;

        int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        int perimetroTriangulo = ladoUnoTriangulo + ladoDosTriangulo + baseTriangulo;

        int baseRectangulo = 8;
        int alturaRectangulo = 6;

        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = (baseRectangulo * 2) + (alturaRectangulo * 2);

        System.out.printf("""
                Cuadrado
                Area: %d
                Perimetro: %d""",
                areaCuadrado, perimetroCuadrado);
        System.out.println();
        System.out.println();

        System.out.printf("""
                Triangulo
                Area: %d
                Perimetro: %d""",
                areaTriangulo, perimetroTriangulo);
        System.out.println();
        System.out.println();

        System.out.printf("""
                Rectangulo
                Area: %d
                Perimetro: %d""",
                areaRectangulo, perimetroRectangulo);
    }
}
