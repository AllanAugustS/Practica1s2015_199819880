/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

/**
 *
 * @author Allan
 */
public class ListaCatalogoZombies {
    NodoCatalogoZombies Cabeza;
    NodoCatalogoZombies Fin;

    public ListaCatalogoZombies() {
    
    Cabeza = null;
    Fin = null;
    }
    
    // metodo para indicar que la lista esta vacia
    
    private boolean EstaVacia(){
    
    boolean vacia = false;
    if(Cabeza ==null){
    
    vacia = true;
    }
    return vacia;
    }
    // fin de metodo
    
    // este metodo enlaza los dos nodos mediante enlace doble
    private void enlazar(NodoCatalogoZombies nodoA, NodoCatalogoZombies nodoB){
    
        nodoA.siguiente = nodoB;
        nodoB.anterior = nodoA;
                
    }
    // fin de metodo
    // metodo para insertar al frente  o al inicio de la lista
    
    public void insertarInicio(String img, String nom,int pdanos, int pdefensa,String tplanta ){
    
    NodoCatalogoZombies nuevo = new NodoCatalogoZombies(img, nom, pdanos, pdefensa, tplanta);
    if(EstaVacia()){
    
    Cabeza = nuevo;
    Fin = nuevo;
    }else{
    enlazar(nuevo, Cabeza);
    Cabeza=nuevo;
        }
    
    }
    // fin de metodo
    // metodo para insertar al final de la lista
    
    public void insertafinal(String img, String nom,int pdanos, int pdefensa,String tplanta){
        NodoCatalogoZombies nuevo = new NodoCatalogoZombies(img, nom, pdanos, pdefensa, tplanta);
        if(EstaVacia()){
    
            Cabeza = nuevo;
            Fin = nuevo;
        }else{
            enlazar(Fin, nuevo);
            Fin=nuevo;
        }
      }
// fin de metodo
    //Metodo para eliminar al frente o al incio de la lista
    
    public void EliminarInicio(){
    
    if(!EstaVacia()){
    
        NodoCatalogoZombies primero = Cabeza.siguiente;
        if(primero == null){
        
            Cabeza = null;
            Fin = null;
        }else {
        
            primero.anterior = null;
            Cabeza = primero;
          }
        }
       }
    // fin de metodo
    // Metodo para eliminar al final de la lista;
    
    public void EliminarFinal(){
    
        if(!EstaVacia()){
    
        NodoCatalogoZombies ultimo = Fin.anterior;
        if(ultimo == null){
        
            Cabeza = null;
            Fin = null;
        }else {
        
            ultimo.siguiente = null;
            Fin = ultimo;
          }
        }
    }
    // fin de metodo
    // Metodo buscar, devuelve una referencia al nodo buscado, sino se encuentra devuelve null
        
        public NodoCatalogoZombies Buscar(String nom ){
            
            NodoCatalogoZombies buscado= null;
            NodoCatalogoZombies iterador= Cabeza;
            while (buscado==null & iterador != null){
               if(iterador.nombre == nom){
                   buscado = iterador;
               
               }            
            iterador = iterador.siguiente;
            }
        
        return buscado;
        }
        // fin de metodo
    
        // metodo para mostrar la lista
        
        public void mostrar(){
        
            NodoCatalogoZombies iterador = Cabeza;
            while(iterador != null){
                System.out.print( iterador.imagen + " -> "+ iterador.nombre + " -> "+ iterador.PuntosDanos+ " -> "+iterador.PuntosDefensa+ " -> "+iterador.tipoplanta );
            iterador = iterador.siguiente;
            
            }
            //System.out.println( "null" );
        
        }
        
        // fin de metodo
    
}
