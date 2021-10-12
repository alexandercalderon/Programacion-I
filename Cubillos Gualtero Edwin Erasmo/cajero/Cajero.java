package cajero;

import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int saldo = 5000000;
        boolean bank = true;
        int retirar;

        while (bank) {
            System.out.println("""
                \n            Banco Papucol
                ----------------------------------------
                           1. Consultar saldo
                           2. Retirar saldo
                           3. Salir
                ----------------------------------------""");
            int op = sc.nextInt();

            if (op >= 1 && op <= 3) {

                if (op == 1) {

                    System.out.printf("""
                          \n----------------------------------------
                                   Tu saldo es de: %d
                          ----------------------------------------\n""", saldo);

                }
                else if (op == 2){

                    boolean state = true;
                    while (state) {
                        System.out.println("\n----------------------------------------");
                        System.out.print("   Cuanto desea retirar: ");
                        retirar = sc.nextInt();
                        System.out.println("----------------------------------------");

                        if (saldo > retirar) {
                            saldo -= retirar;
                            state = false;
                        }
                        else {
                            System.out.print("""
                                    \n----------------------------------------
                                       No tienes ese monto en la cuenta
                                    ----------------------------------------\n""");
                        }
                    }
                }
                else {
                    System.out.println("""
                        \n----------------------------------------
                          Gracias por usar nuestros servicios.
                        ----------------------------------------\n""");
                    bank = false;
                }

            }
            else {
                System.out.println("""
                        \n----------------------------------------
                        Opcion no valida, elige correctactamente
                        ----------------------------------------\n""");
            }
        }

    }
}
