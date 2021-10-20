package Ejercicio2;

public class EmpleadoBaseMasComision {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {

        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
        setVentasBrutas(ventas);
        setTarifaComision(tarifa);
        setSalarioBase(salario);
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String nombre) {
        this.primerNombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellido) {
        this.apellidoPaterno = apellido;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String nss) {
        this.numeroSeguroSocial = nss;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventas) {
        this.ventasBrutas = Math.max(ventas, 0.0);
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifa) {
        this.tarifaComision = (tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salario) {
        this.salarioBase = Math.max(salario, 0.0);
    }

    public double ingresos() {
        return salarioBase + (tarifaComision * ventasBrutas);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "Empleado por comision", primerNombre, apellidoPaterno,
                "Numero de seguro social", numeroSeguroSocial,
                "Ventas brutas", ventasBrutas,
                "Tarifade comision", tarifaComision,
                "Salario base", salarioBase);
    }
}