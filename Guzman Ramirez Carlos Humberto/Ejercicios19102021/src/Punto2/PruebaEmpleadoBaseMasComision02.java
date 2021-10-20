package Punto2;

import Punto2.EmpleadoBaseMasComision02;

public class PruebaEmpleadoBaseMasComision02 {
    public static void main(String[] args) {
        EmpleadoBaseMasComision02 empleado = new EmpleadoBaseMasComision02(
        "Carlos", "Guzman", "1007445614", 10000, .06, 300);
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
        System.out.printf("%s %s\n", "El salario base es",
                empleado.obtenerSalarioBase());
        
        empleado.establecerSalarioBase(1000);
        
        System.out.printf("\n%s:\n\n%s\n",
                "Informacion actualizada del empleado, obtenida mediante toString", empleado);
    }
}
