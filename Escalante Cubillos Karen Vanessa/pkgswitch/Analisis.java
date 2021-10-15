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
public class Analisis {
    public void procesarResultadosExamen()
    {
        Scanner entrada = new Scanner (System.in);
        
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;
        int resultado;
        
        while(contadorEstudiantes <= 10)
        {
            System.out.print("Escriba el resultado (1= aprobado,2=reprobado):");
            resultado = entrada.nextInt();
            
            if (resultado == 1)
                aprobados = aprobados + 1;
            else
                reprobados = reprobados + 1;
            
            contadorEstudiantes = contadorEstudiantes + 1;
        }   
            System.out.printf("Aprobados: %d\n", aprobados, reprobados);
            
            if (aprobados>8)
                System.out.println("Aumentar colegiatura");
    }
}
                   
            
        
  

