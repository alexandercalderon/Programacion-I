package Ejercicio6;

public class EmpleadoBaseMasComision5 extends EmpleadoPorComision4 {

    private double salarioBase;

    public EmpleadoBaseMasComision5(String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {
        super(nombre, apellido, nss, ventas, tarifa);
        setSalarioBase(salario);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salario) {
        this.salarioBase = Math.max(salario, 0.0);
    }

    public double ingresos() {
        return getSalarioBase() + super.ingresos();
    }

    public String toString() {
        return String.format("%s %s\n%s: %.2f\n",
                "con sueldo base", super.toString(),
                "sueldo base", getSalarioBase());
    }
}
