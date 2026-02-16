/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalsystem;

import hospitalsystem.patterns1.DatabaseAdapter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import com.toedter.calendar.JDateChooser; 
import hospitalsystem.patterns1.AccessControlProxy;
import hospitalsystem.patterns1.Appointment;
import hospitalsystem.patterns1.MedicalRecordPrototype;
import hospitalsystem.patterns1.User;

/**
 *
 * @author ali
 */
public class BookPage extends javax.swing.JFrame {
        private void clearForm() {
        PatientNameTextField.setText("");
        AgeSpinner.setValue(1);
        SelectDoctorComboBox.setSelectedIndex(0);
        SelectDateCalendar.setDate(new Date());
    }
            private boolean validateBasicInfo() {
        String patientName = PatientNameTextField.getText();
        String doctorName = (String) SelectDoctorComboBox.getSelectedItem();
        
        if (patientName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Name");
            return false;
        }
        if (doctorName == null || doctorName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a Doctor");
            return false;
        }
        return true;
    }
    
    private boolean saveAppointmentToDatabase(Appointment appointment) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        Map<String, String> appointmentData = new HashMap<>();
        appointmentData.put("Appointment_ID", String.valueOf(appointment.getAppointmentId()));
        appointmentData.put("Patient_Name", appointment.getPatientName());
        appointmentData.put("Patient_Age", String.valueOf(appointment.getPatientAge()));
        appointmentData.put("Doctor_Name", appointment.getDoctorName());
        appointmentData.put("Date", dateFormat.format(appointment.getDate()));
        appointmentData.put("Time", appointment.getTime());
        appointmentData.put("Status", appointment.getStatus());
        
        boolean success = dataAccess.addData("Appointments", appointmentData);
        
        if (!success) {
            JOptionPane.showMessageDialog(this, "Failed to book appointment!");
        }
        
        return success;
    }
    
    private void showSuccessMessage(Appointment appointment) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        JOptionPane.showMessageDialog(this,
            "Appointment booked successfully!\n\n" +
            "ID: " + appointment.getAppointmentId() + "\n" +
            "Patient: " + appointment.getPatientName() + "\n" +
            "Doctor: " + appointment.getDoctorName() + "\n" +
            "Date: " + dateFormat.format(appointment.getDate()) + "\n" +
            "Time: " + appointment.getTime(),
            "Success",
            JOptionPane.INFORMATION_MESSAGE);
    }

    private JDateChooser SelectDateCalendar;
        private AccessControlProxy dataAccess;
        private User currentUser;
