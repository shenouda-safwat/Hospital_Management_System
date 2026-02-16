/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalsystem;

import hospitalsystem.patterns1.AccessControlProxy;
import hospitalsystem.patterns1.DatabaseAdapter;
import hospitalsystem.patterns1.MedicalRecord;
import hospitalsystem.patterns1.MedicalRecordPrototype;
import hospitalsystem.patterns1.User;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;
import java.util.*;


public class AddRecordPage extends javax.swing.JFrame {

    private AccessControlProxy dataAccess;
    private User currentUser;
    
    public AddRecordPage(User currentUser) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.dataAccess = dataAccess;
         loadDoctorsFromDatabase();
         this.currentUser = currentUser;
        this.dataAccess = new AccessControlProxy(currentUser);
        

    }  
    private void loadDoctorsFromDatabase() {
        try {
            DatabaseAdapter db = new DatabaseAdapter();
            List<Map<String, String>> doctors = db.select("DoctorInformation", null);

            SelectDoctorComboBox.removeAllItems();

            for (Map<String, String> doctor : doctors) {
                String doctorName = doctor.get("Name");
                if (doctorName != null && !doctorName.isEmpty()) {
                    SelectDoctorComboBox.addItem(doctorName);
                }
            }
            

            if (SelectDoctorComboBox.getItemCount() == 0) {
                SelectDoctorComboBox.addItem("No doctors available");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error loading doctors: " + ex.getMessage());
        }}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SaveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PatientNameTextField = new javax.swing.JTextField();
        SelectDoctorComboBox = new javax.swing.JComboBox<>();
        AgeSpinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        DiagnosisTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        PrescriptionTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        NotesTextArea = new javax.swing.JTextArea();
        SelectDateChooser = new com.toedter.calendar.JDateChooser();
        UseStandardTemplateButton = new javax.swing.JButton();
        UseFollowUpTemplateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(45, 101, 129));

        SaveButton.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-save-30.png"))); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-add-user-50 (1).png"))); // NOI18N
        jLabel1.setText("Add Medical Record");

        CloseButton.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Close.png"))); // NOI18N
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Doctor:");

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Name:");

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Date:");

        jLabel6.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Diagnosis:");

        SelectDoctorComboBox.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        SelectDoctorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr.Awaab", "Dr.Sidra", "Dr.Mohamed", "Dr.Ahmad", "Dr.Aya" }));
        SelectDoctorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectDoctorComboBoxActionPerformed(evt);
            }
        });

        AgeSpinner.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        AgeSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prescription:");

        DiagnosisTextArea.setColumns(20);
        DiagnosisTextArea.setRows(5);
        jScrollPane2.setViewportView(DiagnosisTextArea);

        PrescriptionTextArea.setColumns(20);
        PrescriptionTextArea.setRows(5);
        jScrollPane4.setViewportView(PrescriptionTextArea);

        jLabel8.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Notes:");

        NotesTextArea.setColumns(20);
        NotesTextArea.setRows(5);
        jScrollPane5.setViewportView(NotesTextArea);

        UseStandardTemplateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UseStandardTemplateButton.setText("Standard");
        UseStandardTemplateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseStandardTemplateButtonActionPerformed(evt);
            }
        });

        UseFollowUpTemplateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UseFollowUpTemplateButton.setText("FollowUp");
        UseFollowUpTemplateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseFollowUpTemplateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SaveButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(UseStandardTemplateButton)
                                        .addGap(65, 65, 65)
                                        .addComponent(UseFollowUpTemplateButton)
                                        .addGap(51, 51, 51)
                                        .addComponent(CloseButton))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SelectDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AgeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SelectDoctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(409, 409, 409))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PatientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(165, 165, 165)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AgeSpinner, PatientNameTextField, SelectDoctorComboBox, jScrollPane2, jScrollPane4, jScrollPane5});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PatientNameTextField)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AgeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectDoctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UseStandardTemplateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UseFollowUpTemplateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AgeSpinner, PatientNameTextField, SelectDoctorComboBox, jLabel2, jLabel3, jLabel4, jLabel5});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane2, jScrollPane4, jScrollPane5});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
    String patientName = PatientNameTextField.getText();
    String ageStr = AgeSpinner.getValue().toString();
    String doctorName = (String) SelectDoctorComboBox.getSelectedItem();
    Date selectedDate = SelectDateChooser.getDate();
    String diagnosis = DiagnosisTextArea.getText();
    String prescription = PrescriptionTextArea.getText();
    String notes = NotesTextArea.getText();
    

    if (patientName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter Patient Name");
        return;
    }
    if (doctorName == null || doctorName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a Doctor");
        return;
    }
    if (selectedDate == null) {
        JOptionPane.showMessageDialog(this, "Please select a Date");
        return;
    }
    if (diagnosis.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter Diagnosis");
        return;
    }
    
    try {
        
        DatabaseAdapter db = new DatabaseAdapter();
        int nextRecordId = db.getNextId("MedicalRecords", "Record_ID");
        
        Map<String, String> recordData = new HashMap<>();
        recordData.put("Record_ID", String.valueOf(nextRecordId));
        recordData.put("Patient_Name", patientName);
        recordData.put("Patient_Age", ageStr);
        recordData.put("Doctor_Name", doctorName);
        recordData.put("Date", selectedDate.toString());
        recordData.put("Diagnosis", diagnosis);
        recordData.put("Prescription", prescription);
        recordData.put("Notes", notes);
        boolean success = dataAccess.addData("MedicalRecords", recordData);
        if (success) {
            JOptionPane.showMessageDialog(this, "Medical Record added successfully!");
            
            
            PatientNameTextField.setText("");
            AgeSpinner.setValue(1);
            SelectDoctorComboBox.setSelectedIndex(0);
            SelectDateChooser.setDate(new Date());
            DiagnosisTextArea.setText("");
            PrescriptionTextArea.setText("");
            NotesTextArea.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add Medical Record!");
        }
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void UseStandardTemplateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseStandardTemplateButtonActionPerformed
    String patientName = PatientNameTextField.getText();
    int age = (Integer) AgeSpinner.getValue();
    String doctor = (String) SelectDoctorComboBox.getSelectedItem();
    
    if (patientName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter patient name first");
        return;
    }
    

    DatabaseAdapter db = new DatabaseAdapter();
    int recordId = db.getNextId("MedicalRecords", "Record_ID");
    
    MedicalRecord template = MedicalRecordPrototype.getStandardCheckup(
        recordId, patientName, age, doctor
    );

    DiagnosisTextArea.setText(template.getDiagnosis());
    PrescriptionTextArea.setText(template.getPrescription());
    NotesTextArea.setText(template.getNotes());
    
    JOptionPane.showMessageDialog(this, 
        "Standard Checkup template applied!",
        "Template Applied", 
        JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_UseStandardTemplateButtonActionPerformed

    private void UseFollowUpTemplateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseFollowUpTemplateButtonActionPerformed
           String patientName = PatientNameTextField.getText();
    int age = (Integer) AgeSpinner.getValue();
    String doctor = (String) SelectDoctorComboBox.getSelectedItem();
    
    if (patientName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter patient name first");
        return;
    }
    

    DatabaseAdapter db = new DatabaseAdapter();
    int recordId = db.getNextId("MedicalRecords", "Record_ID");
    
    MedicalRecord template = MedicalRecordPrototype.getFollowUpRecord(
        recordId, patientName, age, doctor
    );
    

    DiagnosisTextArea.setText(template.getDiagnosis());
    PrescriptionTextArea.setText(template.getPrescription());
    NotesTextArea.setText(template.getNotes());
    
    JOptionPane.showMessageDialog(this, 
        " Standard Checkup template applied!",
        "Template Applied", 
        JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_UseFollowUpTemplateButtonActionPerformed

    private void SelectDoctorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectDoctorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectDoctorComboBoxActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AgeSpinner;
    private javax.swing.JButton CloseButton;
    private javax.swing.JTextArea DiagnosisTextArea;
    private javax.swing.JTextArea NotesTextArea;
    private javax.swing.JTextField PatientNameTextField;
    private javax.swing.JTextArea PrescriptionTextArea;
    private javax.swing.JButton SaveButton;
    private com.toedter.calendar.JDateChooser SelectDateChooser;
    private javax.swing.JComboBox<String> SelectDoctorComboBox;
    private javax.swing.JButton UseFollowUpTemplateButton;
    private javax.swing.JButton UseStandardTemplateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
