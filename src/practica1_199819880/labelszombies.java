/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Allan
 */
public class labelszombies extends JLabel {
    public labelszombies(ListaCatalogoZombies lista){
    // ciclo sirve para saber cuantos nodos existen
    NodoCatalogoZombies raiz = lista.Cabeza;
    int i=0;
    while(raiz != null){
    i++;
    raiz = raiz.getSiguiente();
    
    }
    //propiedades
    this.setVisible(true);
    this.setBounds(0, 0, 300, (i*300)+30);
    this.setPreferredSize(new Dimension(500, (i*300)+30));
    this.setLayout(null);
    
    // ciclo que inserta los jlabels en el panel
    raiz = lista.Cabeza;
    i=0;
    while(raiz != null){
        // label imagen
        ImageIcon a = new ImageIcon(raiz.imagen);
        java.awt.Image b= a.getImage();
        ImageIcon c = new ImageIcon(b.getScaledInstance(80, 80, java.awt.Image.SCALE_DEFAULT));
        
        JLabel Imagen = new JLabel(c);
        Imagen.setBounds(5, 5+(i*100), 80, 80);
        Imagen.setVisible(true);
        this.add(Imagen);
        
        // label nombre
        
        JLabel nombre = new JLabel("Nombre Planta" + raiz.nombre);
        nombre.setBounds(100, 5+(i*100), 200, 25);
        nombre.setVisible(true);
        this.add(nombre);
        
        // label puntos defensa
        
        JLabel pdefensa = new JLabel("Puntos Defensa" + raiz.PuntosDefensa);
        pdefensa.setBounds(250, 5+(i*100), 200, 25);
        pdefensa.setVisible(true);
        this.add(pdefensa);
        
        // label puntos daño
        JLabel pdano = new JLabel("Puntos Dano" + raiz.PuntosDanos);
        pdano.setBounds(400, 5+(i*100), 200, 25);
        pdano.setVisible(true);
        this.add(pdano);
         
        // label tipo planta
        JLabel tipo = new JLabel("Tipo Planta" + raiz.tipoplanta);
        tipo.setBounds(550, 5+(i*100), 200, 25);
        tipo.setVisible(true);
        this.add(tipo);
        
        i++;
        raiz = raiz.siguiente;
        
         }
     }
}
