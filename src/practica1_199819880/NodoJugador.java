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
    
    public String dato;
    public int Cantidad;
    public NodoJugador siguiente;

    public NodoJugador(String dato, int cantidad) {
        this.dato = dato;
        this.Cantidad = cantidad;
        this.siguiente = null;
    }

    public NodoJugador(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
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
