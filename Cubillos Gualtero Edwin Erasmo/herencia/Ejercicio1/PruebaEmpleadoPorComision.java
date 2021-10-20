package Ejercicio1;

public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {

        var empleado = new EmpleadoPorComision("Sue", "Jones", "222-22-2222", 10000, .06);

        System.out.println("Informacion del empleado obtenido por los metodos set:\n");
        System.out.printf("%s %s\n", "El primer nombre es", empleado.getPrimerNombre());
        System.out.printf("%s %s\n", "El apellido paterno es", empleado.getApellidoPaterno());
        System.out.printf("%s %s\n", "El numero de seguro social es", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %s\n", "Las ventas brutas son", empleado.getVentasBrutas());
        System.out.printf("%s %s\n", "La tarifa de comision es", empleado.getTarifaComision());

        empleado.setVentasBrutas(500);
        empleado.setTarifaComision(.1);

        System.out.printf("\n%s: \n\n%s\n",
                "Informacion actualizada del empleado, obtenida mediante toString", empleado);
    }
}
