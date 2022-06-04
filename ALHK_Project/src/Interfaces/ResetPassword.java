/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 * Imports.
 */
import Classes.*;
import static Interfaces.ForgetPassword.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author jumanah
 */
public class ResetPassword extends javax.swing.JFrame {

    static ResetPassword window = new ResetPassword();

    /**
     * Creates new form reset password
     */
    public ResetPassword() {
        initComponents();
        setTitle("Reset Password");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        passText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rePassText = new javax.swing.JTextField();
        resetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(197, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unlocking.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 650, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-iOS Glyph-Multiply 3.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 680, 750));

        jPanel2.setBackground(new java.awt.Color(161, 195, 252));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sinhala MN", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reset Your Password !");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sinhala MN", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Please create a new password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(209, 81, 74)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 480, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-iOS Glyph-Password.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 50, 50));

        passText.setBackground(new java.awt.Color(161, 195, 252));
        passText.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        passText.setForeground(new java.awt.Color(255, 255, 255));
        passText.setText("New Password");
        passText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passTextMouseClicked(evt);
            }
        });
        jPanel2.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 460, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-iOS Glyph-Repeat.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 50, 50));

        rePassText.setBackground(new java.awt.Color(161, 195, 252));
        rePassText.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        rePassText.setForeground(new java.awt.Color(255, 255, 255));
        rePassText.setText("Repeat Password");
        rePassText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        rePassText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rePassTextMouseClicked(evt);
            }
        });
        jPanel2.add(rePassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 460, 40));

        resetBtn.setBackground(new java.awt.Color(161, 195, 252));
        resetBtn.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        resetBtn.setContentAreaFilled(false);
        resetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel2.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 460, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 750));

        setSize(new java.awt.Dimension(1355, 778));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        dispose();
        Home.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitMouseClicked

    private void passTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMouseClicked
        // TODO add your handling code here:
        passText.setText("");
    }//GEN-LAST:event_passTextMouseClicked

    private void rePassTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rePassTextMouseClicked
        // TODO add your handling code here:
        rePassText.setText("");
    }//GEN-LAST:event_rePassTextMouseClicked

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        String firstPass = passText.getText().trim();
        String secPass = rePassText.getText().trim();
        //to check if the entered password meets the required conditions or not
        boolean passcheck = User.checkPassword(firstPass);
        if (firstPass.isEmpty() && secPass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You didn't enter any password.");
            //the entered password does not meet the required conditions
        } else if (passcheck == false) {
            JOptionPane.showMessageDialog(null, "Password must be between 8-15 characters\n"
                    + "* Include: UPPER and lower case letters\n* Numbers\n* Special character [e.g. @, -, _]\n* No space");
        } else if (!firstPass.equals(secPass)) {
            //the first password and the repeated password are not similar
            JOptionPane.showMessageDialog(null, "Please make sure your passwords match!");
        } else {
            passcheck = true;
            //the entered password meets the required conditions
            //and the the first password and the repeated password similar
            if (firstPass.equals(secPass) && passcheck == true) {
                try {
                    //the password will be updated
                    Database.updatePassword(firstPass, email);
                } catch (ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "There is an error in some files that occurred during downloading the app, please try to download the ALHK app again.");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "There is an error that occurred on the Database server during the connection, please try again later.");
                }
            }
        }
        SignIn.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_resetBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField passText;
    private javax.swing.JTextField rePassText;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}
