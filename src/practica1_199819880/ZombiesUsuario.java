/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class ZombiesUsuario extends javax.swing.JFrame {

    /**
     * Creates new form ZombiesUsuario
     */
    public ZombiesUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnaceptar = new javax.swing.JButton();
        lblcantidad = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        btnagregarcampo = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        txtnombrezombie = new javax.swing.JTextField();
        txtcantzombie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnaceptar.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 174, -1, -1));

        lblcantidad.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblcantidad.setText("Cantidad:");
        getContentPane().add(lblcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 130, 64, -1));

        btncancelar.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 174, -1, -1));

        btnagregarcampo.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btnagregarcampo.setText("Agregar Campo");
        btnagregarcampo.setEnabled(false);
        btnagregarcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarcampoActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregarcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 225, -1, -1));

        lblnombre.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblnombre.setText("Nombre:");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 87, 64, -1));

        lbltitulo.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lbltitulo.setText("ZOMBIES");
        getContentPane().add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 27, 64, -1));
        getContentPane().add(txtnombrezombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 92, 174, -1));
        getContentPane().add(txtcantzombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 135, 174, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_199819880/agregarcampozombie.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        // TODO add your handling code here:
        
        if(txtnombrezombie.getText().trim().length()==0 || txtcantzombie.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "Debe de Llenar los datos de Nombre de jugador y Cantidad de Plantas para continuar");
 }
 else
 {
   

        ListaJugadorZombie.Zombie.insertar(txtnombrezombie.getText());
        ListaJugadorZombie.Zombie.insertaruno(txtcantzombie.getText());
        
       
        txtnombrezombie.setText("");
        txtcantzombie.setText("");

        txtnombrezombie.setEnabled(false);
        txtcantzombie.setEnabled(false);
        btnagregarcampo.setEnabled(true);

        ListaJugadorZombie.Zombie.recorrer();     
 }

       

    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnagregarcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarcampoActionPerformed
        // TODO add your handling code here:
        AgregarCampoZombie campo = new AgregarCampoZombie();
        campo.setVisible(true);
        campo.setResizable(false);
        campo.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnagregarcampoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ZombiesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZombiesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZombiesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZombiesUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZombiesUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnagregarcampo;
    private javax.swing.JButton btncancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtcantzombie;
    private javax.swing.JTextField txtnombrezombie;
    // End of variables declaration//GEN-END:variables
}
