package herencia1;

public class PruebaEmpleadoPorComision {

    public static void main(String args[]) {

        EmpleadoPorComision empleado = new EmpleadoPorComision("sue",
                "jones", "222-222-2222", 10000, .06);

        System.out.println("Informacion del empleado obtenida por los metodos establecer: \n");
        System.out.printf("%s %s\n", "El primer nombre es",
                empleado.obtenerPrimerNombre());

        System.out.printf("%s %s\n", "El apellido peterno  es",
                empleado.obtenerApellidoPaterno());

        System.out.printf("%s %s\n ", "El numero de seguro social es",
                empleado.obtenerNumeroSeguroSocial());

        System.out.printf("%s %.2f\n", "la tarifa de comision es",
                empleado.obtenerTarifaComision());

        empleado.establecerVentasBrutas(500);
        empleado.establecerTarifaComision(.1);
        System.out.printf("\n%s:\n\n%s\n",
                "Informacion actualizada del empleado, obtenida mediante toString",
                empleado);

    }

}
