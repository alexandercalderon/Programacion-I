package paquete;

public class Ejercicio5 {
    public static void main(String[] args) {
        int i = 0;
        do{
            if(i % 5 == 0){
                System.out.println("");
            }
            System.out.print(i + " ");
            i++;
        }while(i <= 1000);
    }
 
}
