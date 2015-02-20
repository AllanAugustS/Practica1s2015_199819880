/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

/**
 *
 * @author Allan
 */
public class ListaJugador {
    private NodoJugador primero;

    public ListaJugador() {
    primero = null;
    }
    
    public boolean estaVacia(){
    
    return primero==null;
    }
    // metodo para insertar a la lista jugador
    public void insertar(String dato){
    
    if(estaVacia()){
    
    primero = new NodoJugador(dato);
    }else{
    NodoJugador temporal = primero;
    while(temporal.getSiguiente()!=null){
    temporal = temporal.getSiguiente();
    }
    
    temporal.setSiguiente(new NodoJugador(dato));
    }
    }
    
    // metodo para recorrer la listajugador
    
    public void recorrer(){
    
    NodoJugador temporal = primero;
    while(temporal != null){
    System.out.println(temporal.getDato());
    temporal = temporal.getSiguiente();
    
    }
    
    }
    
}
