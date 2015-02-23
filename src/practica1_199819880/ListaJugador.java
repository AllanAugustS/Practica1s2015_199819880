/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Allan
 */
public class ListaJugador {
    private NodoJugador primero;
    
    File f=new File("C:\\Users\\Allan\\Desktop\\Archivos\\ListaJugador.txt");
    
    public void cargar()throws Exception
    {
    if(!f.exists())
    {
    BufferedWriter bw = new BufferedWriter(new FileWriter(f));
    //primero.getDato().toString() =(NodoJugador)ois.readObject(); //cargamos el archivo al objeto alumno
    //fis.close();
    //ois.close();
    
    
    bw.write("Hola");
    
    bw.close();   
    }
    
    else{
    
    }
}

    

    
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
