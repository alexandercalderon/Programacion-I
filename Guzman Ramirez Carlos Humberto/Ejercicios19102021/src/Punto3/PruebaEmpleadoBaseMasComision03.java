package Punto3;

import Punto3.EmpleadoBaseMasComision03;

public class PruebaEmpleadoBaseMasComision03 {
    public static void main(String args[]){
        EmpleadoBaseMasComision03 empleado = new EmpleadoBaseMasComision03(
        "Carlos", "Guzman", "1007445614", 5000, .04, 300);
        System.out.println(
        "Informacion del empleado, obtenida por los metodos establecer: \n");
        System.out.printf("%s %s\n", "El primer nombre es", 
                empleado.obtenerPrimerNombre());
        System.out.printf("%s %s\n", "El apellido es", 
                empleado.obtenerApellidoPaterno());
        System.out.printf("%s %s\n", "El numero de seguro social es",
                empleado.obtenerNumeroSeguroSocial());
        System.out.printf("%s %.2f\n", "Las ventas brutas son",
                empleado.obtenerVentasBrutas());
        System.out.printf("%s %.2f\n", "La tarifa de comision es",
                empleado.obtenerTarifaComision());
        System.out.printf("%s %.2f\n", "El salario base es",
                empleado.obtenerSalarioBase());
        
        empleado.establecerSalarioBase(1000);
        
        System.out.printf("\n%s:\n\n%s\n",
                "Informacion actualizada del empleado, obtenida por toString",
                empleado.toString());
    }
}
