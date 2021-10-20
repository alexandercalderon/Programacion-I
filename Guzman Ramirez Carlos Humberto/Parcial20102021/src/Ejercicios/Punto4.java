package Ejercicios;

import javax.swing.JOptionPane;

public class Punto4 {
    public static void main(String[] args) {
        int diaSemana = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero del dia de la semana(1 (lunes)- 7(Domingo)): "));
        switch(diaSemana){
            case 1: case 2: case 3: JOptionPane.showMessageDialog(null, "Si hay clase de programacion (12pm - 2pm)"); break;
            case 4: case 5: case 6: case 7: JOptionPane.showMessageDialog(null, "No hay clase"); break;
            default:
                 JOptionPane.showMessageDialog(null, "Dia no valido"); break;
        }
    }
}
