
package com.mycompany.sentenciasderamificacion;


public class Return {

 
    public static void main(String[] args) {
                boolean t = true;
        System.out.println(t);
     
        if (t)
            return;
 
        // El compilador eludirá todas las declaraciones
        // después de return
        System.out.println("Esto no se ejecutará."+t);

    }
    
}
