/*ejercicio 9.4
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class HERENCIA extends Object{
protected String primerNombre;
protected String apellidoPaterno;
protected String numeroSeguroSocial;
protected double ventasBrutas;
protected double tarifaComision;
    /**
     * @param nombre
     * @param apellido
     * @param nss
     * @param ventas
     * @param tarifa
     */
public HERENCIA( String nombre, String apellido, String nss,double ventas, double tarifa )
{
    Scanner teclado = new Scanner(System.in);
    primerNombre = nombre;
apellidoPaterno = apellido;
numeroSeguroSocial = nss;
 establecerVentasBrutas( ventas );
establecerTarifaComision( tarifa ); 
}

    public static void main(String[] args) {
        // TODO code application logic here

    }

    private void establecerprimernombre(String nombre ) {
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
numeroSeguroSocial = nss;
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
return tarifaComision * ventasBrutas;
}
@Override
public String toString()
{
return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
"empleado por comision", primerNombre, apellidoPaterno,
"numero de seguro social", numeroSeguroSocial,
"ventas brutas", ventasBrutas,
"tarifa de comision", tarifaComision );
}
}

