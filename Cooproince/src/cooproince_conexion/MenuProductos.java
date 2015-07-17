/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cooproince_conexion;

import java.sql.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felipe
 */
public class MenuProductos extends javax.swing.JInternalFrame {

    Conectardb objConectar = new Conectardb();
    Connection objConexion = objConectar.conexiondb();
    
    
    /**
     * Creates new form MenuProductos
     */
    public MenuProductos() {
        initComponents();
        
        String sql = "select * from CATEGORIA_PRODUCTO";
        String vec[] = new String[2];

        try {
            Statement est = objConexion.createStatement();
            ResultSet rel = est.executeQuery(sql);

            while (rel.next()) {
                vec[0] = rel.getString(1);
                vec[1] = rel.getString(2);
                jComboBox1.addItem(vec[1]);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sql = "select * from MEDIDAS";
       

        try {
            Statement est = objConexion.createStatement();
            ResultSet rel = est.executeQuery(sql);

            while (rel.next()) {
                vec[0] = rel.getString(1);
                vec[1] = rel.getString(2);
                jComboBox2.addItem(vec[1]);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        mostrar("");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Editar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        medida_lbl = new javax.swing.JLabel();
        producto = new javax.swing.JTextField();
        codigo_txt = new javax.swing.JTextField();
        crear_btn = new javax.swing.JButton();
        editar_btn = new javax.swing.JButton();
        medida_lbl1 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        codigo1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Editar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productos");
        setToolTipText("");

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        medida_lbl.setText("Productos");

        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });

        codigo_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_txtActionPerformed(evt);
            }
        });

