/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosif.ifelse.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CalificacionesLibro {
     private String nombreDelCurso;
        
        
        public CalificacionesLibro (String nombreDelcurso, String nombre)
        {
        nombreDelcurso = nombre;
        } 
        public void establecerNombreDelCurso(String nombre, String nombreDelcurso)
        {
             nombreDelcurso=nombre;
        }
        public String obtenerNombreDelCurso()
        {
        
            return nombreDelCurso;
        }
        public void mostrarMensaje()
        {
            System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n\n",
                    obtenerNombreDelCurso());
        }  
        public void determinarPromedioClase()
        {
            Scanner entrada = new Scanner(System.in);
            int total;
            int contadorCalif;
            int calificacion;
            double promedio;
            
            total=0;
            contadorCalif = 0;
            
            System.out.print("Escriba la calificaión o -1 para terminar: ");
                calificacion = entrada.nextInt();
                
            while (contadorCalif != -1)
            {
                total = total + calificacion;
                contadorCalif = contadorCalif +1;
                
                System.out.print("Escriba la calificaión o -1 para terminar: ");
                calificacion = entrada.nextInt();
            }
            if (contadorCalif!= 0)
            {
                promedio = (double) total/ contadorCalif;
                
            System.out.printf("\nEl total de las calificaciones es %d\n", total);
            System.out.printf("El promedio de la clase es %.2f\n", promedio);         
            }
            else 
                 System.out.println("No se introdujeron calificaciones");
        }
}


