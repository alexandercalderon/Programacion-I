
package herencia1;


public class PruebaEmpleadoBadeMasComision3 {
   public static void main(String args[]){
        
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Bob", "Lewis",
        "333-333-3333", 5000, .04,300);
        
        System.out.println("Informacion del empleado obtenida por metodos establecer:\n");
        System.out.printf("%s %s\n", "el primer nombre  es",
               empleado.obtenerPrimerNombre() );
         System.out.printf("%s %s\n", "el apellido  es",
               empleado.obtenerApellidoPaterno());
          System.out.printf("%s %s\n", "el numero de seguro social  es",
               empleado.obtenerNumeroSeguroSocial() );
           System.out.printf("%s %.2f\n", "las ventas brutas son",
               empleado.obtenerVentasBrutas() );
            System.out.printf("%s %s.2f\n", "la tarifa de comision es",
               empleado.obtenerTarifaComision() );
             System.out.printf("%s %s.2f\n", "el salario base  es",
               empleado.obtenerSalarioBase() );
             
             empleado.establecerSalarioBase(1000);
             System.out.printf("\n%s:\n\n%s\n",
                     "informacion actualizada del empleado, obtenida por toString",
                     empleado.toString());
    }
    
}