        crear_btn.setText("Crear");
        crear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_btnActionPerformed(evt);
            }
        });

        editar_btn.setText("Editar");
        editar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_btnActionPerformed(evt);
            }
        });

        medida_lbl1.setText("Codigo");

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        jLabel1.setText("Categoria");

        jLabel2.setText("Medidas");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Descripcion");

        jLabel4.setText("Precio");

        jTextField1.setColumns(10);

        jLabel5.setText("Cantidad");

        codigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(crear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medida_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medida_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(editar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(medida_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(medida_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(editar_btn))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(crear_btn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jScrollPane2.setComponentPopupMenu(jPopupMenu1);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Tabla.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(Tabla);

        buscar.setColumns(10);

        jButton4.setText("Motrar todo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrar(String valor){
    
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Producto");
        model.addColumn("Codigo de producto");
        model.addColumn("Categoria");
        model.addColumn("Medida");
        model.addColumn("Descripcion");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        Tabla.setModel(model);
        String[] vec = new String[8];
        String sql = "";

        if (valor.equals("")) {
            sql = "select * from PRODUCTO";
        } else {
            sql = "select * from PRODUCTO where cod_producto= '" + valor.trim() + "'";
        }

        try {
            Statement est = objConexion.createStatement();
            ResultSet rel = est.executeQuery(sql);

            while (rel.next()) {
                vec[0] = rel.getString(1);
                vec[1] = rel.getString(2);
                vec[2] = rel.getString(3);
                vec[3] = rel.getString(4);
                vec[4] = rel.getString(5);
                vec[5] = rel.getString(6);
                vec[6] = rel.getString(7);
                vec[7] = rel.getString(8);
               
                model.addRow(vec);
            }
            Tabla.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    
    }
    
    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoActionPerformed

    private void codigo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_txtActionPerformed

    }//GEN-LAST:event_codigo_txtActionPerformed

    private void crear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_btnActionPerformed
        try {
            PreparedStatement pst = objConexion.prepareStatement("insert into PRODUCTO values(?,?,?,?,?,?,?,?)");
            pst.setInt(1, 0);
            pst.setString(2, producto.getText());
            pst.setString(3, codigo1.getText());
            int aux = jComboBox1.getSelectedIndex();
            aux++;
            pst.setString(4, String.valueOf(aux));
            aux = jComboBox2.getSelectedIndex();
            aux++;
            pst.setString(5, String.valueOf(aux));
            pst.setString(6, jTextArea1.getText());
            pst.setString(7, jTextField1.getText());
            pst.setString(8, cantidad.getText());
            pst.executeUpdate();
            producto.setText("");
            codigo1.setText("");
            jTextArea1.setText("");
            jTextField1.setText("");
            cantidad.setText("");
            codigo_txt.setText("");
            mostrar(""); // llamamos el metodo aqui para que se muestren los datos que vamos insertando

        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        mostrar("");
        
        
    }//GEN-LAST:event_crear_btnActionPerformed

    private void editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_btnActionPerformed

        try {
            String sql="UPDATE PRODUCTO set nb_producto='"+producto.getText()+"' where id_producto='"+codigo_txt.getText()+"'";
            PreparedStatement pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();
            
            
            sql="UPDATE PRODUCTO set cod_producto='"+codigo1.getText()+"' where id_producto='"+codigo_txt.getText()+"'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();
            
            int a = jComboBox1.getSelectedIndex();
            a++;
            System.out.println(a);
            sql="UPDATE PRODUCTO set id_categoriaProd='"+String.valueOf(a)+"' where id_producto='"+codigo_txt.getText()+"'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();

            a = jComboBox2.getSelectedIndex();
            a++;
             System.out.println(a);
            sql="UPDATE PRODUCTO set id_medidas='"+String.valueOf(a)+"' where id_producto='"+codigo_txt.getText()+"'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();
            
            
            sql="UPDATE PRODUCTO set descripcion='"+jTextArea1.getText()+"' where id_producto='"+codigo_txt.getText()+"'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();
    
            sql="UPDATE PRODUCTO set precio_actual='"+jTextField1.getText()+"' where id_producto='"+codigo_txt.getText()+"'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();
            
            
            
            sql="UPDATE PRODUCTO set cantidad='"+cantidad.getText()+"' where id_producto='"+codigo_txt.getText()+"'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();
            
            producto.setText("");
            codigo1.setText("");
            jTextArea1.setText("");
            jTextField1.setText("");
            cantidad.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox1.setSelectedIndex(0);
            codigo_txt.setText("");
            mostrar("");
        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editar_btnActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        mostrar("");
        buscar.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mostrar(buscar.getText());
        System.out.println("busca");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        
                // TODO add your handling code here:
       int row = Tabla.getSelectedRow();
        if (row >= 0) {

            String[] vec = new String[8];
            String sql = "";
            String valor = Tabla.getValueAt(row, 0).toString();
            System.out.println("cod  "+valor);
            vec = new String[11];
                System.out.println(valor);
            if (valor.equals("")) {
                sql = "select * from PRODUCTO";
            } else {
                sql = "select * from PRODUCTO where id_producto = '" + valor.trim() + "'";
            }

            try {
                Statement est = objConexion.createStatement();
                ResultSet rel = est.executeQuery(sql);

                while (rel.next()) {
                    vec[0] = rel.getString(1);
                    vec[1] = rel.getString(2);
                    vec[2] = rel.getString(3);
                    vec[3] = rel.getString(4);
                    vec[4] = rel.getString(5);
                    vec[5] = rel.getString(6);
                    vec[6] = rel.getString(7);
                    vec[7] = rel.getString(8);
                }
                
                codigo_txt.setText(vec[0]);
                producto.setText(vec[1]);
                codigo1.setText(vec[2]);
              
                int aux = Integer.parseInt(vec[3]);
                aux--;
                jComboBox1.setSelectedIndex(aux);
                aux = Integer.parseInt(vec[4]);
                aux--;
                jComboBox2.setSelectedIndex(aux);
                jTextArea1.setText(vec[5]);
                jTextField1.setText(vec[6]);
                cantidad.setText(vec[7]);
                
                
                

            } catch (SQLException ex) {
                Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono  una fila");
        }
        
        
    }//GEN-LAST:event_EditarActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        
          int row = Tabla.getSelectedRow();
        if (row >= 0) {
            String cod = Tabla.getValueAt(row, 0).toString();
            String sql = "Delete from PRODUCTO where id_producto = '" + cod + "'";
            PreparedStatement pat;
            try {
                pat = objConexion.prepareStatement(sql);
                pat.executeUpdate();
                mostrar("");
            } catch (SQLException ex) {
                Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono  una fila");
        }
    }//GEN-LAST:event_EliminarActionPerformed
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextField codigo_txt;
    private javax.swing.JButton crear_btn;
    private javax.swing.JButton editar_btn;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel medida_lbl;
    private javax.swing.JLabel medida_lbl1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField producto;
    // End of variables declaration//GEN-END:variables
}

