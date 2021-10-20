package Ejercicios;

import javax.swing.JOptionPane;

public class Punto3 {

    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del mes: "));
        switch(mes){
            case 1: JOptionPane.showMessageDialog(null, "Este es el mes de Enero"); break;
            case 2: JOptionPane.showMessageDialog(null, "Este es el mes de Febrero"); break;
            case 3: JOptionPane.showMessageDialog(null, "Este es el mes de Marzo"); break;
            case 4: JOptionPane.showMessageDialog(null, "Este es el mes de Abril"); break;
            case 5: JOptionPane.showMessageDialog(null, "Este es el mes de Mayo"); break;
            case 6: JOptionPane.showMessageDialog(null, "Este es el mes de Junio"); break;
            case 7: JOptionPane.showMessageDialog(null, "Este es el mes de Julio"); break;
            case 8: JOptionPane.showMessageDialog(null, "Este es el mes de Agosto"); break;
            case 9: JOptionPane.showMessageDialog(null, "Este es el mes de Septiembre"); break;
            case 10: JOptionPane.showMessageDialog(null, "Este es el mes de Octubre"); break;
            case 11: JOptionPane.showMessageDialog(null, "Este es el mes de Noviembre"); break;
            case 12: JOptionPane.showMessageDialog(null, "Este es el mes de Diciembre"); break;
            default:
                 JOptionPane.showMessageDialog(null, "No es un mes valido"); break;
        }
    }
}
