/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalsystem;


import hospitalsystem.patterns1.AccessControlProxy;
import hospitalsystem.patterns1.DatabaseAdapter;  
import hospitalsystem.patterns1.User;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ViewDoctorsPage extends javax.swing.JFrame {
private AccessControlProxy dataAccess;
private User currentUser;

   public ViewDoctorsPage(User currentUser) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.currentUser = currentUser;
        this.dataAccess = new AccessControlProxy(currentUser);

        applyPermissions();

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                loadDoctors();
                jTable1.getColumnModel().getColumn(0).setCellEditor(null);
            }
        });
    }
       private void applyPermissions() {
        if (currentUser.getRole().equals("Admin")) {
            DeleteButton.setEnabled(true);
            UpdateButton.setEnabled(true);
        } else if (currentUser.getRole().equals("Doctor")) {
            DeleteButton.setEnabled(false);  
            UpdateButton.setEnabled(false);  
        } else if (currentUser.getRole().equals("Reception")) {
            DeleteButton.setEnabled(false); 
            UpdateButton.setEnabled(false); 
        }
    }

private void loadDoctors() {
    try {
        DatabaseAdapter db = new DatabaseAdapter();
        List<Map<String, String>> doctors = db.select("DoctorInformation", null);
        

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }
        };

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Phone");
        model.addColumn("Specialization");
        model.addColumn("Consultation");
        model.addColumn("Years of Experience");
        

        for (Map<String, String> doctor : doctors) {
            Vector<String> row = new Vector<>();
            row.add(doctor.get("Doctor_ID"));
            row.add(doctor.get("Name"));
            row.add(doctor.get("Email"));
            row.add(doctor.get("Phone"));
            row.add(doctor.get("Specialization"));
            row.add(doctor.get("Consultation"));
            row.add(doctor.get("Years_Of_Experience"));
            model.addRow(row);
        }
        
        jTable1.setModel(model);
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading doctors: " + ex.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UpdateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        AllDoctorsScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(45, 101, 129));

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-update-user-30.png"))); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-select-all-50.png"))); // NOI18N
        jLabel1.setText("All Doctors");

        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-remove-user-female-30.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        CloseButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Close.png"))); // NOI18N
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        AllDoctorsScrollPane.setAlignmentX(1.0F);
        AllDoctorsScrollPane.setAlignmentY(1.0F);

        jTable1.setFont(new java.awt.Font("Noteworthy", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID ", " Name", "  Phone ", "Email", "Specialization"
            }
        ));
        AllDoctorsScrollPane.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AllDoctorsScrollPane)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllDoctorsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
     if (jTable1.isEditing()) {
        jTable1.getCellEditor().stopCellEditing();
    }
      int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a doctor to update");
        return;
    }
    
    try {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        String doctorId = model.getValueAt(selectedRow, 0).toString();
        String name = model.getValueAt(selectedRow, 1).toString();
        String email = model.getValueAt(selectedRow, 2).toString();
        String phone = model.getValueAt(selectedRow, 3).toString();
        String specialization = model.getValueAt(selectedRow, 4).toString();
        String consultation = model.getValueAt(selectedRow, 5).toString();
        String yearsOfExperience = model.getValueAt(selectedRow, 6).toString();
        
        

        Map<String, String> updateData = new HashMap<>();
        updateData.put("Name", name);
        updateData.put("Email", email);
        updateData.put("Phone", phone);
        updateData.put("Specialization", specialization);
        updateData.put("Consultation", consultation);
        updateData.put("Years_Of_Experience", yearsOfExperience);

        boolean updated = dataAccess.updateData("DoctorInformation", 
                                                updateData, 
                                                "Doctor_ID = " + doctorId);
        
        if (updated) {
            JOptionPane.showMessageDialog(this, 
                "Doctor information updated successfully!", 
                "Success", 
                JOptionPane.INFORMATION_MESSAGE);
            loadDoctors();
        } else {
            JOptionPane.showMessageDialog(this, 
                "Update failed!", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, 
            "Error: " + ex.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
      int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow != -1) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String doctorId = model.getValueAt(selectedRow, 0).toString();
        
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete Doctor ID: " + doctorId + "?", 
            "Confirm Delete", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            String condition = "Doctor_ID = " + doctorId;
            boolean isDeleted = dataAccess.deleteData("DoctorInformation", condition);
            
            if (isDeleted) {
                JOptionPane.showMessageDialog(this, "Doctor deleted successfully!");
                loadDoctors();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete doctor or access denied.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a doctor to delete.");
    }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
         setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:private void formWindowOpened(java.awt.event.WindowEvent evt) {
    }//GEN-LAST:event_formWindowStateChanged

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewDoctorsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewDoctorsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewDoctorsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewDoctorsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                newViewDoctorsPage(currentUser).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AllDoctorsScrollPane;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
