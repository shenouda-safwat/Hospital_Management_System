
package hospitalsystem;

import hospitalsystem.patterns1.DatabaseAdapter;  
import javax.swing.JOptionPane;
import javax.swing.ButtonModel;
import java.util.Map;
import java.util.HashMap;
import java.util.List;



public class registrationPage extends javax.swing.JFrame {

    
       public registrationPage(String firstName, String lastName, String phone, String jobTitle) {
        initComponents();
        setLocationRelativeTo(null);
        message1.setVisible(false);
        message2.setVisible(false);
        message3.setVisible(false);
        message4.setVisible(false);

        FirstNameText.setText(firstName);
        LastNameText.setText(lastName);
        PhoneText.setText(phone);
        JopTitileComboBox.setActionCommand(jobTitle);
        

        FirstNameText.setEditable(false);
        LastNameText.setEditable(false);
        PhoneText.setEditable(false);
        JopTitileComboBox.setEditable(false);
        

    }
    public registrationPage(){
       initComponents();
        setLocationRelativeTo(null);
        message1.setVisible(false);
        message2.setVisible(false);
        message3.setVisible(false);
        message4.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        FirstNameText = new javax.swing.JTextField();
        LastNameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        PhoneText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        message3 = new javax.swing.JLabel();
        message4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JopTitileComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        UsernameText = new javax.swing.JTextField();
        PasswordText = new javax.swing.JPasswordField();
        ConfirmPasswordText = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RegistrationButten = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(45, 101, 129));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 204, 255));

        LastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Job title");

        buttonGroup1.add(MaleRadioButton);
        MaleRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        MaleRadioButton.setSelected(true);
        MaleRadioButton.setText("Male");
        MaleRadioButton.setToolTipText("");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(FemaleRadioButton);
        FemaleRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FemaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.setToolTipText("");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });

        PhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextActionPerformed(evt);
            }
        });

        AgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTextActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone");

        message1.setForeground(new java.awt.Color(181, 212, 244));
        message1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message1.setText("first Name does not match");

        message2.setForeground(new java.awt.Color(181, 212, 244));
        message2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message2.setText("last Name does not match");

        message3.setForeground(new java.awt.Color(181, 212, 244));
        message3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message3.setText("Age does not match");

        message4.setForeground(new java.awt.Color(181, 212, 244));
        message4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message4.setText("phone does not match");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-registration-100 (1).png"))); // NOI18N

        JopTitileComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JopTitileComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Reception" }));
        JopTitileComboBox.setMinimumSize(new java.awt.Dimension(119, 25));
        JopTitileComboBox.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(message4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(message3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(MaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FemaleRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JopTitileComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PhoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(58, 58, 58)
                                        .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AgeText, FirstNameText, LastNameText, PhoneText});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(12, 12, 12)
                .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(message4)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JopTitileComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(MaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FemaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AgeText, FirstNameText, LastNameText, PhoneText});

        JopTitileComboBox.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBackground(new java.awt.Color(45, 101, 129));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-add-user-50 (1).png"))); // NOI18N
        jLabel1.setText("User Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-password-50.png"))); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-show-password-50.png"))); // NOI18N
        jLabel6.setText("Confirm Password");

        RegistrationButten.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegistrationButten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsystem/Images & Icons/icons8-check-mark-50.png"))); // NOI18N
        RegistrationButten.setText("Registration");
        RegistrationButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationButtenActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RegistrationButten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ConfirmPasswordText, PasswordText, UsernameText});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CloseButton, RegistrationButten});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ConfirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseButton)
                    .addComponent(RegistrationButten, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ConfirmPasswordText, PasswordText, UsernameText});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CloseButton, RegistrationButten});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrationButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationButtenActionPerformed
        // TODO add your handling code here:
        
        String Username = UsernameText.getText();
        String FirstName = FirstNameText.getText();
        String LastName =  LastNameText.getText();
        String Phone = PhoneText.getText();
        String Age = AgeText.getText();
        String JopTitile = (String)JopTitileComboBox.getSelectedItem();
        String Password = PasswordText.getText();
        String ConfirmPassword = ConfirmPasswordText.getText();
        
        MaleRadioButton.setActionCommand("male");
        FemaleRadioButton.setActionCommand("Female");
        
        ButtonModel selectedModel = buttonGroup1.getSelection();
        
        if (selectedModel == null) {
            JOptionPane.showMessageDialog(this, "Please select Gender");
            return;
        }
        
        String Gender = selectedModel.getActionCommand();


        if(Username.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter UserName");
            return;
        }
        if(FirstName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter FirstName");
            return;
        }
        if(LastName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter LastName");
            return;
        }

        if(Age.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter Age");
            return;
        }
        if(Phone.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter Phone");
            return;
        }
         if (JopTitile == null || JopTitile.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a Doctor");
        return;
    }
        if(Password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter Password");
            return;
        }
        if(ConfirmPassword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter Confirm Password");
            return;
        }

        if(!Password.equals(ConfirmPassword)){
            JOptionPane.showMessageDialog(this, "Passwords don't match!");
            return;   
        }

        if(!FirstName.matches("^[a-zA-Z-]+$")){
            message1.setVisible(true);
            return; 
        }
        if(!LastName.matches("^[a-zA-Z-]+$")){
            message2.setVisible(true);
            return; 
        }

        if(!Age.matches("[0-9]+")){
            message3.setVisible(true);
            return; 
        }
        if(!(Phone.length() == 11 && Phone.charAt(0) == '0' && Phone.charAt(1) == '1' && 
            (Phone.charAt(2) == '1' || Phone.charAt(2) == '2' || Phone.charAt(2) == '0' || Phone.charAt(2) == '5'))){
            message4.setVisible(true);
            return; 
        }

        try {
            DatabaseAdapter db = new DatabaseAdapter();
            
            List<Map<String, String>> existingUsers = db.select("users", "Username = '" + Username + "'");
            
            if(!existingUsers.isEmpty()){ 
                JOptionPane.showMessageDialog(this,"Username already exists!!!");
            }

            Map<String, String> userData = new HashMap<>();
            userData.put("First_Name", FirstName);
            userData.put("Age", Age);
            userData.put("Phone", Phone);
            userData.put("Jop_Titile", JopTitile);
            userData.put("Gender", Gender);
            userData.put("Username", Username);
            userData.put("Password", Password);
            

            if(db.insert("users", userData)){
                JOptionPane.showMessageDialog(this, 
                    "Registration Successful!\n\n" +
                    "User can now login to the system.");
                
                setVisible(false);
                dispose(); 
                
            } else {
                JOptionPane.showMessageDialog(this, "Registration Failed!");
            }
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_RegistrationButtenActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void PhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextActionPerformed

    private void LastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextActionPerformed

    private void AgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTextActionPerformed

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(registrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeText;
    private javax.swing.JButton CloseButton;
    private javax.swing.JPasswordField ConfirmPasswordText;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JTextField FirstNameText;
    private javax.swing.JComboBox<String> JopTitileComboBox;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JButton RegistrationButten;
    private javax.swing.JTextField UsernameText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JLabel message3;
    private javax.swing.JLabel message4;
    // End of variables declaration//GEN-END:variables
}
