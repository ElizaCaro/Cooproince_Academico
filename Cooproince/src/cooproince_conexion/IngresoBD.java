package cooproince_conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * @author Esneldy
 */

public class IngresoBD extends javax.swing.JFrame {

    public IngresoBD() {
        initComponents();
    }

    public void Acceder(String usua, String pass) {
        int tipoUsuario = 0;
        String consSql = "SELECT * FROM USUARIO WHERE usuario='" + usua + "' && contrasena='" + pass + "'";
        try {
            Statement st = objConnection.createStatement();
            ResultSet rs = st.executeQuery(consSql); //Ejecutar sentencia sql
            while (rs.next())//ver datos que se capturaron de la consulta
            {
                tipoUsuario = rs.getInt("id_rol"); /*aqui capturamos el tipo de usuario*/
            }
            if (tipoUsuario == 1) {
                /*AUI PUEDO LLAMAR UNA VENTANA*/
                objventPrinc.setVisible(true);
                System.out.println("Es Administrador");
            }
            if (tipoUsuario == 2) {
                /*AUI PUEDO LLAMAR UNA VENTANA*/
                ventanaPrincipal transa = new ventanaPrincipal();
                transa.setVisible(true);
                this.setVisible(false);
                System.out.println("Es Socio");
            }
            if (tipoUsuario != 1 && tipoUsuario != 2) {
                JOptionPane.showMessageDialog(this, "No existen datos");
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngresoBD.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        Nombre_Principal = new javax.swing.JLabel();
        Usuario_label = new javax.swing.JLabel();
        usuario_text = new javax.swing.JTextField();
        Contraseña_label = new javax.swing.JLabel();
        contrasena_text = new javax.swing.JPasswordField();
        Entrar_button = new javax.swing.JButton();
        Salir_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso al Sistema");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cooproince_conexion/Logo Cooproince.png"))); // NOI18N

        Nombre_Principal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        Nombre_Principal.setText("Cooperativa Cooproince");

        Usuario_label.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        Usuario_label.setText("Usuario");

        usuario_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_textActionPerformed(evt);
            }
        });

        Contraseña_label.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        Contraseña_label.setText("Contraseña");

        contrasena_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasena_textActionPerformed(evt);
            }
        });

        Entrar_button.setText("ENTRAR");
        Entrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrar_buttonActionPerformed(evt);
            }
        });

        Salir_button.setText("SALIR");
        Salir_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Entrar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(Salir_button, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Nombre_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Contraseña_label)
                            .addComponent(Usuario_label))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario_text, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(contrasena_text)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(Logo)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addGap(9, 9, 9)
                .addComponent(Nombre_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Usuario_label)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(usuario_text)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Contraseña_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(contrasena_text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Entrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entrar_buttonActionPerformed
        String usuario=usuario_text.getText();
        String contrasena=contrasena_text.getText();
        Acceder(usuario, contrasena);
    }//GEN-LAST:event_Entrar_buttonActionPerformed

    private void Salir_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_buttonActionPerformed
        System.exit(0);     // TODO add your handling code here:
    }//GEN-LAST:event_Salir_buttonActionPerformed

    private void usuario_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuario_textActionPerformed

    private void contrasena_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasena_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasena_textActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña_label;
    private javax.swing.JButton Entrar_button;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Nombre_Principal;
    private javax.swing.JButton Salir_button;
    private javax.swing.JLabel Usuario_label;
    private javax.swing.JPasswordField contrasena_text;
    private javax.swing.JTextField usuario_text;
    // End of variables declaration//GEN-END:variables
Conectardb objconectardb = new Conectardb();
Connection objConnection = objconectardb.conexiondb();
ventanaPrincipal objventPrinc = new ventanaPrincipal();

}
