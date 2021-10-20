package Punto5;

import Punto4.EmpleadoPorComision04;

public class EmpleadoBaseMasComision05 extends EmpleadoPorComision04{
    private double salarioBase;
    
    public EmpleadoBaseMasComision05(String nombre, String apellido, String nss,
            double ventas, double tarifa, double salario){
        super(nombre, apellido, nss, ventas, tarifa);
        this.establecerSalarioBase(salario);
        
        System.out.printf(
        "\nConstructor de EmpleadoBaseMasComision05:\n%s\n", this);
    }
    
    public void establecerSalarioBase(double salario){
        this.salarioBase = (salario < 0.0) ? 0.0: salario;
    }
    public double obtenerSalarioBase(){
        return this.salarioBase;
    }
    
    public double ingresos(){
        return this.obtenerSalarioBase() + super.ingresos();
    }
    
    public String toString(){
        return String.format("%s %s\n%s: %.2f", "con sueldo base",
                super.toString(), "sueldo base", this.obtenerSalarioBase());
    }
}
