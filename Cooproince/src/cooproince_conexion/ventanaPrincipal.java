package cooproince_conexion;

import javax.swing.JMenu;

/**
 *
 * @author Esneldy
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    IngresoBD objIngreso;
    public String usuario;
    public int idusuario;
    
    public ventanaPrincipal(IngresoBD objdb) {
        initComponents();
        objIngreso = objdb;
        this.setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        Paintern = new javax.swing.JDesktopPane();
        menuPrincipal = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        itemCerrarsesion = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        itemPerfilusuario = new javax.swing.JMenuItem();
        menuProduccion = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuParametros = new javax.swing.JMenu();
        itemTipoproducto = new javax.swing.JMenuItem();
        itemTipoproduccion = new javax.swing.JMenuItem();
        itemTipoincidencia = new javax.swing.JMenuItem();
        itemMedidas = new javax.swing.JMenuItem();
        menuOperaciones = new javax.swing.JMenu();
        itemProductos = new javax.swing.JMenuItem();
        itemActividades = new javax.swing.JMenuItem();
        menuAlmacen = new javax.swing.JMenu();
        itemConsultas = new javax.swing.JMenuItem();
        itemOpealmacen = new javax.swing.JMenuItem();
        menuAnimales = new javax.swing.JMenu();
        menuParametrosAni = new javax.swing.JMenu();
        itemRazas = new javax.swing.JMenuItem();
        itemParentesco = new javax.swing.JMenuItem();
        itemEstatus = new javax.swing.JMenuItem();
        menuOperacionesAni = new javax.swing.JMenu();
        itemAnimales = new javax.swing.JMenuItem();
        itemPerfiles = new javax.swing.JMenuItem();
        menuInformes = new javax.swing.JMenu();
        menuProduccionInf = new javax.swing.JMenu();
        itemMovimientos = new javax.swing.JMenuItem();
        menuAnimalesInf = new javax.swing.JMenu();
        itemRegistroAni = new javax.swing.JMenuItem();
        itemPerfilesInf = new javax.swing.JMenuItem();
        menuAdministracion = new javax.swing.JMenu();
        itemTipousuario = new javax.swing.JMenuItem();
        itemUsuario = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coop. Cooproince INICIO");
        setBackground(new java.awt.Color(102, 153, 255));

        Paintern.setBackground(new java.awt.Color(46, 135, 2));

        menuInicio.setText("Inicio");

        itemCerrarsesion.setText("Cerrar Sesion");
        itemCerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarsesionActionPerformed(evt);
            }
        });
        menuInicio.add(itemCerrarsesion);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuInicio.add(itemSalir);

        itemPerfilusuario.setText("Perfil de Usuario");
        itemPerfilusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPerfilusuarioActionPerformed(evt);
            }
        });
        menuInicio.add(itemPerfilusuario);

        menuPrincipal.add(menuInicio);

        menuProduccion.setText("Produccion");
        menuProduccion.add(jSeparator1);

        menuParametros.setText("Parametros");
        menuParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuParametrosActionPerformed(evt);
            }
        });

        itemTipoproducto.setText("Tipo de Producto");
        itemTipoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTipoproductoActionPerformed(evt);
            }
        });
        menuParametros.add(itemTipoproducto);

        itemTipoproduccion.setText("Tipo de Produccion");
        itemTipoproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTipoproduccionActionPerformed(evt);
            }
        });
        menuParametros.add(itemTipoproduccion);

        itemTipoincidencia.setText("Tipo de Incidencia");
        itemTipoincidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTipoincidenciaActionPerformed(evt);
            }
        });
        menuParametros.add(itemTipoincidencia);

        itemMedidas.setText("Medidas");
        itemMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMedidasActionPerformed(evt);
            }
        });
        menuParametros.add(itemMedidas);

        menuProduccion.add(menuParametros);

        menuOperaciones.setText("Operaciones");

        itemProductos.setText("Productos");
        itemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductosActionPerformed(evt);
            }
        });
        menuOperaciones.add(itemProductos);

        itemActividades.setText("Actividades");
        itemActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActividadesActionPerformed(evt);
            }
        });
        menuOperaciones.add(itemActividades);

        menuProduccion.add(menuOperaciones);

        menuAlmacen.setText("Almacen");

        itemConsultas.setText("Consultas");
        itemConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultasActionPerformed(evt);
            }
        });
        menuAlmacen.add(itemConsultas);

        itemOpealmacen.setText("Operaciones de Almacen");
        itemOpealmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpealmacenActionPerformed(evt);
            }
        });
        menuAlmacen.add(itemOpealmacen);

        menuProduccion.add(menuAlmacen);

        menuPrincipal.add(menuProduccion);

        menuAnimales.setText("Animales");

        menuParametrosAni.setText("Parametros");

        itemRazas.setText("Razas");
        itemRazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRazasActionPerformed(evt);
            }
        });
        menuParametrosAni.add(itemRazas);

        itemParentesco.setText("Parentescos");
        itemParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemParentescoActionPerformed(evt);
            }
        });
        menuParametrosAni.add(itemParentesco);

        itemEstatus.setText("Estatus");
        itemEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEstatusActionPerformed(evt);
            }
        });
        menuParametrosAni.add(itemEstatus);

        menuAnimales.add(menuParametrosAni);

        menuOperacionesAni.setText("Operaciones");

        itemAnimales.setText("Animales");
        itemAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAnimalesActionPerformed(evt);
            }
        });
        menuOperacionesAni.add(itemAnimales);

        itemPerfiles.setText("Perfiles");
        itemPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPerfilesActionPerformed(evt);
            }
        });
        menuOperacionesAni.add(itemPerfiles);

        menuAnimales.add(menuOperacionesAni);

        menuPrincipal.add(menuAnimales);

        menuInformes.setText("Informes");

        menuProduccionInf.setText("Produccion");

        itemMovimientos.setText("Movimientos");
        itemMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMovimientosActionPerformed(evt);
            }
        });
        menuProduccionInf.add(itemMovimientos);

        menuInformes.add(menuProduccionInf);

        menuAnimalesInf.setText("Animales");

        itemRegistroAni.setText("Registros Animal");
        itemRegistroAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroAniActionPerformed(evt);
            }
        });
        menuAnimalesInf.add(itemRegistroAni);

        itemPerfilesInf.setText("Perfiles");
        itemPerfilesInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPerfilesInfActionPerformed(evt);
            }
        });
        menuAnimalesInf.add(itemPerfilesInf);

        menuInformes.add(menuAnimalesInf);

        menuPrincipal.add(menuInformes);

        menuAdministracion.setText("Administrador");
        menuAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdministracionActionPerformed(evt);
            }
        });

        itemTipousuario.setText("Tipo de usuarios");
        itemTipousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTipousuarioActionPerformed(evt);
            }
        });
        menuAdministracion.add(itemTipousuario);

        itemUsuario.setText("Usuarios");
        itemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuarioActionPerformed(evt);
            }
        });
        menuAdministracion.add(itemUsuario);

        menuPrincipal.add(menuAdministracion);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Paintern, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Paintern, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMedidasActionPerformed
        // TODO add your handling code here:
        MenuUnidadMed mtp;
        mtp = new MenuUnidadMed();
        Paintern.add(mtp);
        mtp.show();
        
    }//GEN-LAST:event_itemMedidasActionPerformed

    private void itemAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnimalesActionPerformed
        // TODO add your handling code here:
        MenuAnimales mtp;
        mtp = new MenuAnimales();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemAnimalesActionPerformed

    private void menuParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuParametrosActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_menuParametrosActionPerformed

    private void itemTipoproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTipoproduccionActionPerformed
        // TODO add your handling code here:
        MenuTipoproducion mtp;
        mtp = new MenuTipoproducion ();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemTipoproduccionActionPerformed

    private void itemTipoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTipoproductoActionPerformed
        // TODO add your handling code here:
        Menutipoproducto mtp;
        mtp = new Menutipoproducto();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemTipoproductoActionPerformed

    private void itemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductosActionPerformed
        // TODO add your handling code here:
        MenuProductos mtp;
        mtp = new MenuProductos();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemProductosActionPerformed

    private void itemRazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRazasActionPerformed
        // TODO add your handling code here:
        MenuRazas mtp;
        mtp = new MenuRazas();
        Paintern.add(mtp);
        mtp.show();
        
    }//GEN-LAST:event_itemRazasActionPerformed

    private void itemParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemParentescoActionPerformed
        // TODO add your handling code here:
        MenuParentesco mtp;
        mtp = new MenuParentesco();
        Paintern.add(mtp);
        mtp.show();
        
    }//GEN-LAST:event_itemParentescoActionPerformed

    private void itemTipoincidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTipoincidenciaActionPerformed
        // TODO add your handling code here:
        Menutipoincidencias mtp;
        mtp = new Menutipoincidencias();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemTipoincidenciaActionPerformed

    private void itemTipousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTipousuarioActionPerformed
        // TODO add your handling code here:
        Menutipousuario mtp;
        mtp = new Menutipousuario();
        Paintern.add(mtp);
        mtp.show();
        
    }//GEN-LAST:event_itemTipousuarioActionPerformed

    private void itemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuarioActionPerformed
        // TODO add your handling code here:
        Menuusuario mtp;
        mtp = new Menuusuario();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemUsuarioActionPerformed

    private void itemConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultasActionPerformed
        // TODO add your handling code here:
        Opconsultaalm mtp;
        mtp = new Opconsultaalm ();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemConsultasActionPerformed

    private void itemOpealmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpealmacenActionPerformed
        // TODO add your handling code here:
        OpoperaAlm mtp;
        mtp = new OpoperaAlm ();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemOpealmacenActionPerformed

    private void itemPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPerfilesActionPerformed
        // TODO add your handling code here:
        Opperfiles mtp;
        mtp = new Opperfiles ();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemPerfilesActionPerformed

    private void itemActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActividadesActionPerformed
        // TODO add your handling code here:
        Opproduccion mtp;
        mtp = new Opproduccion ();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemActividadesActionPerformed

    private void itemMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMovimientosActionPerformed
        // TODO add your handling code here:
        Infhisalm mtp;
        mtp = new Infhisalm ();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemMovimientosActionPerformed

    private void itemRegistroAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroAniActionPerformed
        // TODO add your handling code here:
        InfoHisAni mtp;
        mtp = new InfoHisAni ();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemRegistroAniActionPerformed

    private void itemPerfilesInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPerfilesInfActionPerformed
        // TODO add your handling code here:
        InfHisProd mtp;
        mtp = new InfHisProd ();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemPerfilesInfActionPerformed

    private void itemCerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarsesionActionPerformed
        
        objIngreso.setVisible(true);
        objIngreso.pack();
        this.setVisible(false);
    }//GEN-LAST:event_itemCerrarsesionActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void menuAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdministracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAdministracionActionPerformed

    private void itemEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEstatusActionPerformed
       MenuEstatus mtp;
       mtp = new MenuEstatus();
        Paintern.add(mtp);
        mtp.show();
    }//GEN-LAST:event_itemEstatusActionPerformed

    private void itemPerfilusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPerfilusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemPerfilusuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public JMenu getMenuAdministracion() {
        return menuAdministracion;
    }

    
    
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Paintern;
    private javax.swing.JMenuItem itemActividades;
    private javax.swing.JMenuItem itemAnimales;
    private javax.swing.JMenuItem itemCerrarsesion;
    private javax.swing.JMenuItem itemConsultas;
    private javax.swing.JMenuItem itemEstatus;
    private javax.swing.JMenuItem itemMedidas;
    private javax.swing.JMenuItem itemMovimientos;
    private javax.swing.JMenuItem itemOpealmacen;
    private javax.swing.JMenuItem itemParentesco;
    private javax.swing.JMenuItem itemPerfiles;
    private javax.swing.JMenuItem itemPerfilesInf;
    private javax.swing.JMenuItem itemPerfilusuario;
    private javax.swing.JMenuItem itemProductos;
    private javax.swing.JMenuItem itemRazas;
    private javax.swing.JMenuItem itemRegistroAni;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemTipoincidencia;
    private javax.swing.JMenuItem itemTipoproduccion;
    private javax.swing.JMenuItem itemTipoproducto;
    private javax.swing.JMenuItem itemTipousuario;
    private javax.swing.JMenuItem itemUsuario;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAdministracion;
    private javax.swing.JMenu menuAlmacen;
    private javax.swing.JMenu menuAnimales;
    private javax.swing.JMenu menuAnimalesInf;
    private javax.swing.JMenu menuInformes;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuOperaciones;
    private javax.swing.JMenu menuOperacionesAni;
    private javax.swing.JMenu menuParametros;
    private javax.swing.JMenu menuParametrosAni;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuProduccion;
    private javax.swing.JMenu menuProduccionInf;
    // End of variables declaration//GEN-END:variables
}
