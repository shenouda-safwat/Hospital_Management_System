/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalsystem;

import hospitalsystem.patterns1.AccessControlProxy;  
import hospitalsystem.patterns1.DatabaseAdapter;     
import hospitalsystem.patterns1.Doctor;
import hospitalsystem.patterns1.DoctorBuilder;
import hospitalsystem.patterns1.User;
import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;


public class AddDoctorPage extends javax.swing.JFrame {
private void clearForm() {
    NameText.setText("");
    EmailText.setText("");
    PhoneText.setText("");
    ConsultationText.setText("");
    YearsOfExperienceText.setText("");
    SpecializationComboBox.setSelectedIndex(0);
}
    private AccessControlProxy dataAccess;
    private int nextID;
    
    public AddDoctorPage(User currentUser) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.dataAccess = new AccessControlProxy(currentUser);
        

    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JButton();
        DoctorIDText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        YearsOfExperienceText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PatientID = new javax.swing.JLabel();
        ConsultationText = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        SpecializationComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(45, 101, 129));

        CloseButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Close.png"))); // NOI18N
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        DoctorIDText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DoctorIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorIDTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-id-30.png"))); // NOI18N
        jLabel1.setText("Doctor ID");

        NameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextActionPerformed(evt);
            }
        });

        PhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-name-30.png"))); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-email-30.png"))); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-consultation-30.png"))); // NOI18N
        jLabel4.setText("Specialization");

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-phone-30.png"))); // NOI18N
        jLabel5.setText("Phone");

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-choice-30.png"))); // NOI18N
        jLabel7.setText("Years of Experience");
        jLabel7.setToolTipText("");

        SaveButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/save-icon--1.png"))); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noteworthy", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add Doctor");

        jLabel8.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-consultation-30.png"))); // NOI18N
        jLabel8.setText("Consultation");

        SpecializationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologist", "Neurologist", "General", "Practitioner", "Pediatrician", "Orthopedic" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(76, 76, 76))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(DoctorIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpecializationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultationText, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearsOfExperienceText, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99)
                .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ConsultationText, DoctorIDText, EmailText, NameText, PhoneText, YearsOfExperienceText});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DoctorIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addComponent(SpecializationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ConsultationText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(YearsOfExperienceText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ConsultationText, DoctorIDText, EmailText, NameText, PhoneText, YearsOfExperienceText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
         setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void DoctorIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorIDTextActionPerformed

    private void NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed

    String Name = NameText.getText();
    String Email = EmailText.getText();           
    String Phone = PhoneText.getText();
    String Specialization = (String) SpecializationComboBox.getSelectedItem(); 
    String Consultation = ConsultationText.getText();
    String YearsOfExperience = YearsOfExperienceText.getText();


    if(Name.isEmpty()){
        JOptionPane.showMessageDialog(this,"Please enter Name");
        return;
    }
    if(Email.isEmpty()){
        JOptionPane.showMessageDialog(this,"Please enter Email");
        return;
    }
    if(Phone.isEmpty()){
        JOptionPane.showMessageDialog(this,"Please enter Phone");
        return;
    }
    if(Specialization == null || Specialization.isEmpty()){
        JOptionPane.showMessageDialog(this,"Please select Specialization");
        return;
    }
    if(Consultation.isEmpty()){
        JOptionPane.showMessageDialog(this,"Please enter Consultation");
        return;
    }
    if(YearsOfExperience.isEmpty()){
        JOptionPane.showMessageDialog(this,"Please enter Years of Experience");
        return;
    }
    
    try {

        Doctor doctor = new DoctorBuilder(nextID, Name)
                .email(Email)
                .phone(Phone)
                .specialization(Specialization)
                .consultation(Consultation)
                .yearsOfExperience(YearsOfExperience)
                .build();
        

        Map<String, String> doctorData = new HashMap<>();
        doctorData.put("Doctor_ID", String.valueOf(doctor.getId()));
        doctorData.put("Name", "Dr." + doctor.getName());
        doctorData.put("Email", doctor.getEmail());
        doctorData.put("Phone", doctor.getPhone());
        doctorData.put("Specialization", doctor.getSpecialization());
        doctorData.put("Consultation", doctor.getConsultation());
        doctorData.put("Years_Of_Experience", doctor.getYearsOfExperience());
        
        boolean success = dataAccess.addData("DoctorInformation", doctorData);
        
        if (success) {
   
            int createAccount = JOptionPane.showConfirmDialog(this,
                    "Doctor added successfully!\n\n" +
                    "Doctor Name: Dr." + Name + "\n" +
                    "Specialization: " + Specialization + "\n\n" +
                    "Do you want to create a user account for this doctor?\n" +
                    "This will allow Dr." + Name + " to login to the system.",
                    "Create User Account?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (createAccount == JOptionPane.YES_OPTION) {
                
                String[] nameParts = Name.split(" ", 2);
                String firstName = nameParts[0];
                String lastName = nameParts.length > 1 ? nameParts[1] : "";
                
               
                registrationPage regPage = new registrationPage(
                    firstName,      
                    lastName,       
                    Phone,          
                    "Doctor"        
                );
                regPage.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(this,
                    " Doctor added successfully!\n\n" +
                    "No user account created.\n" +
                    "Dr." + Name + " will NOT be able to login.",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            }
            
            clearForm();
            nextID = new DatabaseAdapter().getNextId("DoctorInformation", "Doctor_ID");
            DoctorIDText.setText(String.valueOf(nextID));
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add doctor!");
        }
        
    } catch(Exception ex){
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }

    }//GEN-LAST:event_SaveButtonActionPerformed

    private void PhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
        DatabaseAdapter dbAdapter = new DatabaseAdapter();
        nextID = dbAdapter.getNextId("DoctorInformation", "Doctor_ID");
        
        
        DoctorIDText.setText(String.valueOf(nextID));
        DoctorIDText.setEditable(false);
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading Doctor ID: " + ex.getMessage());
        nextID = 1;
    }
    }//GEN-LAST:event_formWindowOpened

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JFormattedTextField ConsultationText;
    protected javax.swing.JTextField DoctorIDText;
    private javax.swing.JTextField EmailText;
    private javax.swing.JTextField NameText;
    private javax.swing.JLabel PatientID;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox<String> SpecializationComboBox;
    private javax.swing.JTextField YearsOfExperienceText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
