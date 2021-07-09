/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livestock2;

import static java.lang.System.exit;
import javax.swing.JFrame;

/**
 *
 * @author Sujoy
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
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

        SignUpButton = new javax.swing.JButton();
        LogINButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUpButton.setBackground(new java.awt.Color(0, 0, 0));
        SignUpButton.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(204, 0, 0));
        SignUpButton.setText("Sign UP");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 259, 77));

        LogINButton.setBackground(new java.awt.Color(0, 0, 0));
        LogINButton.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        LogINButton.setForeground(new java.awt.Color(204, 0, 0));
        LogINButton.setText("Log IN");
        LogINButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogINButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogINButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 259, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\lab 3.1\\database\\livestock 02\\images\\cows-goat1.png")); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 620, 370));

        setSize(new java.awt.Dimension(636, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        this.setVisible(false);
        new UserType().setVisible(true);
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void LogINButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogINButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_LogINButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogINButton;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}