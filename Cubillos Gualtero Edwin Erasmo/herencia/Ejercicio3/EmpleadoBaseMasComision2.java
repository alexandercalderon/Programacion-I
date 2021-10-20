package Ejercicio3;

import Ejercicio2.EmpleadoBaseMasComision;

public class EmpleadoBaseMasComision2 extends EmpleadoBaseMasComision {

    private double salarioBase;

    public EmpleadoBaseMasComision2(String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {
        super(nombre, apellido, nss, ventas, tarifa, salario);
    }

    public void setSalarioBase(double salario) {
        salarioBase = Math.max(salario, 0.0);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    /*public double ingresos() {
        return salarioBase + (tarifaComision * ventasBrutas);
    }*/

    /*@Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "Empleado por comision", primerNombre, apellidoPaterno,
                "Numero de seguro social", numeroSeguroSocial,
                "Ventas brutas", ventasBrutas,
                "Tarifade comision", tarifaComision,
                "Salario base", salarioBase);
    }*/
}
