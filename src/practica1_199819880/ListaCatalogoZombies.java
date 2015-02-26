/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Allan
 */
public class ListaCatalogoZombies {
    NodoCatalogoZombies Cabeza;
    NodoCatalogoZombies Fin;
    static ListaCatalogoZombies listacatalogo = new ListaCatalogoZombies();
    
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
        
        public int contar(){
            int contador=0;
            NodoCatalogoZombies c = Cabeza;
            
            while(c!=null){
            contador++;
            c = c.getSiguiente();
           }
    
                return contador;   
    
      }
    public void Dibujar(){
    
    String source="digraph lista{\n rankdir=LR;node [shape = record, style=rounded];\n";
        source = source+this.Generar();
        FileWriter archivoDot = null;
        PrintWriter escritor=null;
        try{         
         archivoDot=new FileWriter("Lista.dot");
         escritor = new PrintWriter(archivoDot);
         escritor.println(source);
     }catch(IOException e){
         e.printStackTrace();            
     }finally{
            try{
                if(archivoDot!=null){
                    archivoDot.close();
                }
            }catch(Exception ex){ex.printStackTrace();}
     }
     
    
    
    }
    
    public void GenerarPNG(){
    try{
            String dotPath="C:\\Users\\Allan\\Desktop\\release\\bin\\dot.exe";
            //String dotPath="C:\\Program Files (x86)\\Graphviz 2.28\\bin\\dot.exe";
            String archivoDot="Lista.dot";
            String archivoPNG="ListaCatalogoZombies.png";
            String tParam="-Tpng";// salida PNG
            String oParam="-o";
            
            String[] command= new String[5];
            command[0]=dotPath;
            command[1]=tParam;
            command[2]=archivoDot;
            command[3]=oParam;
            command[4]=archivoPNG;
            
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(command);
                    
        }catch(Exception e){}
    }
    public String Generar(){
        String r="";
        String enlaces="";
        int cont=0;
        if(!EstaVacia()){
            NodoCatalogoZombies temporal = Cabeza;
            while(temporal!=null){
                r=r+"struct"+cont+" [label=\"<f0>"+temporal.imagen + temporal.nombre+ temporal.PuntosDefensa+ temporal.PuntosDanos+temporal.tipoplanta+"|<f1>sig\"];\n";
                cont++;
                temporal=temporal.getSiguiente();
            }
            for(int i=0;i<cont-1;i++){
                enlaces = enlaces+"struct"+i+":f1->struct"+(i+1)+":f0;\n";
            }
        }
        r=r+enlaces+"}";
        return r;
    }
}
