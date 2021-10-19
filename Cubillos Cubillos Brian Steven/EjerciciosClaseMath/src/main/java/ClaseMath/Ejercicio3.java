
package ClaseMath;


public class Ejercicio3 {
    public static void main(String[] args) {
        double nota1,nota2,nota3,nota4,nota5,promedio;
        
        
        nota1 = Math.random()*10;
        nota2 = Math.random()*10;
        nota3 = Math.random()*10;
        nota4 = Math.random()*10;
        nota5 = Math.random()*10;
        
        promedio = (nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("El promedio es: "+promedio);
        
    }
    
}
