/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class ApiladorZombies implements Runnable {
    
    private Pilazombies pila;
    

    public ApiladorZombies(Pilazombies pila) {
        this.pila = pila;
    }

    @Override
    public void run() {
        
        //int length = g_slist_length (list);
        Random rd = new Random();
        
        
        while(true){
            try {
                
                int time = rd.nextInt(5000);
                Thread.sleep(time);
                
               //  int dato = rd.nextInt(ListaCatalogoZombies.listacatalogo.Cabeza.imagen.length());
               
               
                System.out.println(pila.apilar(ListaCatalogoZombies.listacatalogo));
            } catch (InterruptedException ex) {
                Logger.getLogger(ApiladorZombies.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
 
        
    }
}
