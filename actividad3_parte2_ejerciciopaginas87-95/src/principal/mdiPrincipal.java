/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package principal;

/**
 *
 * @author santi
 */
public class mdiPrincipal extends javax.swing.JFrame {
    private jpFormulario1 objFormulario1 = new jpFormulario1();
    private jpFormulario2 objFormulario2 = new jpFormulario2();
    
    private void inicializarFormularios(){
        jifFormulario1.setContentPane(objFormulario1);
        objFormulario1.setSize(300,300);
        jifFormulario1.setSize(300,300);
        
        jifFormulario2.setContentPane(objFormulario2);
        objFormulario2.setSize(300,300);
        jifFormulario2.setSize(300,300);
        
    }
    
    /**
     * Creates new form midPrincipal
     */
    public mdiPrincipal() {
        //
        initComponents();
        this.inicializarFormularios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jifFormulario1 = new javax.swing.JInternalFrame();
        jifFormulario2 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jmiFormulario1 = new javax.swing.JMenuItem();
        jmiFormulario2 = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jifFormulario1.setClosable(true);
        jifFormulario1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifFormulario1.setVisible(false);

        javax.swing.GroupLayout jifFormulario1Layout = new javax.swing.GroupLayout(jifFormulario1.getContentPane());
        jifFormulario1.getContentPane().setLayout(jifFormulario1Layout);
        jifFormulario1Layout.setHorizontalGroup(
            jifFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifFormulario1Layout.setVerticalGroup(
            jifFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifFormulario1);
        jifFormulario1.setBounds(10, 10, 170, 160);

        jifFormulario2.setClosable(true);
        jifFormulario2.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifFormulario2.setVisible(false);

        javax.swing.GroupLayout jifFormulario2Layout = new javax.swing.GroupLayout(jifFormulario2.getContentPane());
        jifFormulario2.getContentPane().setLayout(jifFormulario2Layout);
        jifFormulario2Layout.setHorizontalGroup(
            jifFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifFormulario2Layout.setVerticalGroup(
            jifFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifFormulario2);
        jifFormulario2.setBounds(210, 10, 170, 170);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        desktopPane.add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 400, 280);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        jmiFormulario1.setMnemonic('o');
        jmiFormulario1.setText("Formulario 1");
        jmiFormulario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormulario1ActionPerformed(evt);
            }
        });
        fileMenu.add(jmiFormulario1);

        jmiFormulario2.setMnemonic('s');
        jmiFormulario2.setText("Formulario 2");
        jmiFormulario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormulario2ActionPerformed(evt);
            }
        });
        fileMenu.add(jmiFormulario2);

        jmiSalir.setMnemonic('x');
        jmiSalir.setText("Exit");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        fileMenu.add(jmiSalir);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiFormulario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormulario1ActionPerformed
        // TODO add your handling code here:
        jifFormulario1.setVisible(true);
    }//GEN-LAST:event_jmiFormulario1ActionPerformed

    private void jmiFormulario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormulario2ActionPerformed
        // TODO add your handling code here:
        jifFormulario2.setVisible(true);
    }//GEN-LAST:event_jmiFormulario2ActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuActionPerformed

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
            java.util.logging.Logger.getLogger(mdiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mdiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mdiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mdiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mdiPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jifFormulario1;
    private javax.swing.JInternalFrame jifFormulario2;
    private javax.swing.JMenuItem jmiFormulario1;
    private javax.swing.JMenuItem jmiFormulario2;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
