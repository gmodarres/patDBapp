/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Desktop;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import myClass.OSDetector;
import myClass.ShowSqlSelector;

/**
 *
 * @author gerda.modarres
 */
public class SaveInitialMenuBar extends javax.swing.JFrame {

    /**
     * Creates new form MenueBar
     */
    public SaveInitialMenuBar() {
        initComponents();
        //new MenuBar().setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1_openModel = new javax.swing.JMenuItem();
        jMenuItem2_showSql = new javax.swing.JMenuItem();
        jMenueItem3_idCollector = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1_HowTo = new javax.swing.JMenuItem();
        jMenuItem2_Info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenu4.setBorder(null);
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/LIRA_Font_small07_web.png"))); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(0, 0, 0, 5));
        jMenuBar1.add(jMenu4);

        jMenu1.setText("File");

        jMenuItem1_openModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/open-file-icon.png"))); // NOI18N
        jMenuItem1_openModel.setText("open DB Model");
        jMenuItem1_openModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_openModelActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1_openModel);

        jMenuItem2_showSql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/if_icon-89-document-file-sql_315887.png"))); // NOI18N
        jMenuItem2_showSql.setText("showSQL");
        jMenuItem2_showSql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_showSqlActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2_showSql);

        jMenueItem3_idCollector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/collect_IDs.png"))); // NOI18N
        jMenueItem3_idCollector.setText("open IDcollector");
        jMenueItem3_idCollector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenueItem3_idCollectorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenueItem3_idCollector);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem1_HowTo.setText("how to use");
        jMenuItem1_HowTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_HowToActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1_HowTo);

        jMenuItem2_Info.setText("Info");
        jMenuItem2_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_InfoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2_Info);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1_openModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_openModelActionPerformed
        File file = new File("model.pdf");
        //File file = new File("C:\\Users\\gerda.modarres\\Desktop\\pat_DB\\stdpat_db_model.pdf");
        try {
            if (OSDetector.isWindows()){
                //JOptionPane.showMessageDialog(null, OSDetector.isWindows());
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
                //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "model.pdf");
                //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Users\\gerda.modarres\\Desktop\\pat_DB\\stdpat_db_model.pdf");
            }else{
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jMenuItem1_openModelActionPerformed

    private void jMenuItem2_showSqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_showSqlActionPerformed
        ShowSQL s = new ShowSQL();
        s.setVisible(true);
        ShowSqlSelector.ShowSqlIsOpen = true;
    }//GEN-LAST:event_jMenuItem2_showSqlActionPerformed

    private void jMenueItem3_idCollectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenueItem3_idCollectorActionPerformed
        IdCollector s = new IdCollector();
        s.setVisible(true);
    }//GEN-LAST:event_jMenueItem3_idCollectorActionPerformed

    private void jMenuItem1_HowToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_HowToActionPerformed
        ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/ico/Monsters-Snail-icon.png"));
        JOptionPane.showMessageDialog(rootPane, "... ummmmmm \n... errrrrr \n... pls ask again later", "apparently no useful Info", HEIGHT,img);
    }//GEN-LAST:event_jMenuItem1_HowToActionPerformed

    private void jMenuItem2_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_InfoActionPerformed
        ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/ico/LIRA_med.png"));
        JOptionPane.showMessageDialog(rootPane, "LInkedResultsAnalysis \nDB-request Tool\nVersion:   1.0.0", "Info", HEIGHT,img);
    }//GEN-LAST:event_jMenuItem2_InfoActionPerformed

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
            java.util.logging.Logger.getLogger(SaveInitialMenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveInitialMenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveInitialMenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveInitialMenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveInitialMenuBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_HowTo;
    private javax.swing.JMenuItem jMenuItem1_openModel;
    private javax.swing.JMenuItem jMenuItem2_Info;
    private javax.swing.JMenuItem jMenuItem2_showSql;
    private javax.swing.JMenuItem jMenueItem3_idCollector;
    // End of variables declaration//GEN-END:variables
}
