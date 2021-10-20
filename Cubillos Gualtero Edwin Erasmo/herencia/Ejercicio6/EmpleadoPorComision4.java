package Ejercicio6;

public class EmpleadoPorComision4 {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision4(String nombre, String apellido, String nss, double ventas, double tarifa) {
        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
        setVentasBrutas(ventas);
        setTarifaComision(tarifa);

        System.out.printf("\nConstructor de EmpleadoPorComision4:\n%s\n", this);
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

    public double ingresos() {
        return getTarifaComision() * getVentasBrutas();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "Empleado por comision", getPrimerNombre(), getTarifaComision(),
                "Numero de seguro social", getNumeroSeguroSocial(),
                "Ventas brutas", getVentasBrutas(),
                "Tarifa de comision", getTarifaComision());
    }

}
