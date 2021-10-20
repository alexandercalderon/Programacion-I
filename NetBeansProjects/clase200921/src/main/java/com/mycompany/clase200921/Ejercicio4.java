package com.mycompany.clase200921;
public class Ejercicio4 {
    public static void main(String[] args) {
 
double a = Math.random()*50+1 ;
double b = Math.random()*50+1;
int A;
int B;

 System.out.println(" El valor aleatorio de a es: " + a);
 System.out.println(" El valor aleatorio de b es: " + b);

A = (int) Math.round (a) ;
B = (int) Math.round (b);
        
        System.out.println(" Valor redondeado de a: " + A);
        System.out.println(" Valor redondeado de b: " + B);
        
        System.out.println(" El numero mayor es: " + Math.max(A,B));        
        
    }
    
}