public BookPage(User currentUser) {
    initComponents();
    this.setLocationRelativeTo(null);
    this.currentUser = currentUser;
    this.dataAccess = new AccessControlProxy(currentUser);
        
    

    Date date = new Date();
    SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.MINUTE);
    SelectTimeSpinner.setModel(sm);
    JSpinner.DateEditor de = new JSpinner.DateEditor(SelectTimeSpinner, "HH:mm");
    SelectTimeSpinner.setEditor(de);
    

    SelectDateCalendar = new com.toedter.calendar.JDateChooser();
    SelectDateCalendar.setDate(new Date());
    loadDoctorsFromDatabase();
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
        ConfirmBookingButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PatientNameTextField = new javax.swing.JTextField();
        SelectDoctorComboBox = new javax.swing.JComboBox<>();
        SelectTimeSpinner = new javax.swing.JSpinner();
        AgeSpinner = new javax.swing.JSpinner();
        MorningButton = new javax.swing.JButton();
        AfternoonButton = new javax.swing.JButton();
        EmergencyButton = new javax.swing.JButton();
        FollowUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(45, 101, 129));

        ConfirmBookingButton.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        ConfirmBookingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-update-user-30.png"))); // NOI18N
        ConfirmBookingButton.setText("Confirm Booking");
        ConfirmBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBookingButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-appointment-50.png"))); // NOI18N
        jLabel1.setText(" Book Appointment");

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

        jLabel6.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Time:");

        SelectDoctorComboBox.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        SelectDoctorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr.Awaab", "Dr.Sidra", "Dr.Mohamed", "Dr.Ahmad", "Dr.Aya" }));

        SelectTimeSpinner.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        SelectTimeSpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1765102857911L), null, null, java.util.Calendar.HOUR));

        AgeSpinner.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        AgeSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        MorningButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MorningButton.setText("Morning 9AM");
        MorningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MorningButtonActionPerformed(evt);
            }
        });

        AfternoonButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AfternoonButton.setText("Afternoon 2PM");
        AfternoonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfternoonButtonActionPerformed(evt);
            }
        });

        EmergencyButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EmergencyButton.setText("Emergency");
        EmergencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergencyButtonActionPerformed(evt);
            }
        });

        FollowUpButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FollowUpButton.setText("Follow-up +2weeks");
        FollowUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FollowUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ConfirmBookingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MorningButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(PatientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AgeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SelectDoctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SelectTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(AfternoonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(EmergencyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(FollowUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AgeSpinner, PatientNameTextField, SelectDoctorComboBox, SelectTimeSpinner});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PatientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AgeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(SelectDoctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MorningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AfternoonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmergencyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FollowUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.MINUTE);
        SelectTimeSpinner.setModel(sm);
        JSpinner.DateEditor de = new JSpinner.DateEditor(SelectTimeSpinner, "HH:mm");
        SelectTimeSpinner.setEditor(de);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBookingButtonActionPerformed
        // TODO add your handling code here:
    String patientName = PatientNameTextField.getText();
    String ageStr = AgeSpinner.getValue().toString();
    String doctorName = (String) SelectDoctorComboBox.getSelectedItem();
    Date selectedDate = SelectDateCalendar.getDate();

    

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
    
    try {
        
        DatabaseAdapter db = new DatabaseAdapter();
        int nextAppointmentId = db.getNextId("Appointments", "Appointment_ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        
        Map<String, String> appointmentData = new HashMap<>();
        appointmentData.put("Appointment_ID", String.valueOf(nextAppointmentId));   
        appointmentData.put("Patient_Name", patientName);
        appointmentData.put("Patient_Age", ageStr);
        appointmentData.put("Doctor_Name", doctorName);
        appointmentData.put("Date", dateFormat.format(selectedDate));
        appointmentData.put("Time", timeFormat.format((Date) SelectTimeSpinner.getValue()));
        appointmentData.put("Status", "Scheduled");
        
         boolean success = dataAccess.addData("Appointments", appointmentData);
         
        if (success) {
            JOptionPane.showMessageDialog(this, "Appointment booked successfully" +
                "Appointment ID: " +nextAppointmentId + "\n" +
                "Patient: " + patientName + "\n" +
                "Doctor: " + doctorName + "\n" +
                "Date: " + dateFormat.format(selectedDate) + "\n" +
                "Time: " + timeFormat.format((Date) SelectTimeSpinner.getValue()));
            
                clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to book appointment!");
        }
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_ConfirmBookingButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadDoctorsFromDatabase();  
    }//GEN-LAST:event_formWindowOpened

    private void MorningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MorningButtonActionPerformed

         if (!validateBasicInfo()) return;
        
        try {
            DatabaseAdapter db = new DatabaseAdapter();
            int nextAppointmentId = db.getNextId("Appointments", "Appointment_ID");
            
            String patientName = PatientNameTextField.getText();
            int age = (Integer) AgeSpinner.getValue();
            String doctorName = (String) SelectDoctorComboBox.getSelectedItem();

            Appointment appointment = MedicalRecordPrototype.getMorningAppointment(
                nextAppointmentId, patientName, age, doctorName
            );
            

            if (saveAppointmentToDatabase(appointment)) {
                showSuccessMessage(appointment);
                clearForm();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    
    
    }//GEN-LAST:event_MorningButtonActionPerformed

    private void AfternoonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfternoonButtonActionPerformed
        // TODO add your handling code here:
        if (!validateBasicInfo()) return;
        
        try {
            DatabaseAdapter db = new DatabaseAdapter();
            int nextAppointmentId = db.getNextId("Appointments", "Appointment_ID");
            
            String patientName = PatientNameTextField.getText();
            int age = (Integer) AgeSpinner.getValue();
            String doctorName = (String) SelectDoctorComboBox.getSelectedItem();

            Appointment appointment = MedicalRecordPrototype.getAfternoonAppointment(
                nextAppointmentId, patientName, age, doctorName
            );
            
            if (saveAppointmentToDatabase(appointment)) {
                showSuccessMessage(appointment);
                clearForm();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_AfternoonButtonActionPerformed

    private void EmergencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergencyButtonActionPerformed
        // TODO add your handling code here:
                if (!validateBasicInfo()) return;
        
        try {
            DatabaseAdapter db = new DatabaseAdapter();
            int nextAppointmentId = db.getNextId("Appointments", "Appointment_ID");
            
            String patientName = PatientNameTextField.getText();
            int age = (Integer) AgeSpinner.getValue();
            String doctorName = (String) SelectDoctorComboBox.getSelectedItem();
            

            Appointment appointment = MedicalRecordPrototype.getEmergencyAppointment(
                nextAppointmentId, patientName, age, doctorName
            );
            
            if (saveAppointmentToDatabase(appointment)) {
                JOptionPane.showMessageDialog(this,
                    "EMERGENCY Appointment Created!\n\n" +
                    "Patient: " + patientName + "\n" +
                    "Doctor: " + doctorName + "\n" +
                    "Status: URGENT - Immediate attention required",
                    "Emergency Booking",
                    JOptionPane.WARNING_MESSAGE);
                clearForm();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_EmergencyButtonActionPerformed

    private void FollowUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FollowUpButtonActionPerformed
        // TODO add your handling code here:
                if (!validateBasicInfo()) return;
        
        try {
            DatabaseAdapter db = new DatabaseAdapter();
            int nextAppointmentId = db.getNextId("Appointments", "Appointment_ID");
            
            String patientName = PatientNameTextField.getText();
            int age = (Integer) AgeSpinner.getValue();
            String doctorName = (String) SelectDoctorComboBox.getSelectedItem();
            
            Appointment appointment = MedicalRecordPrototype.getFollowUpAppointment(
                nextAppointmentId, patientName, age, doctorName
            );
            
            if (saveAppointmentToDatabase(appointment)) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                JOptionPane.showMessageDialog(this,
                    "Follow-up Appointment Created!\n\n" +
                    "Patient: " + patientName + "\n" +
                    "Doctor: " + doctorName + "\n" +
                    "Scheduled: " + dateFormat.format(appointment.getDate()) + 
                    " at " + appointment.getTime(),
                    "Follow-up Booking",
                    JOptionPane.INFORMATION_MESSAGE);
                clearForm();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_FollowUpButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(BookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BookPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AfternoonButton;
    private javax.swing.JSpinner AgeSpinner;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton ConfirmBookingButton;
    private javax.swing.JButton EmergencyButton;
    private javax.swing.JButton FollowUpButton;
    private javax.swing.JButton MorningButton;
    private javax.swing.JTextField PatientNameTextField;
    private javax.swing.JComboBox<String> SelectDoctorComboBox;
    private javax.swing.JSpinner SelectTimeSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
