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
public class ejerciciolibroc {
   
        
    private String nombreDelCurso;
        
        
        public ejerciciolibroc (String nombreDelcurso, String nombre)
        {
        nombreDelcurso = nombre;
        } 

    ejerciciolibroc(String cS101_Introducción_a_la_programación_de_J) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            System.out.printf("Bienvenido al libro de calificaiones para\n%s!\n\n",
                    obtenerNombreDelCurso());
        }  
        public void determinarPromedioClase()
        {
            Scanner entrada = new Scanner(System.in);
            int total;
            int contadorCalif;
            int calificacion;
            int promedio;
            
            total=0;
            contadorCalif = 1;
            
            while (contadorCalif<=10)
            {
                System.out.print("Escriba la calificaión: ");
                calificacion = entrada.nextInt();
                total = total+calificacion;
                contadorCalif = contadorCalif +1;
            }
            
            promedio = total/10;

            System.out.printf("\nEl total de las calificaciones es %d\n", total);
             System.out.printf("El promedio de la clase es %d\n", promedio);         
                     
            }
        }


