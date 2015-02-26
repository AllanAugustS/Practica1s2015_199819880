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
public class ListaJugadorZombie {
    NodoJugador primero;
    static ListaJugadorZombie Zombie = new ListaJugadorZombie();
    public ListaJugadorZombie() {
        primero =null;
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
    
    public void insertaruno(String cant){
    
    if(estaVacia()){
    
    primero = new NodoJugador(cant);
    }else{
    NodoJugador temporal = primero;
    while(temporal.getSiguiente()!=null){
    temporal = temporal.getSiguiente();
    }
    
    temporal.setSiguiente(new NodoJugador(cant));
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
            String archivoPNG="ListaJugadorZombies.png";
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
        if(!estaVacia()){
            NodoJugador temporal = primero;
            while(temporal!=null){
                r=r+"struct"+cont+" [label=\"<f0>"+temporal.getDato()+"|<f1>sig\"];\n";
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