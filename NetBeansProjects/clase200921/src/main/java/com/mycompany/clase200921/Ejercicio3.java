package com.mycompany.clase200921;
public class Ejercicio3 {
    public static void main(String[] args) {
 double nota1 = Math.random()* 5;
 double nota2 = Math.random()* 5;
 double nota3 = Math.random()* 5;
 double nota4 = Math.random()* 5;
 double nota5 = Math.random()* 5; 
 double promedionotas ;
 
        System.out.println(" Primer nota: " + nota1);
        System.out.println(" Segunda nota " + nota2);
        System.out.println(" Tercer nota " + nota3);
        System.out.println(" Cuarta nota: " + nota4);
        System.out.println( " Quinta nota: " + nota5);
        
promedionotas =(nota1+nota2+nota3+nota4+nota5)/5 ;
 
        System.out.println(" El promedio es => " + promedionotas);
        
        
    }
    
}
