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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felipe
 */
public class MenuUnidadMed extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuUnidadMed
     */
    public MenuUnidadMed() {
        initComponents();
        mostrarDatosMedidas("");
        codigo_txt.setVisible(false);
    }
    
    void mostrarDatosMedidas(String valor) {
        
        String[] vecRegistros = new String[2];
        String consultaSql="";
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Medida"); //Estos son los nombres de las Columnas
        tbMedidas.setModel(modelo);
        
        if(valor.equals("")){
            consultaSql = "select * from MEDIDAS";
        }else{
            consultaSql= "select * from MEDIDAS where medida='"+valor.trim()+"'";
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
            tbMedidas.setModel(modelo); // mostramos los registros
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
        modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        meddida_lbl = new javax.swing.JPanel();
        medida_lbl = new javax.swing.JLabel();
        medida_txt = new javax.swing.JTextField();
        codigo_txt = new javax.swing.JTextField();
        crear_btn = new javax.swing.JButton();
        editar_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMedidas = new javax.swing.JTable();
        buscar_txt = new javax.swing.JTextField();
        buscar_lbl = new javax.swing.JButton();
        mostrar_lbl = new javax.swing.JButton();

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(modificar);

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
        setTitle("Unidades de medida");

        meddida_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de Medida"));

        medida_lbl.setText("Medida");

        medida_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medida_txtActionPerformed(evt);
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

        javax.swing.GroupLayout meddida_lblLayout = new javax.swing.GroupLayout(meddida_lbl);
        meddida_lbl.setLayout(meddida_lblLayout);
        meddida_lblLayout.setHorizontalGroup(
            meddida_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meddida_lblLayout.createSequentialGroup()
                .addGroup(meddida_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(meddida_lblLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(crear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, meddida_lblLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(medida_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(meddida_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(meddida_lblLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(meddida_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medida_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(meddida_lblLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(editar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        meddida_lblLayout.setVerticalGroup(
            meddida_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meddida_lblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(meddida_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medida_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medida_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(meddida_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbMedidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbMedidas.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbMedidas);

        buscar_lbl.setText("Buscar");
        buscar_lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_lblActionPerformed(evt);
            }
        });

        mostrar_lbl.setText("Mostrar Todo");
        mostrar_lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_lblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(buscar_lbl)
                        .addGap(64, 64, 64)
                        .addComponent(mostrar_lbl)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(meddida_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meddida_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_lbl)
                    .addComponent(mostrar_lbl))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medida_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medida_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medida_txtActionPerformed

    private void crear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_btnActionPerformed
 try {
            PreparedStatement pst = objConexion.prepareStatement("insert into MEDIDAS values(?,?)");
            pst.setInt(1, 0);
            pst.setString(2, medida_txt.getText());
            pst.executeUpdate();
            medida_txt.setText("");
             mostrarDatosMedidas(""); // llamamos el metodo aqui para que se muestren los datos que vamos insertando

        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crear_btnActionPerformed

    private void buscar_lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_lblActionPerformed
        mostrarDatosMedidas(buscar_txt.getText());
    }//GEN-LAST:event_buscar_lblActionPerformed

    private void mostrar_lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_lblActionPerformed
       mostrarDatosMedidas("");
    }//GEN-LAST:event_mostrar_lblActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        int fila = tbMedidas.getSelectedRow();
        if (fila >= 0) {
            codigo_txt.setText(tbMedidas.getValueAt(fila, 0).toString());
            medida_txt.setText(tbMedidas.getValueAt(fila, 1).toString());

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono  una fila");
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_btnActionPerformed
        try {
            PreparedStatement pr = objConexion.prepareStatement("UPDATE MEDIDAS set medida='"+medida_txt.getText()+"' where id_medidas='"+codigo_txt.getText()+"'");
            pr.executeUpdate();
            mostrarDatosMedidas("");
        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editar_btnActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila = tbMedidas.getSelectedRow();
        String cod="";
             cod = tbMedidas.getValueAt(fila, 0).toString(); // Capturando el valor de la fila seleccionada y la columna 0
        try {
            PreparedStatement pr = objConexion.prepareStatement("delete from MEDIDAS where id_medidas='"+cod+"'");
            pr.executeUpdate();
            mostrarDatosMedidas("");
        } catch (SQLException ex) {
            Logger.getLogger(Menutipoproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void codigo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_txtActionPerformed

    }//GEN-LAST:event_codigo_txtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JButton buscar_lbl;
    private javax.swing.JTextField buscar_txt;
    private javax.swing.JTextField codigo_txt;
    private javax.swing.JButton crear_btn;
    private javax.swing.JButton editar_btn;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel meddida_lbl;
    private javax.swing.JLabel medida_lbl;
    private javax.swing.JTextField medida_txt;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JButton mostrar_lbl;
    private javax.swing.JTable tbMedidas;
    // End of variables declaration//GEN-END:variables
    Conectardb objConectar = new Conectardb();
    Connection objConexion = objConectar.conexiondb();
}
