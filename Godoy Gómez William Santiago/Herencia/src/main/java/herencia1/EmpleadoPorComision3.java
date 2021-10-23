
package herencia1;

public class EmpleadoPorComision3 {
    
     private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double VentasBrutas;
    private double tarifaComision;
    
     public EmpleadoPorComision3(String nombre, String apellido, String nss,
            double ventas, double tarifa) {

        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);

    }  
     
     public void establecerPrimerNombre(String nombre) {
        primerNombre = nombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;

    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerNumeroSeguroSocial(String nss) {

        numeroSeguroSocial = nss;

    }

    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void establecerVentasBrutas(double ventas) {
        VentasBrutas = (ventas < 0.0) ? 0.0 : ventas;

    }

    public double obtenerVentasBrutas() {

        return VentasBrutas;
    }

    public void establecerTarifaComision(double tarifa) {
        tarifaComision = (tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0;
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    public double ingresos() {
        return obtenerTarifaComision() * obtenerVentasBrutas();

    }
     @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "empleado por comision", obtenerPrimerNombre(), obtenerApellidoPaterno(),
                "numero de seguro social", obtenerNumeroSeguroSocial(),
                "ventas brutas", obtenerVentasBrutas(),
                "tarifa de comision", obtenerTarifaComision()
        );
    
    }
}
