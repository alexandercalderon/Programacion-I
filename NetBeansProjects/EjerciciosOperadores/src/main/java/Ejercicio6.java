
public class Ejercicio6 {
    public static void main(String[] args) {

int ladoCuadrado =8;
int areaCua,perimCua;

int baseTriangulo = 9;
int alturaTriangulo = 8;
int ladoUnoTriangulo = 8;
int ladoDosTriangulo = 8;
int areaTri,periTri;

int baseRectangulo = 8;
int alturaRectangulo = 6;
int areaRec,periRec;

areaCua= ladoCuadrado*ladoCuadrado;
perimCua= ladoCuadrado*4;

areaTri= (baseTriangulo*alturaTriangulo)/2;
periTri= ladoUnoTriangulo+ladoDosTriangulo+baseTriangulo;

areaRec= baseRectangulo*alturaRectangulo;
periRec= (baseRectangulo*2)+(alturaRectangulo*2);

        System.out.println(" El area del cuadrado es " + areaCua); 
        System.out.println(" El perimetro del cuadrado es " + perimCua);     
        System.out.println(" El area del triangulo es " + areaTri);     
        System.out.println(" El perimetro del triangulo es " + periTri);     
        System.out.println(" El area del rectangulo es " + areaRec);     
        System.out.println(" El perimetro del rectangulo es " + periRec);     
    }
    
}
