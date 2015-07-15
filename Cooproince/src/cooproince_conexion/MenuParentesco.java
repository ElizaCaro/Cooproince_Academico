/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cooproince_conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author felipe
 */
public class MenuParentesco extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuParentesco
     */
    public MenuParentesco() {
        initComponents();
        mostrarDatosParentesco("");
        //codigo_txt.setVisible(false);
    }
    
     void mostrarDatosParentesco(String valor) {
        
        String[] vecRegistros = new String[2];
        String consultaSql="";
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Parentesco"); //Estos son los nombres de las Columnas
        tb_parentesco.setModel(modelo);
        
        if(valor.equals("")){
            consultaSql = "select * from TIPO_PARENTESCO";
        }else{
            consultaSql= "select * from TIPO_PARENTESCO where nb_tipoParentesco='"+valor.trim()+"'";
        }
        
        try {
            Statement st = objConexion.createStatement();
            ResultSet rs = st.executeQuery(consultaSql); //Almacena los datos de la consulta ue se va a realizar
            while(rs.next()){
                //Mostrando en la tabla
              vecRegistros[0]= rs.getString(1);
              vecRegistros[1]= rs.getString(2);
              modelo.addRow(vecRegistros);
            }
           tb_parentesco.setModel(modelo); // mostramos los registros
        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        codigo_txt = new javax.swing.JTextField();
        parentesco_lbl = new javax.swing.JLabel();
        parentesco_txt = new javax.swing.JTextField();
        crear_btn = new javax.swing.JButton();
        editar_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_parentesco = new javax.swing.JTable();
        buscar_txt = new javax.swing.JTextField();
        buscar_btn = new javax.swing.JButton();
        mostrar_btn = new javax.swing.JButton();

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Modificar);

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
        setTitle("Parentesco");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de Parentesco"));

        parentesco_lbl.setText("Parentesco");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(parentesco_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parentesco_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(editar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentesco_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parentesco_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        tb_parentesco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_parentesco.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tb_parentesco);

        buscar_btn.setText("Buscar");
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        mostrar_btn.setText("Mostrar Todo");
        mostrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(buscar_btn)
                                .addGap(67, 67, 67)
                                .addComponent(mostrar_btn)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_btn)
                    .addComponent(mostrar_btn))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_btnActionPerformed
        try {
            PreparedStatement pst = objConexion.prepareStatement("insert into TIPO_PARENTESCO values(?,?)");
            pst.setInt(1, 0);
            pst.setString(2, parentesco_txt.getText());
            pst.executeUpdate();
            mostrarDatosParentesco(""); // llamamos el metodo aqui para que se muestren los datos que vamos insertando

        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crear_btnActionPerformed

    private void editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_btnActionPerformed
        try {
            PreparedStatement pr = objConexion.prepareStatement("UPDATE TIPO_PARENTESCO set nb_tipoParentesco='"+parentesco_txt.getText()+"' where id_tipoParentesco='"+codigo_txt.getText()+"'");
            pr.executeUpdate();
            mostrarDatosParentesco("");
        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editar_btnActionPerformed

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        mostrarDatosParentesco(buscar_txt.getText());
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void mostrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_btnActionPerformed
        mostrarDatosParentesco("");
    }//GEN-LAST:event_mostrar_btnActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        int fila = tb_parentesco.getSelectedRow();
        if (fila >= 0) {
            codigo_txt.setText(tb_parentesco.getValueAt(fila, 0).toString());
            parentesco_txt.setText(tb_parentesco.getValueAt(fila, 1).toString());

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono  una fila");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila = tb_parentesco.getSelectedRow();
        String cod="";
             cod = tb_parentesco.getValueAt(fila, 0).toString(); // Capturando el valor de la fila seleccionada y la columna 0
        try {
            PreparedStatement pr = objConexion.prepareStatement("DELETE from TIPO_PARENTESCO where id_tipoParentesco='"+cod+"'");
            pr.executeUpdate();
            mostrarDatosParentesco("");
        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JTextField buscar_txt;
    private javax.swing.JTextField codigo_txt;
    private javax.swing.JButton crear_btn;
    private javax.swing.JButton editar_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrar_btn;
    private javax.swing.JLabel parentesco_lbl;
    private javax.swing.JTextField parentesco_txt;
    private javax.swing.JTable tb_parentesco;
    // End of variables declaration//GEN-END:variables
    Conectardb objConectar = new Conectardb();
    Connection objConexion = objConectar.conexiondb();
}
