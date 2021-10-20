package Punto1;

import Punto1.EmpleadoPorComision01;

public class PruebaEmpleadoPorComision01 {
    public static void main(String[] args) {
        EmpleadoPorComision01 empleado = new EmpleadoPorComision01(
        "Carlos", "Guzman", "1007445614", 10000, .06);
        System.out.println("Información del empleado obtenida por los metodos establecer: \n");
        System.out.printf("%s %s \n", "El primer nombre es",
                empleado.obtenerPrimerNombre());
        System.out.printf("%s %s \n", "El apellido paterno es: ", 
                empleado.obtenerApellidoPaterno());
        System.out.printf("%s %s\n", "El numero de seguro social es",
                empleado.obtenerNumeroSeguroSocial());
        System.out.printf("%s %.2f\n", "Las ventas brutas son",
                empleado.obtenerVentasBrutas());
        System.out.printf("%s %.2f\n", "La tarifa de comision es",
                empleado.obtenerTarifaComision());
        empleado.establecerVentasBrutas( 500);
        empleado.establecerTarifaComision(.1);
        System.out.printf("\n%s:\n\n%s\n",
                "Informacion actualizada del empleado, obtenida mediante toString", empleado);
    }
}
