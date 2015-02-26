/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

import java.util.Random;

/**
 *
 * @author Allan
 */
public class ColaPlantas {
    
    private int max= Integer.parseInt(ListaJugador.Plantas.primero.getSiguiente().dato); 
    private int p;
    private int u;
    private Object arr[];
    
    public ColaPlantas(){
    
    p= 0;
    u= 0;
    arr = new Object[max];
    
    }
    
    //metodo para indicar que la cola esta vacia
    private boolean estaVacia(){
    
    return p==u;
    
    }
    
    // metodo para indicar que la cola esta llena
    private boolean estaLlena(){
    
    return u==max;
    
    }
    // metodo para encolar una cola
     public String encolar(ListaCatalogoPlantas lista){
     
     if(estaLlena()){
     
     return "cola llena" + " " + max;
     }
     arr[u] = ListaCatalogoPlantas.listacatalogo.Cabeza.imagen;
     u++;
     
     return "se encolo" + ListaCatalogoPlantas.listacatalogo.Cabeza.imagen + ", primero: " +p+", Ultimo: "+u ;
     
     }
    
     // metodo para desencolar una cola
     public String Desencolar(){
     
     if(estaVacia()){
     
     return "cola vacia";
     }
     Object dato = arr[p]; 
     p++;
     return "se desencolo" + dato+ ", primero: " +p+ ", Ultimo: "+u ;
     
     }
    
    
}
