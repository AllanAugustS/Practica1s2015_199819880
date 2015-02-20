/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

/**
 *
 * @author Allan
 */
public class NodoJugador {
    
    private String dato;
    private NodoJugador siguiente;

    public NodoJugador(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoJugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoJugador siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
   
}
