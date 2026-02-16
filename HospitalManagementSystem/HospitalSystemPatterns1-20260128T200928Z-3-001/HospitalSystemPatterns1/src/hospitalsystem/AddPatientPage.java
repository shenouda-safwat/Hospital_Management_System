
package hospitalsystem;

import hospitalsystem.patterns1.AccessControlProxy;
import hospitalsystem.patterns1.Patient;
import hospitalsystem.patterns1.DatabaseAdapter;
import hospitalsystem.patterns1.PatientBuilder;
import hospitalsystem.patterns1.User;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;


/**
 *
 * @author M.Tech
 */
public class AddPatientPage extends javax.swing.JFrame {

private AccessControlProxy dataAccess;

private int nextID;
private void clearForm() {
    NameText.setText("");
    AgeText.setText("");
    PhoneText.setText("");
    AgeText.setText("");
    BloodGroupText.setText("");
    AnyMajorDiseaseText.setText("");
}
    public AddPatientPage(User currentUser) {
        initComponents();
        this.setLocationRelativeTo(null);
                this.dataAccess = new AccessControlProxy(currentUser);
        


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        CloseButton1 = new javax.swing.JButton();
        PatientIDText1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NameText1 = new javax.swing.JTextField();
        PhoneText1 = new javax.swing.JTextField();
        AgeText1 = new javax.swing.JTextField();
        BloodGroupText1 = new javax.swing.JTextField();
        AddressText1 = new javax.swing.JTextField();
        AnyMajorDiseaseText1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SaveButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        MaleRadioButton1 = new javax.swing.JRadioButton();
        FemaleRadioButton1 = new javax.swing.JRadioButton();
        PatientID1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JButton();
        PatientIDText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        BloodGroupText = new javax.swing.JTextField();
        AddressText = new javax.swing.JTextField();
        AnyMajorDiseaseText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        PatientID = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(45, 101, 129));

