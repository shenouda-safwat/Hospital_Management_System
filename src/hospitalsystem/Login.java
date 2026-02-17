
package hospitalsystem;

import hospitalsystem.patterns1.DatabaseConnection;
import hospitalsystem.patterns1.User;          
import hospitalsystem.patterns1.UserFactory;  
import java.sql.*;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame {


    public Login() {
    initComponents();
    this.setLocationRelativeTo(null);

    AdminRadioButton.setActionCommand("Admin");
    ReceptionRadioButton.setActionCommand("Reception");
    doctorRadioButton.setActionCommand("Doctor");

    }
public boolean CheckLogin(String Username, String Password, ButtonModel selectedModel){
    
    if (Username.isEmpty() || Password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter username and password");
        return false;
    }
    
    if (selectedModel == null) {
        JOptionPane.showMessageDialog(this, "Please select your role");
        return false;
    }
    
    String role = selectedModel.getActionCommand();
    
    try {

        DatabaseConnection db = DatabaseConnection.getInstance();
        Connection con = db.getConnection();
        

        String query = "SELECT * FROM users WHERE username = ? AND Password = ? AND Jop_Titile = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, Username);
        pstmt.setString(2, Password);
        pstmt.setString(3, role);
        
        ResultSet result = pstmt.executeQuery();
        
        if(result.next()){

            User currentUser = UserFactory.createUser(role, Username, Password);
            
            if (currentUser != null) {

                setVisible(false);
                

                Home H = new Home(currentUser);
                
                H.setVisible(true);
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(this,"Invalid Username or password");
            UsernameText.setText("");
            PasswordText.setText("");
            buttonGroup1.clearSelection();
        }
        
        pstmt.close();
        
    } catch(Exception ex){
        JOptionPane.showMessageDialog(this, ex.getMessage());
        ex.printStackTrace();
    }
    
    return false;
}
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        AdminRadioButton = new javax.swing.JRadioButton();
        ReceptionRadioButton = new javax.swing.JRadioButton();
        UsernameText = new javax.swing.JTextField();
        PasswordText = new javax.swing.JPasswordField();
        doctorRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setLocation(new java.awt.Point(280, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-login-64.png"))); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-username-30.png"))); // NOI18N
        jLabel2.setText("Username");

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-password-30.png"))); // NOI18N
        jLabel4.setText("Password");

        LoginButton.setBackground(new java.awt.Color(45, 101, 129));
        LoginButton.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-login-28.png"))); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        AdminRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(AdminRadioButton);
        AdminRadioButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        AdminRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminRadioButton.setText("Admin");
        AdminRadioButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminRadioButton.setContentAreaFilled(false);
        AdminRadioButton.setFocusPainted(false);
        AdminRadioButton.setRolloverEnabled(false);
        AdminRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRadioButtonActionPerformed(evt);
            }
        });

        ReceptionRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(ReceptionRadioButton);
        ReceptionRadioButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        ReceptionRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        ReceptionRadioButton.setText("Reception");
        ReceptionRadioButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReceptionRadioButton.setContentAreaFilled(false);
        ReceptionRadioButton.setFocusPainted(false);
        ReceptionRadioButton.setRolloverEnabled(false);

        PasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextActionPerformed(evt);
            }
        });

        doctorRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(doctorRadioButton);
        doctorRadioButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        doctorRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        doctorRadioButton.setText("Doctor");
        doctorRadioButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doctorRadioButton.setContentAreaFilled(false);
        doctorRadioButton.setFocusPainted(false);
        doctorRadioButton.setRolloverEnabled(false);
        doctorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorRadioButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-roles-30.png"))); // NOI18N
        jLabel5.setText(" Role");

        jLabel6.setFont(new java.awt.Font("Noteworthy", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clinic Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(AdminRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(doctorRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ReceptionRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(PasswordText, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(UsernameText, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReceptionRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 690, 480));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/Login.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 570));

        setSize(new java.awt.Dimension(1055, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextActionPerformed

    private void AdminRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminRadioButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
       
    String username = UsernameText.getText();
    String password = new String(PasswordText.getPassword());
    ButtonModel selectedModel = buttonGroup1.getSelection();
    
    CheckLogin(username, password, selectedModel);

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void doctorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRadioButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JRadioButton ReceptionRadioButton;
    private javax.swing.JTextField UsernameText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton doctorRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
