
package ClasesOperadores;

public class Ejercicio1 {

    public static void main(String[] args) {
       
      String Nombre = "Diana";
      double Nota1 = (Math.random()*5);
      double Nota2 = (Math.random()*5);
      double Nota3 = (Math.random()*5);
      double Nota4 = (Math.random()*5);
      double Nota5 = (Math.random()*5);
       System.out.println("La primera nota es: " +Nota1);
       System.out.println("La segunda nota es: " +Nota1);
       System.out.println("La tercera nota es: " +Nota1);
       System.out.println("La cuarta nota es: " +Nota1);
       System.out.println("La quinta nota es: " +Nota1);
      double resultado = ((Nota1 + Nota2 + Nota3 + Nota4 + Nota5)/5);
      System.out.println(Nombre+ " su nota final es "  +resultado);
    }
    
}
