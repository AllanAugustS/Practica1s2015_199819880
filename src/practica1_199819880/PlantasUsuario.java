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
public class PlantasUsuario extends javax.swing.JFrame {

    /**
     * Creates new form PlantasUsuario
     */
    public PlantasUsuario() {
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

        lbltitulo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        txtnombreplanta = new javax.swing.JTextField();
        txtcantplanta = new javax.swing.JTextField();
        btnagregarcampo = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lbltitulo.setText("PLANTAS");
        getContentPane().add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 27, 64, -1));

        lblnombre.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblnombre.setText("Nombre:");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 87, 64, -1));

        lblcantidad.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblcantidad.setText("Cantidad:");
        getContentPane().add(lblcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 130, 64, -1));
        getContentPane().add(txtnombreplanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 92, 174, -1));
        getContentPane().add(txtcantplanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 135, 174, -1));

        btnagregarcampo.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btnagregarcampo.setText("Agregar Campo");
        btnagregarcampo.setEnabled(false);
        btnagregarcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarcampoActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregarcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 225, -1, -1));

        btnaceptar.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 174, -1, -1));

        btncancelar.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 174, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_199819880/agregarcampoplanta.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        // TODO add your handling code here:
       
       if(txtnombreplanta.getText().trim().length()==0 || txtcantplanta.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "Debe de Llenar los datos de Nombre de jugador y Cantidad de Plantas para continuar");
 }
 else
 {
       
        
        
        
        ListaJugador.Plantas.insertar(txtnombreplanta.getText());
        ListaJugador.Plantas.insertaruno(txtcantplanta.getText());
        
        txtnombreplanta.setText("");
        txtcantplanta.setText("");
        
        txtnombreplanta.setEnabled(false);
        txtcantplanta.setEnabled(false);
        btnagregarcampo.setEnabled(true);
        
        ListaJugador.Plantas.recorrer();
 }
        
        
        
        
        
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnagregarcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarcampoActionPerformed
        // TODO add your handling code here:
        agregarCampo campo = new agregarCampo();
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
            java.util.logging.Logger.getLogger(PlantasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlantasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlantasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlantasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlantasUsuario().setVisible(true);
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
    private javax.swing.JTextField txtcantplanta;
    private javax.swing.JTextField txtnombreplanta;
    // End of variables declaration//GEN-END:variables
}
