package Punto3;

import Punto3.EmpleadoPorComision03;

public class EmpleadoBaseMasComision032 extends EmpleadoPorComision03{
    private double salarioBase;
    
    public EmpleadoBaseMasComision032(String nombre, String apellido,
            String nss, double ventas, double tarifa, double salario){
        super(nombre, apellido, nss, ventas, tarifa);
        this.establecerSalarioBase(salario);
    }
    
    public void establecerSalarioBase(double salario){
        salarioBase = (salario < 0.0) ? 0.0: salario;
    }
    public double obtenerSalarioBase(){
        return this.salarioBase;
    }
    
    public double ingresos(){
        return this.salarioBase + (this.obtenerTarifaComision() * this.obtenerVentasBrutas());
    }
    
    public String toString(){
        return String.format(
        "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
        "empleado por comision con sueldo base", this.primerNombre, this.apellidoPaterno,
        "numero de seguro social", this.numeroSeguroSocial,
        "ventas brutas", this.ventasBrutas, "tarifa de comision", this.tarifaComision,
        "salario base", this.salarioBase);
    }
}
