/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaisEnem;

import java.io.IOException;

/**
 *
 * @author Carvalho
 */
public class StudyEnem extends javax.swing.JFrame {

    /**
     * Creates new form StudyEnem
     */
    public StudyEnem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MaisEnem/REDAÇÃO.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 120, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MaisEnem/LINGUAGENS.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 70));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MaisEnem/HUMANAS.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 140, 60));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MaisEnem/NATUREZAS.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 140, 60));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MaisEnem/MATEMÁTICA.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MaisEnem/STUDYENEM.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                   try {  
                Runtime.getRuntime().exec("cmd.exe /C start "  
                        + "https://www.dropbox.com/s/yqn4hf4x5uijgbz/Ci%C3%AAncias%20Humanas%20e%20suas%20tecnologias.zip");  
            } catch (IOException ex) {  
               System.out.println(ex.getMessage());  
            } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                           try {  
                Runtime.getRuntime().exec("cmd.exe /C start "  
                        + "https://www.dropbox.com/s/iadh92j187s7li7/Linguagens%2C%20c%C3%B3digos%20e%20suas%20tecnologias.zip");  
            } catch (IOException ex) {  
               System.out.println(ex.getMessage());  
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                                   try {  
                Runtime.getRuntime().exec("cmd.exe /C start "  
                        + "https://www.dropbox.com/s/o0l98v1ngs0m24o/Ci%C3%AAncias%20da%20Natureza%20e%20suas%20tecnologias.zip");  
            } catch (IOException ex) {  
               System.out.println(ex.getMessage());  
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                                           try {  
                Runtime.getRuntime().exec("cmd.exe /C start "  
                        + "https://www.dropbox.com/s/fu2z9spyew7s1sn/Matem%C3%A1tica%20e%20suas%20tecnologias.zip");  
            } catch (IOException ex) {  
               System.out.println(ex.getMessage());  
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                                   try {  
                Runtime.getRuntime().exec("cmd.exe /C start "  
                        + "https://www.dropbox.com/s/xtc7u3urgqjlbh1/Reda%C3%A7%C3%B5es%20NOTA%201000.zip");  
            } catch (IOException ex) {  
               System.out.println(ex.getMessage());  
            }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudyEnem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudyEnem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudyEnem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudyEnem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudyEnem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
