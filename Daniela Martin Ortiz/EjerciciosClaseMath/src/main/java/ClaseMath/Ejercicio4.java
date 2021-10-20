
package ClaseMath;


public class Ejercicio4 {

    
    public static void main(String[] args) {
      double Valor1 = (Math.random()*50);
      double Valor2 = (Math.random()*50);
     
      System.out.println("Valor 1 = " + Valor1);
      System.out.println("Valor 2 = " + Valor2);
      System.out.println("Valor 1 Redondeado - " + Math.round(Valor1));
      System.out.println("Valor 1 Redondeado - " + Math.round(Valor2));
      System.out.println("El número mayor entre el Valor 1 y el Valor 2 es: " + Math.max(Valor1, Valor2));
    }
    
}
