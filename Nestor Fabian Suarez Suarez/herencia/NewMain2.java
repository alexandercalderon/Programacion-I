/*ejercicio 9.8
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author fabia
 */
public class NewMain2 {

    private static double salario;
private double salarioBase;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

{
super( nombre, apellido, nss, ventas, tarifa );
establecerSalarioBase( salario );
}
public void establecerSalarioBase( double salario )
{
salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
}
public double obtenerSalarioBase()
{
return salarioBase;
}
public double ingresos()
{

return salarioBase + ( tarifaComision * ventasBrutas );
}
public String toString()
{
return String.format(
"%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
"empleado por comision con sueldo base", primerNombre, apellidoPaterno,
"numero de seguro social", numeroSeguroSocial,
"ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision,
"salario base", salarioBase );

    }
    
}
