/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_199819880;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Allan
 */
public class InsertarPlantas extends javax.swing.JFrame {

    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen", "jpg");
   String rutaimagen;
   //ListaCatalogoPlantas listacatalogo = new ListaCatalogoPlantas();
    /**
     * Creates new form InsertarPlantas
     */
    public InsertarPlantas() {
        initComponents();
             rutaimagen = "";
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblpdefensa = new javax.swing.JLabel();
        lblpdano = new javax.swing.JLabel();
        lbltipo = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtpdefensa = new javax.swing.JTextField();
        txtpdano = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        btnbuscarimagen = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblrutafoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblimagenes = new javax.swing.JLabel();
        lblruta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("HouseofTerror", 0, 24)); // NOI18N
        lbltitulo.setText("Agregar Plantas");
        getContentPane().add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 25, -1, -1));

        lblnombre.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblnombre.setText("Nombre:");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 75, -1, -1));

        lblpdefensa.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblpdefensa.setText("Puntos de Defensa:");
        getContentPane().add(lblpdefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 118, -1, -1));

        lblpdano.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblpdano.setText("Puntos de Daño:");
        getContentPane().add(lblpdano, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 153, -1, -1));

        lbltipo.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lbltipo.setText("Tipo de Planta:");
        getContentPane().add(lbltipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 189, -1, -1));

        lblimagen.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        lblimagen.setText("Imagen:");
        getContentPane().add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 75, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 80, 139, -1));

        txtpdefensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpdefensaActionPerformed(evt);
            }
        });
        getContentPane().add(txtpdefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 118, 139, -1));

        txtpdano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpdanoActionPerformed(evt);
            }
        });
        getContentPane().add(txtpdano, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 158, 139, -1));

        txttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoActionPerformed(evt);
            }
        });
        getContentPane().add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 194, 139, -1));

        btnbuscarimagen.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btnbuscarimagen.setText("Buscar Imagen");
        btnbuscarimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarimagenActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscarimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 300, -1, -1));

        btnaceptar.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 249, -1, -1));

        btncancelar.setFont(new java.awt.Font("HouseofTerror", 0, 18)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 249, -1, -1));
        getContentPane().add(lblrutafoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 382, 154, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimagenes, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimagenes, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 118, -1, -1));
        getContentPane().add(lblruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 266, 206, 16));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_199819880/agregarcampoplanta.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpdanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpdanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpdanoActionPerformed

    private void txttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoActionPerformed

    private void btnbuscarimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarimagenActionPerformed
        // TODO add your handling code here:
        JFileChooser dlg = new JFileChooser();
        dlg.setFileFilter(filter);
        int option = dlg.showOpenDialog(this);
        if(option== JFileChooser.APPROVE_OPTION){
        
            String file = dlg.getSelectedFile().getPath();
            String ruta = dlg.getSelectedFile().toString();
            lblimagenes.setIcon(new ImageIcon(file));
            
            ImageIcon icon = new ImageIcon(file);
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(155, 175, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newicon = new ImageIcon(newimg);
            lblimagenes.setIcon(newicon);
            lblimagenes.setSize(155, 175);
            lblruta.setText(file);
            rutaimagen="";
            
            
        }

        

    }//GEN-LAST:event_btnbuscarimagenActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        // TODO add your handling code here:
        //ListaCatalogoPlantas listacatalogo = new ListaCatalogoPlantas();
        ListaCatalogoPlantas.listacatalogo.insertafinal(lblruta.getText(), txtnombre.getText(), Integer.parseInt(txtpdano.getText()) ,Integer.parseInt(txtpdefensa.getText()) ,txttipo.getText());
        ListaCatalogoPlantas.listacatalogo.mostrar();
        txtnombre.setText("");
        txtpdano.setText("");
        txtpdefensa.setText("");
        txttipo.setText("");
        
        CatalogoPlantas lista = new CatalogoPlantas(ListaCatalogoPlantas.listacatalogo);
        lista.setVisible(true);
        lista.setResizable(false);
        lista.setLocationRelativeTo(null);
      this.dispose();
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void txtpdefensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpdefensaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpdefensaActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarPlantas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnbuscarimagen;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblimagenes;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblpdano;
    private javax.swing.JLabel lblpdefensa;
    private javax.swing.JLabel lblruta;
    private javax.swing.JLabel lblrutafoto;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpdano;
    private javax.swing.JTextField txtpdefensa;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables

   
}
