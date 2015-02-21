/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

import java.awt.Image;
/**
 *
 * @author Allan
 */
public class NodoCatalogoPlantas {
    
     Image imagen;
     String nombre;
     int PuntosDanos;
     int PuntosDefensa;
     String tipoplanta;
     NodoCatalogoPlantas anterior;
     NodoCatalogoPlantas siguiente;

    public NodoCatalogoPlantas(Image imagen, String nombre, int PuntosDanos, int PuntosDefensa, String tipoplanta) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.PuntosDanos = PuntosDanos;
        this.PuntosDefensa = PuntosDefensa;
        this.tipoplanta = tipoplanta;
        this.anterior = null;
        this.siguiente = null;
    }

    

   

    
    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDanos() {
        return PuntosDanos;
    }

    public void setPuntosDanos(int PuntosDanos) {
        this.PuntosDanos = PuntosDanos;
    }

    public int getPuntosDefensa() {
        return PuntosDefensa;
    }

    public void setPuntosDefensa(int PuntosDefensa) {
        this.PuntosDefensa = PuntosDefensa;
    }

    public String getTipoplanta() {
        return tipoplanta;
    }

    public void setTipoplanta(String tipoplanta) {
        this.tipoplanta = tipoplanta;
    }

    public NodoCatalogoPlantas getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCatalogoPlantas anterior) {
        this.anterior = anterior;
    }

    public NodoCatalogoPlantas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCatalogoPlantas siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
