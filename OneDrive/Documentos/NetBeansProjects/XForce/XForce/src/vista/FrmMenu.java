package vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;


public class FrmMenu extends javax.swing.JFrame {
    
    public static JDesktopPane jDesktopPanelin;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 800));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Punto de Ventas");
        
        this.setLayout(null);
        jDesktopPanelin = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        this.jDesktopPanelin.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPanelin);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUser = new javax.swing.JMenu();
        jMenuINewUser = new javax.swing.JMenuItem();
        jMenuUserGestion = new javax.swing.JMenuItem();
        jMenuPc = new javax.swing.JMenu();
        jMenuNewPc = new javax.swing.JMenuItem();
        jMenuProduct = new javax.swing.JMenuItem();
        jMenuStock = new javax.swing.JMenuItem();
        jMenuClient = new javax.swing.JMenu();
        jMenuNewClient = new javax.swing.JMenuItem();
        jMenuGestionClient = new javax.swing.JMenuItem();
        jMenuCategory = new javax.swing.JMenu();
        jMenuNewCategory = new javax.swing.JMenuItem();
        jMenuGestionCategory = new javax.swing.JMenuItem();
        jMenuTaxes = new javax.swing.JMenu();
        jMenuNewSell = new javax.swing.JMenuItem();
        jMenuGestionSell = new javax.swing.JMenuItem();
        jMenuReport = new javax.swing.JMenu();
        jMenuClientReport = new javax.swing.JMenuItem();
        jMenuCategoryReport = new javax.swing.JMenuItem();
        jMenuProductReport = new javax.swing.JMenuItem();
        jMenuSellReport = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuHistory = new javax.swing.JMenuItem();
        jMenuLogOut = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();

        jMenuItem12.setText("jMenuItem12");

        jMenuItem14.setText("jMenuItem14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Usuario.png"))); // NOI18N
        jMenuUser.setText("Usuario");
        jMenuUser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jMenuUser.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuINewUser.setFont(new java.awt.Font("NT Josefine", 1, 12)); // NOI18N
        jMenuINewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Zoro.png"))); // NOI18N
        jMenuINewUser.setText("Nuevo Usuario");
        jMenuINewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuINewUserActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuINewUser);

        jMenuUserGestion.setFont(new java.awt.Font("NT Josefine", 1, 12)); // NOI18N
        jMenuUserGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ZoroQuesti.png"))); // NOI18N
        jMenuUserGestion.setText("Gestionar Usuarios");
        jMenuUser.add(jMenuUserGestion);

        jMenuBar1.add(jMenuUser);

        jMenuPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mini compu.png"))); // NOI18N
        jMenuPc.setText("Equipos");
        jMenuPc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jMenuPc.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuNewPc.setFont(new java.awt.Font("NT Josefine", 1, 12)); // NOI18N
        jMenuNewPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Granaje.png"))); // NOI18N
        jMenuNewPc.setText("Nuevo Productos");
        jMenuPc.add(jMenuNewPc);

        jMenuProduct.setFont(new java.awt.Font("NT Josefine", 1, 12)); // NOI18N
        jMenuProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Granaje cruz.png"))); // NOI18N
        jMenuProduct.setText("Gestionar Productos");
        jMenuProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductActionPerformed(evt);
            }
        });
        jMenuPc.add(jMenuProduct);

        jMenuStock.setFont(new java.awt.Font("NT Josefine", 1, 12)); // NOI18N
        jMenuStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GranajeCV.png"))); // NOI18N
        jMenuStock.setText("Actualizar Stock");
        jMenuPc.add(jMenuStock);

        jMenuBar1.add(jMenuPc);

        jMenuClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cliente.png"))); // NOI18N
        jMenuClient.setText("Cliente");
        jMenuClient.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jMenuClient.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuNewClient.setFont(new java.awt.Font("NT Josefine", 1, 12)); // NOI18N
        jMenuNewClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sanji.png"))); // NOI18N
        jMenuNewClient.setText("Nuevo Cliente");
        jMenuClient.add(jMenuNewClient);

        jMenuGestionClient.setFont(new java.awt.Font("NT Josefine", 1, 12)); // NOI18N
        jMenuGestionClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sanji cejon.png"))); // NOI18N
        jMenuGestionClient.setText("Gestionar Clientes");
        jMenuGestionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGestionClientActionPerformed(evt);
            }
        });
        jMenuClient.add(jMenuGestionClient);

        jMenuBar1.add(jMenuClient);

        jMenuCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categoria.png"))); // NOI18N
        jMenuCategory.setText("Categoria");
        jMenuCategory.setToolTipText("");
        jMenuCategory.setAlignmentX(0.0F);
        jMenuCategory.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jMenuCategory.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuNewCategory.setFont(new java.awt.Font("NT Josefine", 1, 12)); // NOI18N
        jMenuNewCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cuadros.png"))); // NOI18N
        jMenuNewCategory.setText("Nueva Categoria");
        jMenuNewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewCategoryActionPerformed(evt);
            }
        });
        jMenuCategory.add(jMenuNewCategory);

        jMenuGestionCategory.setFont(new java.awt.Font("NT Josefine", 1, 12)); // NOI18N
        jMenuGestionCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cuadros5.png"))); // NOI18N
        jMenuGestionCategory.setText("Gestionar Categorias");
        jMenuGestionCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGestionCategoryActionPerformed(evt);
            }
        });
        jMenuCategory.add(jMenuGestionCategory);

        jMenuBar1.add(jMenuCategory);

        jMenuTaxes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Factura.png"))); // NOI18N
        jMenuTaxes.setText("Facturar");
        jMenuTaxes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jMenuTaxes.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuNewSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/$.png"))); // NOI18N
        jMenuNewSell.setText("Nueva Venta");
        jMenuTaxes.add(jMenuNewSell);

        jMenuGestionSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/$$.png"))); // NOI18N
        jMenuGestionSell.setText("Gestionar Ventas");
        jMenuGestionSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGestionSellActionPerformed(evt);
            }
        });
        jMenuTaxes.add(jMenuGestionSell);

        jMenuBar1.add(jMenuTaxes);

        jMenuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reportes.png"))); // NOI18N
        jMenuReport.setText("Reportes");
        jMenuReport.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jMenuReport.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuClientReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lista.png"))); // NOI18N
        jMenuClientReport.setText("Reportes Clientes");
        jMenuReport.add(jMenuClientReport);

        jMenuCategoryReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lista.png"))); // NOI18N
        jMenuCategoryReport.setText("Reportes Categorias");
        jMenuCategoryReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCategoryReportActionPerformed(evt);
            }
        });
        jMenuReport.add(jMenuCategoryReport);

        jMenuProductReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lista.png"))); // NOI18N
        jMenuProductReport.setText("Reportes Productos");
        jMenuReport.add(jMenuProductReport);

        jMenuSellReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lista.png"))); // NOI18N
        jMenuSellReport.setText("Reportes Ventas");
        jMenuReport.add(jMenuSellReport);

        jMenuBar1.add(jMenuReport);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Historial.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Historial.png"))); // NOI18N
        jMenuHistory.setText("Ver Historial");
        jMenu7.add(jMenuHistory);

        jMenuBar1.add(jMenu7);

        jMenuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Log out.png"))); // NOI18N
        jMenuLogOut.setText("Log out");
        jMenuLogOut.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jMenuLogOut.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Log out.png"))); // NOI18N
        jMenuItem20.setText("Log out");
        jMenuLogOut.add(jMenuItem20);

        jMenuBar1.add(jMenuLogOut);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuINewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuINewUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuINewUserActionPerformed

    private void jMenuProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuProductActionPerformed

    private void jMenuGestionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGestionClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuGestionClientActionPerformed

    private void jMenuGestionSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGestionSellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuGestionSellActionPerformed

    private void jMenuCategoryReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCategoryReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCategoryReportActionPerformed

    private void jMenuNewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewCategoryActionPerformed
        JIFCategorys jIFcategorys = new JIFCategorys(); 
        jDesktopPanelin.add(jIFcategorys);
        jIFcategorys.setVisible(true);
    }//GEN-LAST:event_jMenuNewCategoryActionPerformed

    private void jMenuGestionCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGestionCategoryActionPerformed
        ITGestionCategory itGestionCategory = new ITGestionCategory();
        jDesktopPanelin.add(itGestionCategory);
        itGestionCategory.setVisible(true);
    }//GEN-LAST:event_jMenuGestionCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCategory;
    private javax.swing.JMenuItem jMenuCategoryReport;
    private javax.swing.JMenu jMenuClient;
    private javax.swing.JMenuItem jMenuClientReport;
    private javax.swing.JMenuItem jMenuGestionCategory;
    private javax.swing.JMenuItem jMenuGestionClient;
    private javax.swing.JMenuItem jMenuGestionSell;
    private javax.swing.JMenuItem jMenuHistory;
    private javax.swing.JMenuItem jMenuINewUser;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenu jMenuLogOut;
    private javax.swing.JMenuItem jMenuNewCategory;
    private javax.swing.JMenuItem jMenuNewClient;
    private javax.swing.JMenuItem jMenuNewPc;
    private javax.swing.JMenuItem jMenuNewSell;
    private javax.swing.JMenu jMenuPc;
    private javax.swing.JMenuItem jMenuProduct;
    private javax.swing.JMenuItem jMenuProductReport;
    private javax.swing.JMenu jMenuReport;
    private javax.swing.JMenuItem jMenuSellReport;
    private javax.swing.JMenuItem jMenuStock;
    private javax.swing.JMenu jMenuTaxes;
    private javax.swing.JMenu jMenuUser;
    private javax.swing.JMenuItem jMenuUserGestion;
    // End of variables declaration//GEN-END:variables
}
