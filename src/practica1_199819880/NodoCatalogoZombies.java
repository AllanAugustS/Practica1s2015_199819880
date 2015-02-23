/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

/**
 *
 * @author Allan
 */
public class NodoCatalogoZombies {
  String imagen;
     String nombre;
     int PuntosDanos;
     int PuntosDefensa;
     String tipoplanta;
     NodoCatalogoZombies anterior;
     NodoCatalogoZombies siguiente;
    

    public NodoCatalogoZombies(String imagen, String nombre, int PuntosDanos, int PuntosDefensa, String tipoplanta) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.PuntosDanos = PuntosDanos;
        this.PuntosDefensa = PuntosDefensa;
        this.tipoplanta = tipoplanta;
        this.anterior = null;
        this.siguiente = null;
        
       
    
   
        
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
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

    public NodoCatalogoZombies getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCatalogoZombies anterior) {
        this.anterior = anterior;
    }

    public NodoCatalogoZombies getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCatalogoZombies siguiente) {
        this.siguiente = siguiente;
    }

   
    
      
}
