package Punto3;

import Punto3.EmpleadoPorComision03;

public class EmpleadoBaseMasComision03 extends EmpleadoPorComision03{
    private double salarioBase;
    
    public EmpleadoBaseMasComision03(String nombre, String apellido,
            String nss, double ventas, double tarifa, double salario){
        super(nombre, apellido, nss, ventas, tarifa);
        this.establecerSalarioBase(salario);
    }
    
    public void establecerSalarioBase(double salario){
        this.salarioBase = (salario < 0.0) ? 0.0: salario;
    }
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    
    public double ingresos(){
        return this.salarioBase + (this.tarifaComision * ventasBrutas);
    }
    
    public String toString(){
        return String.format(
        "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
        "empleado por comisiion con salario base", this.primerNombre, this.apellidoPaterno,
        "numero de seguro social", this.numeroSeguroSocial,
        "ventas brutas", this.ventasBrutas, "tarifa comision", this.tarifaComision,
        "salario base", this.salarioBase);
    }
}
