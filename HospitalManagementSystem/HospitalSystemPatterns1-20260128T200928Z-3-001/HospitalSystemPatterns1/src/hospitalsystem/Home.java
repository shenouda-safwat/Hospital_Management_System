/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import hospitalsystem.patterns1.*;  
import javax.swing.JOptionPane;




public class Home extends javax.swing.JFrame {

    
    
private void applyUserPermissions() {
    

    AddDoctorButton.setEnabled(currentUser.hasAccess("AddDoctor"));
//    ViewDoctorButton.setEnabled(currentUser.hasAccess("ViewDoctors"));

    AddPatientButton.setEnabled(currentUser.hasAccess("AddPatient"));
    ViewPatientsButton.setEnabled(currentUser.hasAccess("ViewPatients"));

    BookButton.setEnabled(currentUser.hasAccess("BookAppointment"));
    ViewButton.setEnabled(currentUser.hasAccess("ViewAppointments"));
    
    AddRecordButton.setEnabled(currentUser.hasAccess("AddMedicalRecord"));
    ViewRecordButton.setEnabled(currentUser.hasAccess("ViewMedicalRecords"));
    

    
    registrationButton.setEnabled(currentUser.hasAccess("SaveSystemConfig"));
}
    private User currentUser;

    private AccessControlProxy dataAccess;
    
    public Home(User currentUser) {
        this.currentUser = currentUser;

        this.dataAccess = new AccessControlProxy(currentUser);
        
        initComponents();
        this.setLocationRelativeTo(null);
        applyUserPermissions(); 
        jLabel2.setText("Welcome " + currentUser.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrationButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AddPatientButton = new javax.swing.JButton();
        ViewPatientsButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        AddDoctorButton = new javax.swing.JButton();
        ViewDoctorButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BookButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        AddRecordButton = new javax.swing.JButton();
        ViewRecordButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrationButton.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        registrationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-registration-30.png"))); // NOI18N
        registrationButton.setText("Registration");
        registrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registrationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 230, 50));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 950, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true), "Patients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noteworthy", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        AddPatientButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        AddPatientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-add-user-group-woman-man-skin-type-7-30.png"))); // NOI18N
        AddPatientButton.setText("Add Patient ");
        AddPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPatientButtonActionPerformed(evt);
            }
        });

        ViewPatientsButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        ViewPatientsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-select-users-30.png"))); // NOI18N
        ViewPatientsButton.setText("View patients");
        ViewPatientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPatientsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddPatientButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewPatientsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddPatientButton, ViewPatientsButton});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewPatientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddPatientButton, ViewPatientsButton});

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 230, 180));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true), "Doctors", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noteworthy", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setOpaque(false);

        AddDoctorButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        AddDoctorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-add-user-group-woman-man-skin-type-7-30.png"))); // NOI18N
        AddDoctorButton.setText("Add Doctor");
        AddDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDoctorButtonActionPerformed(evt);
            }
        });

        ViewDoctorButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        ViewDoctorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-select-users-30.png"))); // NOI18N
        ViewDoctorButton.setText("View Doctors");
        ViewDoctorButton.setToolTipText("");
        ViewDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDoctorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddDoctorButton, ViewDoctorButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddDoctorButton, ViewDoctorButton});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 230, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true), "Appointments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noteworthy", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setOpaque(false);

        BookButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        BookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-appointment-30.png"))); // NOI18N
        BookButton.setText("Book");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        ViewButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        ViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-view-all-30.png"))); // NOI18N
        ViewButton.setText("View All");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BookButton, ViewButton});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BookButton, ViewButton});

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 230, 180));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true), " Medical Records ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noteworthy", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel4.setOpaque(false);

        AddRecordButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        AddRecordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-add-30.png"))); // NOI18N
        AddRecordButton.setText("Add Record");
        AddRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecordButtonActionPerformed(evt);
            }
        });

        ViewRecordButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        ViewRecordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-view-29.png"))); // NOI18N
        ViewRecordButton.setText("View Records");
        ViewRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRecordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(ViewRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 480, 140));

        LogoutButton.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-logout-30.png"))); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/Home.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"are your sure logout","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
                    
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void AddPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPatientButtonActionPerformed

        new AddPatientPage(currentUser).setVisible(true);
    }//GEN-LAST:event_AddPatientButtonActionPerformed

    private void ViewDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDoctorButtonActionPerformed
        // TODO add your handling code here:
       
        new ViewDoctorsPage(currentUser).setVisible(true); 

        
    }//GEN-LAST:event_ViewDoctorButtonActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
      
       
        new BookPage(currentUser).setVisible(true);

          
    }//GEN-LAST:event_BookButtonActionPerformed

    private void ViewPatientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPatientsButtonActionPerformed
        // TODO add your handling code here:

       
        new ViewPatientsPage(currentUser).setVisible(true);

    }//GEN-LAST:event_ViewPatientsButtonActionPerformed

    private void AddDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDoctorButtonActionPerformed
        // TODO add your handling code here:
        new AddDoctorPage(currentUser).setVisible(true);
    }//GEN-LAST:event_AddDoctorButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed

       
         new ViewAllPage(currentUser).setVisible(true);    

         
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void AddRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecordButtonActionPerformed
        // TODO add your handling code here:
       
                new AddRecordPage(currentUser).setVisible(true);

    
    }//GEN-LAST:event_AddRecordButtonActionPerformed

    private void ViewRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRecordButtonActionPerformed

       
        new ViewRecordsPage(currentUser).setVisible(true);

    }//GEN-LAST:event_ViewRecordButtonActionPerformed

    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed
        // TODO add your handling code here:
        if (currentUser.hasAccess("RegisterUsers")) {
            new registrationPage().setVisible(true);
         }else{
        JOptionPane.showMessageDialog(this, "Access Denied!");}

    }//GEN-LAST:event_registrationButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDoctorButton;
    private javax.swing.JButton AddPatientButton;
    private javax.swing.JButton AddRecordButton;
    private javax.swing.JButton BookButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton ViewButton;
    private javax.swing.JButton ViewDoctorButton;
    private javax.swing.JButton ViewPatientsButton;
    private javax.swing.JButton ViewRecordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton registrationButton;
    // End of variables declaration//GEN-END:variables
}
