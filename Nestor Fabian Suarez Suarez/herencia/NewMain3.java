/*ejercicio 9.9
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author fabia
 */
public class NewMain3 {
private String primerNombre;
private String apellidoPaterno;
private String numeroSeguroSocial;
private double ventasBrutas;
private double tarifaComision; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
primerNombre = nombre;
apellidoPaterno = apellido;
numeroSeguroSocial = nss;
establecerVentasBrutas( ventas );
establecerTarifaComision( tarifa );
}
public void establecerPrimerNombre( String nombre )
{
primerNombre = nombre;
}
public String obtenerPrimerNombre()
{
return primerNombre;
}
public void establecerApellidoPaterno( String apellido )
{
apellidoPaterno = apellido;
}
public String obtenerApellidoPaterno()
{
return apellidoPaterno;
}
public void establecerNumeroSeguroSocial( String nss )
{
numeroSeguroSocial = nss; // debe validar
}
public String obtenerNumeroSeguroSocial()
{
return numeroSeguroSocial;
}
public void establecerVentasBrutas( double ventas )
{
ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
}
public double obtenerVentasBrutas()
{
return ventasBrutas;
}
public void establecerTarifaComision( double tarifa )
{
tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
}
public double obtenerTarifaComision()
{
return tarifaComision;
}
public double ingresos()
{
return obtenerTarifaComision() * obtenerVentasBrutas();
} 
public String toString()
{
return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
"empleado por comision", obtenerPrimerNombre(), obtenerApellidoPaterno(),
"numero de seguro social", obtenerNumeroSeguroSocial(),
"ventas brutas", obtenerVentasBrutas(),
"tarifa de comision", obtenerTarifaComision() );
}
}
 // TODO code application logic here
