/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnaceptar.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        lblcantidad.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblcantidad.setText("Cantidad:");

        btncancelar.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnagregarcampo.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btnagregarcampo.setText("Agregar Campo");
        btnagregarcampo.setEnabled(false);
        btnagregarcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarcampoActionPerformed(evt);
            }
        });

        lblnombre.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblnombre.setText("Nombre:");

        lbltitulo.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lbltitulo.setText("ZOMBIES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcantzombie, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtnombrezombie)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnagregarcampo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnaceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btncancelar)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbltitulo)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtnombrezombie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcantidad)
                    .addComponent(txtcantzombie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar)
                    .addComponent(btncancelar))
                .addGap(18, 18, 18)
                .addComponent(btnagregarcampo)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        // TODO add your handling code here:

        ListaJugadorZombie Zombie = new ListaJugadorZombie();

        Zombie.insertar(txtnombrezombie.getText());
        Zombie.insertar(txtcantzombie.getText());
        txtnombrezombie.setText("");
        txtcantzombie.setText("");

        txtnombrezombie.setEnabled(false);
        txtcantzombie.setEnabled(false);
        btnagregarcampo.setEnabled(true);

        Zombie.recorrer();

    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnagregarcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarcampoActionPerformed
        // TODO add your handling code here:
        AgregarCampoZombie campo = new AgregarCampoZombie();
        campo.show(true);
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
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtcantzombie;
    private javax.swing.JTextField txtnombrezombie;
    // End of variables declaration//GEN-END:variables
}
