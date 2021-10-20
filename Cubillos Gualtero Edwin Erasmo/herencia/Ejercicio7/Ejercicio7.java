package Ejercicio7;

import java.awt.BorderLayout;
import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {

        JLabel etiquetaN = new JLabel("Norte");
        ImageIcon etiquetaI = new ImageIcon("com.jpg");
        JLabel etiquetaC = new JLabel(etiquetaI);
        JLabel etiquetaS = new JLabel(etiquetaI);

        etiquetaS.setText("Sur");
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(etiquetaN, BorderLayout.NORTH);
        aplicacion.add(etiquetaC, BorderLayout.CENTER);
        aplicacion.add(etiquetaS, BorderLayout.SOUTH);

        aplicacion.setSize(300, 300);
        aplicacion.setVisible(true);
    }
}
