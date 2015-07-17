/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooproince_conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felipe
 */
public class OpoperaAlm extends javax.swing.JInternalFrame {

    /**
     * Creates new form OpoperaAlm
     */
    Conectardb objConectar = new Conectardb();
    Connection objConexion = objConectar.conexiondb();

    public OpoperaAlm() {
        initComponents();

        String sql = "select * from ALMACEN";
        String vec[] = new String[2];

        try {
            Statement est = objConexion.createStatement();
            ResultSet rel = est.executeQuery(sql);

            while (rel.next()) {
                vec[0] = rel.getString(1);
                vec[1] = rel.getString(3);
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
                jComboBox3.addItem(vec[1]);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
        setTitle("Operaciones de Almacen");

        jScrollPane1.setComponentPopupMenu(jPopupMenu1);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(Tabla);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimiento"));

        jTextField1.setColumns(5);

        jLabel1.setText("Producto");

        jLabel2.setText("Operacion");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregar", "Descontar" }));

        jLabel3.setText("Cantidad");

        jTextField2.setColumns(5);

        jLabel4.setText("Medidas");

        jLabel5.setText("Unidades");

        jTextField3.setColumns(5);

        jLabel6.setText("Precio X unidad");

        jTextField4.setColumns(5);

        jLabel7.setText("Precio Total");

        jTextField5.setColumns(5);

        jLabel8.setText("Fecha de operacion");

        jTextField6.setColumns(5);

        jLabel9.setText("Hora de operacion");

        jTextField7.setColumns(5);

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        buscar.setColumns(10);

        jButton3.setText("Buscar");

        jButton4.setText("Mostrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = objConexion.prepareStatement("insert into PRODUCTO_ALMACEN values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, 0);
            pst.setInt(2, 0);
            pst.setInt(3, jComboBox1.getSelectedIndex() + 1);
            pst.setInt(4, 0);
            pst.setInt(5, 0);
            pst.setInt(6, 0);
            java.util.Date var = new java.util.Date();
            Date date;
            date = new Date(var.getTime());
            pst.setDate(7, date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int hours = calendar.get(Calendar.HOUR_OF_DAY);
            int minutes = calendar.get(Calendar.MINUTE);
            int seconds = calendar.get(Calendar.SECOND);
            java.sql.Time tim;
            tim = new java.sql.Time(hours, minutes, seconds);
            pst.setTime(8, tim);
            pst.setFloat(9, Float.parseFloat(jTextField2.getText()));
            pst.setInt(10, Integer.parseInt(jTextField3.getText()));
            pst.setInt(11, jComboBox3.getSelectedIndex()+1);
            pst.setFloat(12, Float.parseFloat(jTextField4.getText()));
            pst.setFloat(13, Float.parseFloat(jTextField5.getText()));
            
            jTextField2.setText("0");
            jTextField3.setText("0");
            jTextField4.setText("0");
            jTextField5.setText("0");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);

            pst.executeUpdate();

            mostrar(""); // llamamos el metodo aqui para que se muestren los datos que vamos insertando

        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }

        mostrar("");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        
        int row = Tabla.getSelectedRow();
        if (row >= 0) {

            String[] vec = new String[13];
            String sql = "";
            String valor = Tabla.getValueAt(row, 0).toString();
            
            if (valor.equals("")) {
                sql = "select * from PRODUCTO_ALMACEN";
            } else {
                sql = "select * from PRODUCTO_ALMACEN where id_ProductoAlmacen = '" + valor.trim() + "'";
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
                vec[8] = rel.getString(9);
                vec[9] = rel.getString(10);
                vec[10] = rel.getString(11);
                vec[11] = rel.getString(12);
                vec[12] = rel.getString(13);
              }
                
               jTextField1.setText(vec[0]);
               jComboBox1.setSelectedIndex(Integer.parseInt(vec[2])-1);
               jComboBox2.setSelectedIndex(Integer.parseInt(vec[5]));
               jTextField2.setText(vec[8]);
               jComboBox3.setSelectedIndex(Integer.parseInt(vec[10])-1);
               jTextField3.setText(vec[9]);
               jTextField4.setText(vec[11]);
               jTextField5.setText(vec[12]);
               jTextField6.setText(vec[6]);
               jTextField7.setText(vec[7]);
               
                

            } catch (SQLException ex) {
                Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono  una fila");
        }

        
        
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
           int row = Tabla.getSelectedRow();
        if (row >= 0) {
            String cod = Tabla.getValueAt(row, 0).toString();
            String sql = "Delete from PRODUCTO_ALMACEN where  id_ProductoAlmacen = '" + cod + "'";
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try {
            
            
            int a = jComboBox1.getSelectedIndex();
            a++;
            String sql = "UPDATE PRODUCTO_ALMACEN set 	id_almacen ='" + String.valueOf(a) + "' where id_ProductoAlmacen ='" + jTextField1.getText() + "'";
            PreparedStatement pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();

            a = jComboBox2.getSelectedIndex();
            a++;
            sql = "UPDATE PRODUCTO_ALMACEN set 	id_medidas='" + String.valueOf(a) + "' where id_ProductoAlmacen ='" + jTextField1.getText() + "'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();

            
            a = jComboBox3.getSelectedIndex();
           
            sql = "UPDATE PRODUCTO_ALMACEN set 	operacion ='" + String.valueOf(a) + "' where id_ProductoAlmacen ='" + jTextField1.getText() + "'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();

            
            sql = "UPDATE PRODUCTO_ALMACEN set 	cantidad ='" + jTextField2.getText() + "' where id_ProductoAlmacen ='" + jTextField1.getText() + "'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();
            
            sql = "UPDATE PRODUCTO_ALMACEN set cant_unidades ='" + jTextField3.getText() + "' where id_ProductoAlmacen ='" + jTextField1.getText() + "'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();
            
            sql = "UPDATE PRODUCTO_ALMACEN set precio_unidad ='" + jTextField4.getText() + "' where id_ProductoAlmacen ='" + jTextField1.getText() + "'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();
            
            sql = "UPDATE PRODUCTO_ALMACEN set precio_unidad ='" + jTextField5.getText() + "' where id_ProductoAlmacen ='" + jTextField1.getText() + "'";
            pr = objConexion.prepareStatement(sql);
            pr.executeUpdate();


            
            jTextField2.setText("0");
            jTextField3.setText("0");
            jTextField4.setText("0");
            jTextField5.setText("0");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);

            mostrar("");
        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    public void mostrar(String valor) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Producto");
        model.addColumn("Pertenece");
        model.addColumn("Tipo de Operacion");
        model.addColumn("Fecha de operacion");
        model.addColumn("Hora de operacion");
        model.addColumn("Cantidad");
        model.addColumn("Medidas");
        model.addColumn("Unidad");
        model.addColumn("Precio X unidad");
        model.addColumn("Precio Total");

        Tabla.setModel(model);
        String[] vec = new String[11];
        String sql = "";

        if (valor.equals("")) {
            sql = "select * from PRODUCTO_ALMACEN";
        } else {
            valor = String.valueOf(Integer.parseInt(valor) + 1);
            sql = "select * from PRODUCTO_ALMACEN where id_producto= '" + valor.trim() + "'";
        }

        try {
            Statement est = objConexion.createStatement();
            ResultSet rel = est.executeQuery(sql);

            while (rel.next()) {
                vec[0] = rel.getString(1);
                vec[1] = rel.getString(3);
                vec[2] = "operacion";
                vec[3] = rel.getString(6);
                vec[4] = rel.getString(7);
                vec[5] = rel.getString(8);
                vec[6] = rel.getString(9);
                vec[7] = rel.getString(10);
                vec[8] = rel.getString(11);
                vec[9] = rel.getString(12);
                vec[10] = rel.getString(13);

                model.addRow(vec);
            }
            Tabla.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(MenuTipoproducion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
