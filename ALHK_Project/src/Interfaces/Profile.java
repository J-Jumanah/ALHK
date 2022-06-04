/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 * Imports.
 */
import javax.swing.*;
import Classes.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jumanah
 */
public class Profile extends javax.swing.JFrame {

    static Profile window = new Profile();
    boolean emailCheck, passCheck, nameCheck;

    /**
     * Creates new form profile
     */
    public Profile() {
        initComponents();
        setTitle("Profile");
        display();
        //Interface design
        ALHKProject.setColor(btnProfile);
        ALHKProject.resetColor(btnHome, btnSection, btnVideo);

    }

    public void display() {
        // TODO add your handling code here:
        usernameText.setText(SignIn.user.getUserName());
        fullNameText.setText(SignIn.user.getFirstName() + " " + SignIn.user.getLastName());
        passText.setText(SignIn.user.getPassword());
        emailText.setText(SignIn.user.getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        passText = new javax.swing.JTextField();
        fullNameText = new javax.swing.JTextField();
        hint1 = new javax.swing.JLabel();
        hint2 = new javax.swing.JLabel();
        hint3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnProfile = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnVideo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHome = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnSection = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Sinhala MN", 1, 40)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(35, 39, 101));
        jLabel20.setText("Profile");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Sinhala MN", 0, 25)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(35, 39, 101));
        jLabel21.setText("Password");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        usernameText.setEditable(false);
        usernameText.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        usernameText.setForeground(new java.awt.Color(35, 39, 101));
        usernameText.setToolTipText("");
        usernameText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 39, 101)));
        jPanel2.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 320, 40));

        emailText.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        emailText.setForeground(new java.awt.Color(35, 39, 101));
        emailText.setToolTipText("");
        emailText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 39, 101)));
        jPanel2.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 320, 40));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        update.setForeground(new java.awt.Color(35, 39, 101));
        update.setText("Save");
        update.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(35, 39, 101)));
        update.setContentAreaFilled(false);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 630, 150, 40));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Sinhala MN", 0, 25)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(35, 39, 101));
        jLabel32.setText("Name");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Sinhala MN", 0, 25)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(35, 39, 101));
        jLabel33.setText("Username");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Sinhala MN", 0, 25)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(35, 39, 101));
        jLabel34.setText("Email");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jLabel35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(35, 39, 101)));
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 850, 20));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Sinhala MN", 0, 25)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(35, 39, 101));
        jLabel22.setText("Account setting");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        passText.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        passText.setForeground(new java.awt.Color(35, 39, 101));
        passText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 39, 101)));
        passText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passTextFocusLost(evt);
            }
        });
        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTextMousePressed(evt);
            }
        });
        jPanel2.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 320, 40));

        fullNameText.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        fullNameText.setForeground(new java.awt.Color(35, 39, 101));
        fullNameText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(35, 39, 101)));
        jPanel2.add(fullNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 320, 40));

        hint1.setFont(new java.awt.Font("PT Sans", 0, 12)); // NOI18N
        hint1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(hint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 410, 20));

        hint2.setFont(new java.awt.Font("PT Sans", 0, 12)); // NOI18N
        hint2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(hint2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 410, 20));

        hint3.setFont(new java.awt.Font("PT Sans", 0, 12)); // NOI18N
        hint3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(hint3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 410, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 1010, 750));

        jPanel1.setBackground(new java.awt.Color(161, 195, 252));
        jPanel1.setPreferredSize(new java.awt.Dimension(197, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProfile.setBackground(new java.awt.Color(92, 140, 215));
        btnProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Fluency System Regular-User.png"))); // NOI18N
        btnProfile.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Profile");
        btnProfile.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jPanel1.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 350, 50));

        btnVideo.setBackground(new java.awt.Color(92, 140, 215));
        btnVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVideoMouseClicked(evt);
            }
        });
        btnVideo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Material Outlined-Video.png"))); // NOI18N
        btnVideo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Devices Tutorial");
        btnVideo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jPanel1.add(btnVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 350, 50));

        jLabel3.setFont(new java.awt.Font("Sinhala MN", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ALHK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        btnHome.setBackground(new java.awt.Color(92, 140, 215));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        btnHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Fluency System Regular-Home.png"))); // NOI18N
        btnHome.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Home");
        btnHome.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 350, 50));

        btnLogOut.setBackground(new java.awt.Color(161, 195, 252));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        btnLogOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Windows 10-Logout Rounded Left.png"))); // NOI18N
        btnLogOut.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel28.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Log Out");
        btnLogOut.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 350, 50));

        jLabel31.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 270, 20));

        btnSection.setBackground(new java.awt.Color(92, 140, 215));
        btnSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSectionMouseClicked(evt);
            }
        });
        btnSection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Material Outlined-Four Squares.png"))); // NOI18N
        btnSection.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel37.setFont(new java.awt.Font("Sinhala MN", 0, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Section");
        btnSection.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, -1, -1));

        jPanel1.add(btnSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 350, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 750));

        setSize(new java.awt.Dimension(1350, 778));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
            //Check name
        try {
            // \\p{L} matches any kind of letter from any language
            String NAME_PATTERN = "^[\\p{L} .'-]+$";
            if ((!fullNameText.getText().matches(NAME_PATTERN)) || fullNameText.getText().isEmpty()) {
                nameCheck = false;
                JOptionPane.showMessageDialog(null, "Please write your full name correctly");
            } else {
                nameCheck = true;
            }
            //Check email
            if (!(Classes.Database.emailChange.trim().equalsIgnoreCase(emailText.getText().trim()))) {

                emailCheck = Database.checkEmail(emailText.getText());
                String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                //Found on db or not match the conditions
                if (emailCheck == true) {
                    emailText.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
                    JOptionPane.showMessageDialog(null, "The email entered already exists");
                    //false: because the condition of submit button
                    emailCheck = false;
                } else if (!emailText.getText().matches(EMAIL_PATTERN)) {
                    emailText.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
                    JOptionPane.showMessageDialog(null, "The email format entered is incorrect");
                    //false: because the condition of submit button
                    emailCheck = false;
                } else {
                    emailText.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(35, 39, 101)));
                    emailCheck = true;
                }

            } else {
                emailText.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(35, 39, 101)));
                emailCheck = true;
            }
            //Check password       
            passCheck = User.checkPassword(passText.getText());
            if (passCheck == false) {
                passText.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
                JOptionPane.showMessageDialog(null, "The password entered does not match the required format");
                passCheck = false;
            } else {
                passText.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(35, 39, 101)));
                passCheck = true;
            }
            if (emailCheck && passCheck && nameCheck) {
                Database.updateUserProfile();
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "There is an error in some files that occurred during downloading the app, please try to download the ALHK app again.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "There is an error that occurred on the Database server during the connection, please try again later.");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void passTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMousePressed
        // TODO add your handling code here:
        hint1.setText("Password must be between 8-15 characters");
        hint2.setText("Include UPPER and lower case letters, numbers");
        hint3.setText("special character [e.g. @, -, _] and no space.");
    }//GEN-LAST:event_passTextMousePressed

    private void passTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTextFocusLost
        // TODO add your handling code here:
        hint1.setText("");
        hint2.setText("");
        hint3.setText("");
    }//GEN-LAST:event_passTextFocusLost

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        Section window = new Section();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnSectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSectionMouseClicked
        // TODO add your handling code here:
        Section.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSectionMouseClicked

    private void btnVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVideoMouseClicked
        // TODO add your handling code here:
        Tutorials.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVideoMouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        // TODO add your handling code here:
        dispose();
        Home.window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutMouseClicked

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnLogOut;
    private javax.swing.JPanel btnProfile;
    private javax.swing.JPanel btnSection;
    private javax.swing.JPanel btnVideo;
    public static javax.swing.JTextField emailText;
    public static javax.swing.JTextField fullNameText;
    private javax.swing.JLabel hint1;
    private javax.swing.JLabel hint2;
    private javax.swing.JLabel hint3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField passText;
    private javax.swing.JButton update;
    public static javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
