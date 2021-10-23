package ejercicios13092021;


public class CalculoHoras {

    public static void main(String[] args) {
      
        int H , S , h , D;
        
        H = 24502;
        S = H/(24*7);
        D = H%(24*7)/24;
        h = H%24;
        
        System.out.println("Horas a Convertir "+H);
        System.out.println("Total de Semanas "+S);
        System.out.println("Total de Dias "+D);
        System.out.println("Total de horas "+h);
    
    }
    
}
