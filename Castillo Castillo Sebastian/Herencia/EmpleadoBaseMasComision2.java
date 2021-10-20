package herencia1;

public class EmpleadoBaseMasComision2 extends EmpleadoPorComision{

    private double salarioBase;

    public EmpleadoBaseMasComision2(String nombre, String apellido
    
    String nss, double ventas, double tarifa, double salario

    
    
        ){
    
    super(nombre, apellido, nss, ventas, tarifa);

        establecerSalarioBase(salario);

    }

    public void establecerSalarioBase(double salario) {
        salarioBase = (salario < 0.0) ? 0.0 : salario;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    @Override
    public double ingresos() {
        return salarioBase + (tarifaComision * VentasBrutas);

    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "empleado por comision con sueldo base", primerNombre, apellidoPaterno,
                "numero de seguro social", numeroSeguroSocial,
                "ventas brutas", VentasBrutas,
                "salario base", salarioBase);
    }

}
