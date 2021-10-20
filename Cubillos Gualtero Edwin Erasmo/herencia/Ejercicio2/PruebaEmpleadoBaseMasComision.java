package Ejercicio2;


public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args) {

        var empleado = new EmpleadoBaseMasComision("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        System.out.println("Informacion del empleado obtenido por los metodos set:\n");
        System.out.printf("%s %s\n", "El primer nombre es", empleado.getPrimerNombre());
        System.out.printf("%s %s\n", "El apellido paterno es", empleado.getApellidoPaterno());
        System.out.printf("%s %s\n", "El numero de seguro social es", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %s\n", "Las ventas brutas son", empleado.getVentasBrutas());
        System.out.printf("%s %s\n", "La tarifa de comision es", empleado.getTarifaComision());
        System.out.printf("%s %s\n", "El salario base es", empleado.getSalarioBase());

        empleado.setSalarioBase(1000);

        System.out.printf("\n%s: \n\n%s\n",
                "Informacion actualizada del empleado, obtenida mediante toString", empleado);
    }
}
