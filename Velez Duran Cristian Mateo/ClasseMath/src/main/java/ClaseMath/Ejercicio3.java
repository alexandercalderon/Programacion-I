
package ClaseMath;


public class Ejercicio3 {

    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, nota5;
        nota1 = Math.random()*10;
        System.out.println("Nota 1:"+nota1);
        nota2 = Math.random()*10;
        System.out.println("Nota 2: "+nota2);
        nota3 = Math.random()*10;
        System.out.println("Nota 3: "+nota3);
        nota4 = Math.random()*10;
        System.out.println("Nota 4: "+nota4);
        nota5 = Math.random()*10;
        System.out.println("Nota 5: "+nota5);
        System.out.println("Promedio: "+ (nota1+nota2+nota3+nota4+nota5)/5);
    }
    
}
