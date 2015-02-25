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
public class Pilazombies {
    
    private int max= Integer.parseInt(ListaJugadorZombie.Zombie.primero.getSiguiente().dato); 
    private int tope;
    private Object arr[];
    
    public Pilazombies(){
    
    tope= 0;
    arr = new Object[max];
    
    }
    
    //metodo para indicar que la pila esta vacia
    private boolean estaVacia(){
    
    return tope==0;
    
    }
    
    // metodo para indicar que la pila esta llena
    private boolean estaLlena(){
    
    return tope==max;
    
    }
    // metodo para apilar una pila
     public String apilar(ListaCatalogoZombies lista){
     
     if(estaLlena()){
     
     return "pila llena" + " " + max;
     }
     arr[tope] = ListaCatalogoZombies.listacatalogo.Cabeza.imagen;
     tope++;
     
     return "se apilo" + ListaCatalogoZombies.listacatalogo.Cabeza.imagen + ", tope: " +tope ;
     
     }
    
     // metodo para desapilar una pila
     public String Desapilar(){
     
     if(estaVacia()){
     
     return "pila vacia";
     }
     
     tope--;
     return "se desapilo" + arr[tope]+ ", tope: " +tope;
     
     }
    
    
}
