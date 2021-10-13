
package ejercicios;


public class Ejercicio4 {
    
    public static void main(String args[]){
        
        double monto;
        double principal = 10000.0;
        double tasa = 0.05;
        
        System.out.println("Anio"  + "Monto en deposito");
        
        for(int anio = 1; anio <= 10; anio++){
            
            monto = principal * Math.pow(1.0 + tasa, anio);
            System.out.println(anio + monto);
            
        }
    }
    
}