        CloseButton1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        CloseButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Close.png"))); // NOI18N
        CloseButton1.setText("Close");
        CloseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButton1ActionPerformed(evt);
            }
        });

        PatientIDText1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PatientIDText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIDText1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-id-30.png"))); // NOI18N
        jLabel10.setText("Patient ID");

        NameText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameText1ActionPerformed(evt);
            }
        });

        BloodGroupText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodGroupText1ActionPerformed(evt);
            }
        });

        AddressText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressText1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-name-30.png"))); // NOI18N
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-phone-30.png"))); // NOI18N
        jLabel12.setText("Phone");

        jLabel13.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-age-30.png"))); // NOI18N
        jLabel13.setText("Age");

        jLabel14.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-blood-30.png"))); // NOI18N
        jLabel14.setText("Blood Group");

        jLabel15.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-adress-30.png"))); // NOI18N
        jLabel15.setText("Address");

        jLabel16.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-choice-30.png"))); // NOI18N
        jLabel16.setText("Any Major Disease\nSuffered Earlier");
        jLabel16.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-gender-30.png"))); // NOI18N
        jLabel17.setText("Gender");

        SaveButton1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        SaveButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/save-icon--1.png"))); // NOI18N
        SaveButton1.setText("Save");
        SaveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButton1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Noteworthy", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-add-user-60.png"))); // NOI18N
        jLabel18.setText("Add patient ");

        buttonGroup1.add(MaleRadioButton1);
        MaleRadioButton1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        MaleRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        MaleRadioButton1.setText("Male");

        buttonGroup1.add(FemaleRadioButton1);
        FemaleRadioButton1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        FemaleRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        FemaleRadioButton1.setText("female");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BloodGroupText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(MaleRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FemaleRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AgeText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneText1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientIDText1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressText1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SaveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(CloseButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AnyMajorDiseaseText1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PatientID1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PatientIDText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PatientID1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(PhoneText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgeText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MaleRadioButton1)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FemaleRadioButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BloodGroupText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(AddressText1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnyMajorDiseaseText1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CloseButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(SaveButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
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

        PatientIDText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PatientIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIDTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-id-30.png"))); // NOI18N
        jLabel1.setText("Patient ID");

        NameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextActionPerformed(evt);
            }
        });

        BloodGroupText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodGroupTextActionPerformed(evt);
            }
        });

        AddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-name-30.png"))); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-phone-30.png"))); // NOI18N
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-age-30.png"))); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-blood-30.png"))); // NOI18N
        jLabel5.setText("Blood Group");

        jLabel6.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-adress-30.png"))); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-choice-30.png"))); // NOI18N
        jLabel7.setText("Any Major Disease\nSuffered Earlier");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-gender-30.png"))); // NOI18N
        jLabel8.setText("Gender");

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
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-add-user-60.png"))); // NOI18N
        jLabel9.setText("Add patient ");

        buttonGroup1.add(MaleRadioButton);
        MaleRadioButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        MaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        MaleRadioButton.setText("Male");

        buttonGroup1.add(FemaleRadioButton);
        FemaleRadioButton.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        FemaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        FemaleRadioButton.setText("female");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BloodGroupText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FemaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AgeText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AnyMajorDiseaseText, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddressText, AgeText, AnyMajorDiseaseText, BloodGroupText, NameText, PatientIDText, PhoneText});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PatientIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MaleRadioButton)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FemaleRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BloodGroupText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnyMajorDiseaseText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddressText, AgeText, AnyMajorDiseaseText, BloodGroupText, NameText, PatientIDText, PhoneText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
    String Name = NameText.getText();
    String Phone = PhoneText.getText();
    String Age = AgeText.getText();
    String BloodGroup = BloodGroupText.getText();
    String Address = AddressText.getText();
    String AnyMajorDisease = AnyMajorDiseaseText.getText();
    MaleRadioButton.setActionCommand("male");
    FemaleRadioButton.setActionCommand("Female");
    ButtonModel selectedModel = buttonGroup1.getSelection();
    
    if(Name.isEmpty()){
        JOptionPane.showMessageDialog(this,"Pleas enter Name");
        return;
    }
    if(Phone.isEmpty()){
        JOptionPane.showMessageDialog(this,"Pleas enter Phone");
        return;
    }
    if(Age.isEmpty()){
        JOptionPane.showMessageDialog(this,"Pleas enter Age");
        return;
    }
    if(BloodGroup.isEmpty()){
        JOptionPane.showMessageDialog(this,"Pleas enter BloodGroup");
        return;
    }
    if(Address.isEmpty()){
        JOptionPane.showMessageDialog(this,"Pleas enter Address");
        return;
    }
    if (selectedModel == null) {
        JOptionPane.showMessageDialog(this,"Please select your Gender");
        return;
    }
    if(AnyMajorDisease.isEmpty()){
        JOptionPane.showMessageDialog(this,"If the patient does not suffer from any disease, write [No] ");
        return;
    }
    String Gender = selectedModel.getActionCommand();

    try{

        Patient patient = new PatientBuilder(nextID, Name)
            .phone(Phone)
            .age(Age)
            .bloodGroup(BloodGroup)
            .address(Address)
            .gender(Gender)
            .majorDisease(AnyMajorDisease)
            .build();
        
        Map<String, String> patientData = new HashMap<>();
        patientData.put("Patient_ID", String.valueOf(patient.getId()));
        patientData.put("Name", patient.getName());
        patientData.put("Phone", patient.getPhone());
        patientData.put("Age", patient.getAge());
        patientData.put("Blood_Group", patient.getBloodGroup());
        patientData.put("Address", patient.getAddress());
        patientData.put("Gender", patient.getGender());
        patientData.put("Any_Major_Disease", patient.getMajorDisease());
        
        boolean success = dataAccess.addData("PatientInformation", patientData);
        
        if (success) {
            JOptionPane.showMessageDialog(this, "Patient added successfully!");
            clearForm();
            nextID = new DatabaseAdapter().getNextId("PatientInformation", "Patient_ID");
            PatientID.setText(String.valueOf(nextID));
        } else {
            JOptionPane.showMessageDialog(this, "Insertion failed!");
        }
        
    }catch(Exception ex){
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }

            
        
        
       
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void AddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTextActionPerformed

    private void NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextActionPerformed

    private void BloodGroupTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodGroupTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodGroupTextActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void PatientIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientIDTextActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        

try {
        DatabaseAdapter dbAdapter = new DatabaseAdapter();
        nextID = dbAdapter.getNextId("PatientInformation", "Patient_ID");
        
        PatientIDText.setText(String.valueOf(nextID));
        PatientIDText.setEditable(false);
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading Patient ID: " + ex.getMessage());
        nextID = 1;
    }






    }//GEN-LAST:event_formWindowOpened

    private void CloseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseButton1ActionPerformed

    private void PatientIDText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientIDText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientIDText1ActionPerformed

    private void NameText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameText1ActionPerformed

    private void BloodGroupText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodGroupText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodGroupText1ActionPerformed

    private void AddressText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressText1ActionPerformed

    private void SaveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressText;
    private javax.swing.JTextField AddressText1;
    private javax.swing.JTextField AgeText;
    private javax.swing.JTextField AgeText1;
    private javax.swing.JTextField AnyMajorDiseaseText;
    private javax.swing.JTextField AnyMajorDiseaseText1;
    private javax.swing.JTextField BloodGroupText;
    private javax.swing.JTextField BloodGroupText1;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton CloseButton1;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JRadioButton FemaleRadioButton1;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JRadioButton MaleRadioButton1;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField NameText1;
    private javax.swing.JLabel PatientID;
    private javax.swing.JLabel PatientID1;
    protected javax.swing.JTextField PatientIDText;
    protected javax.swing.JTextField PatientIDText1;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JTextField PhoneText1;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SaveButton1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
