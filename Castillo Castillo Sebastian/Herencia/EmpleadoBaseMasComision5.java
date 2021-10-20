
package herencia1;

public class EmpleadoBaseMasComision5 extends EmpleadoPorComision4{
    
    private double salarioBase;
    
    public EmpleadoBaseMasComision5(String nombre, String apellido
    
    String nss, double ventas, double tarifa, double salario

    
    
        ){
    
    super(nombre, apellido, nss, ventas, tarifa);

        establecerSalarioBase(salario);
        
         System.out.printf("\nConstrcutor de empleado por comision5:\n%s\n", this);

    }
        
        public void establecerSalarioBase(double salario){
            
            salarioBase = (salario < 0.0) ? 0.0:salario;
            
        }
        
        public double obtenerSalarioBase(){
            return salarioBase;
        }
        @Override
        public double ingresos(){
            return obtenerSalarioBase() + super.ingresos();
            
        }
        @Override
        public String toString(){
            return String.format("%s %s\n%s: %.2f", "con salario  base",
                    super.toString(), "sueldo base", obtenerSalarioBase());
            
        }
        
        
    
}
