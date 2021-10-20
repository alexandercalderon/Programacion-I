package Punto4;

import Punto3.EmpleadoPorComision03;

public class EmpleadoBaseMasComision04 extends EmpleadoPorComision03{
    private double salarioBase;
    
    public EmpleadoBaseMasComision04(String nombre, String apellido,
            String nss, double ventas, double tarifa, double salario){
        super(nombre, apellido, nss, ventas, tarifa);
        this.establecerSalarioBase(salario);
    }
    
    public void establecerSalarioBase(double salario){
        this.salarioBase = (salario < 0.0) ? 0.0: salario;
    }
    public double obtenerSalarioBase(){
        return this.salarioBase;
    }
    
    public double ingresos(){
        return this.obtenerSalarioBase() * super.ingresos();
    }
    
    public String toString(){
        return String.format("%s %s\n%s: %.2f", "con sueldo base",
                super.toString(), "sueldo base", obtenerSalarioBase());
    }
}
