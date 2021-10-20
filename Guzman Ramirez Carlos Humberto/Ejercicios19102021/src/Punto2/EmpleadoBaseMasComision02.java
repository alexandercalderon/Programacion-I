package Punto2;


public class EmpleadoBaseMasComision02 {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase;
    
    public EmpleadoBaseMasComision02(String nombre, String apellido, String nss,
            double ventas, double tarifa, double salario){
        this.primerNombre = nombre; 
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
        this.establecerVentasBrutas(ventas);
        this.establecerTarifaComision(tarifa);
        this.establecerSalarioBase(salario);
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
       this.ventasBrutas = (ventas < 0.0) ? 0.0 : ventas;
   }
   public double obtenerVentasBrutas(){
       return this.ventasBrutas;
   }
   
   public void establecerTarifaComision(double tarifa){
       this.tarifaComision = (tarifa >0.0 && tarifa < 1.0)? tarifa: 0.0;
   }
   public double obtenerTarifaComision(){
       return this.tarifaComision;
   }
   
   public void establecerSalarioBase(double salario){
       this.salarioBase = (salario < 0.0) ? 0.0: salario;
   }
   public double obtenerSalarioBase(){
       return this.salarioBase;
   }
   
   public double  ingresos(){
        return this.salarioBase + (this.tarifaComision * this.ventasBrutas);
   }
   
    @Override
   public String toString(){
       return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f \n%s: %.2f",
               "empleado por comision", this.primerNombre, this.apellidoPaterno,
               "numero de seguro social", this.numeroSeguroSocial,
               "ventas brutas", this.ventasBrutas,
               "tarifa de comision", this.tarifaComision,
               "salario base", this.salarioBase);
   }
}
