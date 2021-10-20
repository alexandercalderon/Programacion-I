package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Punto1 {
    public static void main(String[] args){
        float nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota: "));
        if(nota > 10){
            JOptionPane.showMessageDialog(null, "La nota es mayor a 10");
        }else if(nota == 10){
                JOptionPane.showMessageDialog(null, "La nota es igual a 10");
                }
        else{
            JOptionPane.showMessageDialog(null, "La nota es menor a 10");
        }
    }
}
