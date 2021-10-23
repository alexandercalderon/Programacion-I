
public class EjerciciosMath {

    public static void main(String[] args) {
        {
            double valorPi = Math.PI;
            System.out.println(valorPi);
            
            double raiz = Math.sqrt(25);
            System.out.println(raiz);
        }
        System.out.println("Valor Absoluto - " + Math.abs(-123));
        System.out.println("Hipotenusa = " + Math.hypot(15, 9));
        System.out.println("Logaritmo Natural = " + Math.log(4));
        System.out.println("Número Mayor = " + Math.max(4, 9 ));
        System.out.println("Número Menor = " + Math.min(4, 9 ));
        System.out.println("Potencia = " + Math.pow(5, 4 ));
        System.out.println("Número Aleatorio = " + Math.random( )*100);
        System.out.println("Número Redondeado - " + Math.round(Math.random( )*10));
        System.out.println("Raíz Cuadrada = " + Math.sqrt(121 ));
        
    }
    
}
