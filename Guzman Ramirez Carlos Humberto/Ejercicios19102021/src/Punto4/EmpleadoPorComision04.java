package Punto4;

public class EmpleadoPorComision04 {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision04(String nombre, String apellido, String nss,
            double ventas, double tarifa){
        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
        this.establecerVentasBrutas(ventas);
        this.establecerTarifaComision(tarifa);
        
        System.out.printf(
        "\nConstructor de EmpleadoPorComision04:\n%s\n", this);
    }
    
    public void establecerPrimerNombre(String nombre){
        this.primerNombre = nombre;
    }
    public String obtenerPrimerNombre(){
        return this.primerNombre;
    }
    
    public void establecerApellidoPaterno(String apellido){
        this.apellidoPaterno = apellido;
    }
    public String obtenerApellidoPaterno(){
        return this.apellidoPaterno;
    }
    
    public void establecerNumeroSeguroSocial(String nss){
        this.numeroSeguroSocial = nss;
    }
    public String obtenerNumeroSeguroSocial(){
        return this.numeroSeguroSocial;
    }
    
    public void establecerVentasBrutas(double ventas){
        this.ventasBrutas = (ventas < 0.0) ? 0.0: ventas;
    }
    public double obtenerVentasBrutas(){
        return this.ventasBrutas;
    }
    
    public void establecerTarifaComision(double tarifa){
        this.tarifaComision = (tarifa > 0.0 && tarifa < 1.0) ? tarifa: 0.0;
    }
    public double obtenerTarifaComision(){
        return this.tarifaComision;
    }
    
    public double ingresos(){
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }
    
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
        "empleado por comision", this.obtenerPrimerNombre(), this.obtenerApellidoPaterno(),
        "numero de seguro social", this.obtenerNumeroSeguroSocial(),
        "ventas brutas", this.obtenerVentasBrutas(),
        "tarifa de comision", this.obtenerTarifaComision());
    }
}
