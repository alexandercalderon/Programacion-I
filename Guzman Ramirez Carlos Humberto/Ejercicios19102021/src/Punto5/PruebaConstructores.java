package Punto5;

import Punto4.EmpleadoPorComision04;
import Punto5.EmpleadoBaseMasComision05;

public class PruebaConstructores {
    public static void main(String[] args) {
        EmpleadoPorComision04 empleado1 = new EmpleadoPorComision04(
        "Carlos", "Guzman", "1007445614", 5000, .04);

        System.out.println();
        EmpleadoBaseMasComision05 empleado2 = new EmpleadoBaseMasComision05(
        "CArlos", "GUzman", "4165447001", 2000, .06, 800);

        System.out.println();
        EmpleadoBaseMasComision05 empleado4 = new EmpleadoBaseMasComision05(
        "CARlos", "GUZman", "4451007614", 8000, .15, 2000);
    }
}
