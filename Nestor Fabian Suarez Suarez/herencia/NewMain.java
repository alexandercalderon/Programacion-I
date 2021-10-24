/*ejercicio 9.5
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author fabia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
EmpleadoPorComision empleado = new EmpleadoPorComision(
"Sue", "Jones", "222-22-2222", 10000, .06 );
System.out.println(
"Informacion del empleado obtenida por los metodos establecer: \n" );
System.out.printf( "%s %s\n", "El primer nombre es",
empleado.obtenerPrimerNombre() );
System.out.printf( "%s %s\n", "El apellido paterno es",
empleado.obtenerApellidoPaterno() );
System.out.printf( "%s %s\n", "El numero de seguro social es",

empleado.obtenerNumeroSeguroSocial() );
System.out.printf( "%s %.2f\n", "Las ventas brutas son",
empleado.obtenerVentasBrutas() );
System.out.printf( "%s %.2f\n", "La tarifa de comision es",
empleado.obtenerTarifaComision() );
empleado.establecerVentasBrutas( 500 );
empleado.establecerTarifaComision( .1 );
System.out.printf( "\n%s:\n\n%s\n",
"Informacion actualizada del empleado, obtenida mediante toString", empleado );
}
}

