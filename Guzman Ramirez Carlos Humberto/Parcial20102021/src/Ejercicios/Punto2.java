package Ejercicios;

import javax.swing.JOptionPane;

public class Punto2 {
        public static void main(String[] args){
        float nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota: "));
        if(nota <= 0){
            JOptionPane.showMessageDialog(null, "Nota no valida");
        }else if(nota == 10){
            JOptionPane.showMessageDialog(null, "Matricula de honor");
        }else if(nota >= 9 && nota < 10){
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }else if(nota >= 7 && nota < 9){
            JOptionPane.showMessageDialog(null, "Notable");
        }else if(nota >= 6 && nota < 7){
            JOptionPane.showMessageDialog(null, "Bien");
        }else if(nota >= 5 && nota < 6){
            JOptionPane.showMessageDialog(null, "Suficiente");
        }else if(nota < 5){
            JOptionPane.showMessageDialog(null, "Suspenso");
        }else{
            JOptionPane.showMessageDialog(null, "Nota no valida");
        }
    }
}
