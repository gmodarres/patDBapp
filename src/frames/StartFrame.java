/*
 * stdpat_DB - Project study patient database 
 * For efficient data evaluation and interpretation
 *
 * Copyright (C) CCRI - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Gerda modarres <gerrda.modarres@ccri.at>, August 2017
 *
 */
package frames;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import myClass.DBconnect;
import myClass.Log;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerda.modarres
 */
public class StartFrame extends javax.swing.JFrame {

    Log my_log;

    
    /**
     * Creates new form Start_frame
     */
    public StartFrame() {
        
        initComponents();
        ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/ico/LIRA_small.png"));
        this.setIconImage(img.getImage());
        
        lbl_logged1.setText("You're logged in as "+DBconnect.USER+".");
        //JOptionPane.showMessageDialog(null, DBconnect.USER);
        if (DBconnect.USER.equals("root") || DBconnect.USER.equals("ccri_pat")){
            //TODO ... btn_admin.disable();
            //btn_admin.enable();
            btn_admin.setBackground(java.awt.Color.green);
            btn_admin.setFont(new java.awt.Font("Tahoma", 1, 13));
            btn_admin.setForeground(new java.awt.Color(0, 0, 0));
        }
        UIManager.put("OptionPane.noButtonText", "Wait! I forgot something.");
        UIManager.put("OptionPane.yesButtonText", "Yes, get me out of here!");
        //setLocationRelativeTo(null);

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {              
                //JOptionPane.showMessageDialog(null, "Bye Bye, see you soon!");
                //my_log.logger.info("Closing App \n################################################################################################################################\n");
 
                ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/ico/misdoubt-icon.png"));
                ImageIcon img2 = new javax.swing.ImageIcon(getClass().getResource("/ico/byebye-icon.png"));
                int confirm = JOptionPane.showOptionDialog(rootPane, 
                        "Are you sure you want to close this application?", 
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, img, null, null);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    //ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/ico/Hands-So-So-icon_blue.png"));
                    JOptionPane.showMessageDialog(rootPane, "Bye Bye, see you soon!", "Exit", HEIGHT,img2);
                    my_log.logger.info("Closing App \n################################################################################################################################\n");
                    System.exit(1);
                }
            }
        });     
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_logged1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_admin = new javax.swing.JButton();
        btn_browse_result = new javax.swing.JButton();
        btn_browse_sample = new javax.swing.JButton();
        btn_query_results = new javax.swing.JButton();
        btn_browse_classification = new javax.swing.JButton();
        btn_sql = new javax.swing.JButton();
        btn_browse_patient = new javax.swing.JButton();
        btn_test = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Linked Results Analysis Tool");
        setLocation(new java.awt.Point(15, 15));

        lbl_logged1.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        lbl_logged1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_logged1.setText(" ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/LIRA_med.png"))); // NOI18N
        LOGO.setToolTipText("... pluck the strings ...");
        LOGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOMouseClicked(evt);
            }
        });

        btn_admin.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        btn_admin.setForeground(new java.awt.Color(153, 153, 153));
        btn_admin.setText("admin tools");
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });

        btn_browse_result.setText("browse main result");
        btn_browse_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browse_resultActionPerformed(evt);
            }
        });

        btn_browse_sample.setText("browse sample");
        btn_browse_sample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browse_sampleActionPerformed(evt);
            }
        });

        btn_query_results.setBackground(new java.awt.Color(51, 153, 255));
        btn_query_results.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_query_results.setForeground(new java.awt.Color(0, 255, 204));
        btn_query_results.setText("result query");
        btn_query_results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_query_resultsActionPerformed(evt);
            }
        });

        btn_browse_classification.setText("browse classification");
        btn_browse_classification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browse_classificationActionPerformed(evt);
            }
        });

        btn_sql.setBackground(new java.awt.Color(204, 0, 51));
        btn_sql.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_sql.setForeground(new java.awt.Color(255, 255, 255));
        btn_sql.setText("ready for SQL?");
        btn_sql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sqlActionPerformed(evt);
            }
        });

        btn_browse_patient.setText("browse patient");
        btn_browse_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browse_patientActionPerformed(evt);
            }
        });

        btn_test.setText("array gene query");
        btn_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_browse_sample, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_browse_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_browse_classification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_query_results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_browse_patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_test, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_browse_classification, btn_test});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_query_results, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btn_sql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_browse_sample)
                    .addComponent(btn_browse_patient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_browse_classification)
                    .addComponent(btn_test))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_browse_result)
                    .addComponent(btn_admin))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LOGO)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LOGO, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_logged1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_logged1)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_browse_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browse_resultActionPerformed
        SearchMainResult s = new SearchMainResult();
        s.setVisible(true);
    }//GEN-LAST:event_btn_browse_resultActionPerformed

    private void btn_query_resultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_query_resultsActionPerformed
        SearchResult s = new SearchResult();
        s.setVisible(true);
    }//GEN-LAST:event_btn_query_resultsActionPerformed

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
        //TODO
        //AdminTools s = new AdminTools();
        //s.setVisible(true);
        if (DBconnect.USER.equals("root") || DBconnect.USER.equals("ccri_pat")){
            JOptionPane.showMessageDialog(null, "Not implemented yet.");
        }else{
            JOptionPane.showMessageDialog(null, "What? ... Nope!");
        }
    }//GEN-LAST:event_btn_adminActionPerformed

    private void btn_sqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sqlActionPerformed
        ReadyForSQL s = new ReadyForSQL();
        s.setVisible(true);
    }//GEN-LAST:event_btn_sqlActionPerformed

    private void btn_browse_sampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browse_sampleActionPerformed
        SampleBrowse s = new SampleBrowse();
        s.setVisible(true);  
    }//GEN-LAST:event_btn_browse_sampleActionPerformed

    private void btn_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testActionPerformed
        // TODO add your handling code here:
        ArrayQuery s = new ArrayQuery();
        s.setVisible(true); 
        //JOptionPane.showMessageDialog(null, "Nothing in here yet! \nMaybe you've got an idea what we can put here?");
    }//GEN-LAST:event_btn_testActionPerformed

    private void btn_browse_classificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browse_classificationActionPerformed
        ClassificationBrowse s = new ClassificationBrowse();
        s.setVisible(true);
    }//GEN-LAST:event_btn_browse_classificationActionPerformed

    private void btn_browse_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browse_patientActionPerformed
        //PatientBrowse s = new PatientBrowse();
        // TEST new version
        PatientBrowse_mod s = new PatientBrowse_mod();
        s.setVisible(true);        
    }//GEN-LAST:event_btn_browse_patientActionPerformed

    private void LOGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOMouseClicked
        ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/ico/LIRA_web.png"));
        JOptionPane.showMessageDialog(rootPane, "pluck the strings of this app \nto get your results played \n... like music ;-)","play your results ...",HEIGHT,img);
    }//GEN-LAST:event_LOGOMouseClicked

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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_browse_classification;
    private javax.swing.JButton btn_browse_patient;
    private javax.swing.JButton btn_browse_result;
    private javax.swing.JButton btn_browse_sample;
    private javax.swing.JButton btn_query_results;
    private javax.swing.JButton btn_sql;
    private javax.swing.JButton btn_test;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_logged1;
    // End of variables declaration//GEN-END:variables
}
