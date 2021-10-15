/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosif.ifelse.pkgswitch;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class PanelDibujo extends JPanel 
{
 
    public void paintComponent(Graphics g, Graphics Graphics)
    {          
    super.paintComponent(g);
    int anchura = getWidth();
    int altura = getHeigth();
    
    g.drawLine(0,0,anchura,altura);
    g.drawLine(0 ,anchura, altura,0 );       
    
    }  

    private int getHeigth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }


   

