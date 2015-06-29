/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooproince_conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felipe
 */
public class MenuTipoproducion extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuTipoproducion
     */
    public MenuTipoproducion() {
        initComponents();
        mostratipoproduccion("");
    }

    
    void mostratipoproduccion(String valor) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Tipo");
        TaTiproduccion.setModel(model);
        String[] vec = new String[2];
        String sql="";
        
        if(valor.equals("")){
             sql ="select * from TIPO_PRODUCCION";
        }else{
            sql = "select * from TIPO_PRODUCCION where '"+valor.trim()+"'";
        }
        
        
        

        try {
            Statement est = objConnection.createStatement();
            ResultSet rel = est.executeQuery("select * from TIPO_PRODUCCION");

            while (rel.next()) {
                vec[0] = rel.getString(1);
                vec[1] = rel.getString(2);
                model.addRow(vec);
            }
            TaTiproduccion.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Editar = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TipoProduccion = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        cod = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaTiproduccion = new javax.swing.JTable();
        texbuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        Modificar.setText("Editar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        Editar.add(Modificar);

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Editar.add(jMenuItem1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tipo de Produccion");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        jLabel1.setText("Nombre:");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TipoProduccion.setColumns(10);
        TipoProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoProduccionActionPerformed(evt);
            }
        });

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cod.setEditable(false);
        cod.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TipoProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)))
        );

        TaTiproduccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TaTiproduccion.setToolTipText("");
        TaTiproduccion.setComponentPopupMenu(Editar);
        TaTiproduccion.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(TaTiproduccion);

        texbuscar.setColumns(10);

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar todo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(texbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoProduccionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (TipoProduccion.getText().isEmpty() == false) {
            try {
                // TODO add your handling code here:
                PreparedStatement pat = objConnection.prepareStatement("Insert  into TIPO_PRODUCCION values(?,?)");
                pat.setInt(1, 0);
                pat.setString(2, TipoProduccion.getText());
                pat.executeUpdate();
                mostratipoproduccion("");
                TipoProduccion.setText("");

            } catch (SQLException ex) {
                Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("no se puede");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       mostratipoproduccion(texbuscar.getText());
        System.out.println("busca");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mostratipoproduccion("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:

        int row = TaTiproduccion.getSelectedRow();
        if(row >=0){
        cod.setText(TaTiproduccion.getValueAt(row, 0).toString());
        TipoProduccion.setText(TaTiproduccion.getValueAt(row, 1).toString());
        
        }else{
          JOptionPane.showMessageDialog(null,"No selecciono  una fila");
        }
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        try {
            // TODO add your handling code here:
            String sql = "Update TIPO_PRODUCCION  set nb_tipoProduccion = '"+TipoProduccion.getText()+"' where id_tipoProduccion = '"+cod.getText()+"'";
            PreparedStatement pat = objConnection.prepareStatement(sql);
            pat.executeUpdate();
            mostratipoproduccion("");    
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int row = TaTiproduccion.getSelectedRow();
        if(row >=0){
            String cod =TaTiproduccion.getValueAt(row, 0).toString();
            String sql ="Delete from TIPO_PRODUCCION where id_tipoProduccion = '"+cod+"'";
              PreparedStatement pat;
            try {
                pat = objConnection.prepareStatement(sql);
                pat.executeUpdate();
            mostratipoproduccion("");
            } catch (SQLException ex) {
                Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
            }
                
          
        }else{
          JOptionPane.showMessageDialog(null,"No selecciono  una fila");
        }
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    Conectardb objconectardb = new Conectardb();
    Connection objConnection = objconectardb.conexiondb();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Editar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JTable TaTiproduccion;
    private javax.swing.JTextField TipoProduccion;
    private javax.swing.JTextField cod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField texbuscar;
    // End of variables declaration//GEN-END:variables
}
