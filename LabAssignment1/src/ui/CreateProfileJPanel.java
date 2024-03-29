/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import model.PersonProfile;
import model.ConstantValues;
import javax.swing.JFileChooser;
import model.ValidationLogic;

/**
 *
 * @author architnigam
 */
public class CreateProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateProfileJPanel
     */
    
    PersonProfile personProfile;
    ConstantValues constantvalues = new ConstantValues();
    ValidationLogic validationLogic = new ValidationLogic();
    
    public CreateProfileJPanel(PersonProfile personProfile) {
        initComponents();
        this.personProfile = personProfile;
        dateChooserDOB.setMaxSelectableDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // Function to ensure that all mandatory fields are filled by the user.
    public boolean performCompulsoryFieldsValidation() {
        
        boolean allCompulsoryFieldsFilled = false;
        String fullName = txtFullName.getText();
        String address = txtAddressLine1.getText() + " "+txtLineAddress2.getText();
        String city = txtCity.getText();
        String state = ddState.getSelectedItem().toString();
        String zipCode = txtZipCode.getText();
        String contactNumber = txtContactNumber.getText();
        String emailID = txtEmailID.getText();
        String ssnValue = txtSSN.getText();
        String pathOfImage = txtImagePath.getText();
        
        if( !(fullName.length() != 0 && address.length() != 0
                && city.length() != 0 && state.length() != 0 
                && zipCode.length() != 0 && contactNumber.length() != 0
                && emailID.length() != 0 && ssnValue.length() != 0 & pathOfImage.length() != 0
              ) 
           )
        {
            JOptionPane.showMessageDialog(this, constantvalues.compulsoryFieldsNotFilledErrorMessage);
        }
        else{
            allCompulsoryFieldsFilled = true;
        }
        return allCompulsoryFieldsFilled;
        
    }
    
    
    // Function to validate fields are correctly filled in correct format
    public boolean performFieldValueValidation() {
        
       boolean allFieldsValid = (  validationLogic.validateIfContactNumberIsCorrect(txtContactNumber)
                                   && validationLogic.validateIfEmailIDIsCorrect(txtEmailID)
                                   && validationLogic.validateIfSSNValueIsCorrect(txtSSN)
                                   && validationLogic.validateIfZipCodeIsCorrect(txtZipCode)
                                   && validationLogic.validateIfFaxNumberOnlyAcceptsNumericValues(txtFaxNumber)
                                   && validationLogic.validateIfUrlIsCorrect(txtLinkedIn)
                                   && validationLogic.validateIPV4AddressFormat(txtIPAddress)
                                   && validationLogic.validateIfFieldsAcceptAlphanumericInputOnly(txtBankAccountNumber, 
                                           constantvalues.labelBankAccountNumber)
                                   && validationLogic.validateIfFieldsAcceptAlphanumericInputOnly(txtCertificateNumber, 
                                           constantvalues.labelCertificateNumber)
                                   && validationLogic.validateIfFieldsAcceptAlphanumericInputOnly(txtVehicleNumber, 
                                           constantvalues.labelVehicleNumber)
                                   && validationLogic.validateIfFieldsAcceptAlphanumericInputOnly(txtDeviceNumber, 
                                           constantvalues.labelDeviceNumber)
                                   && validationLogic.validateIfFieldInputsNumberOnly(txtMRN.getText(), 
                                           constantvalues.labelMRN)
                                  && validationLogic.validateIfFieldInputsNumberOnly(txtHealthPlanNumber.getText(), 
                                           constantvalues.labelHealthPlanNumber)
                                );
       return allFieldsValid;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPageTitle = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblLineAddress1 = new javax.swing.JLabel();
        lblLineAddress2 = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        lblFaxNumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtAddressLine1 = new javax.swing.JTextField();
        txtLineAddress2 = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        txtFaxNumber = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        lblMRN = new javax.swing.JLabel();
        lblHealthPlanNumber = new javax.swing.JLabel();
        lblBankAccNumber = new javax.swing.JLabel();
        lblCertificateNumber = new javax.swing.JLabel();
        lblVehicleNumber = new javax.swing.JLabel();
        lblDeviceNumber = new javax.swing.JLabel();
        lblLinkedInUrl = new javax.swing.JLabel();
        lblIPAddress = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtMRN = new javax.swing.JTextField();
        txtHealthPlanNumber = new javax.swing.JTextField();
        txtBankAccountNumber = new javax.swing.JTextField();
        txtCertificateNumber = new javax.swing.JTextField();
        txtVehicleNumber = new javax.swing.JTextField();
        txtDeviceNumber = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtIPAddress = new javax.swing.JTextField();
        dateChooserDOB = new com.toedter.calendar.JDateChooser();
        lblBiometricIdentifier = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        txtImagePath = new javax.swing.JTextField();
        ddState = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        lblPageTitle.setText("                                  CREATE PROFILE: (Fields marked in asterix * are compulsory)");

        lblFullName.setText("Full Name:*");

        lblLineAddress1.setText("Address Line 1: *");

        lblLineAddress2.setText("Address Line 2: ");

        lblState.setText("State:*");

        lblCity.setText("City: *");

        lblZipCode.setText("Zip Code: *");

        lblDOB.setText("Date of Birth: *");

        lblContactNumber.setText("Contact Number:*");

        lblFaxNumber.setText("Fax Number: ");

        lblEmail.setText("Email ID:* ");

        lblSSN.setText("Social Security Number:*");

        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        lblMRN.setText("Medical Record Number: ");

        lblHealthPlanNumber.setText("Health Plan Number:");

        lblBankAccNumber.setText("Bank Account Number:");

        lblCertificateNumber.setText("Certificate Number:");

        lblVehicleNumber.setText("Vehicle Number: ");

        lblDeviceNumber.setText("Device Number: ");

        lblLinkedInUrl.setText("LinkedIn URL: ");

        lblIPAddress.setText("IP Address: ");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtMRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMRNActionPerformed(evt);
            }
        });

        txtDeviceNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceNumberActionPerformed(evt);
            }
        });

        lblBiometricIdentifier.setText("Biometric Identifier:*");

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        ddState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Massachusetts", "New York", "California", "Texas", "Florida"}));
        ddState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddStateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPageTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSSN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblVehicleNumber)
                            .addComponent(lblDeviceNumber)
                            .addComponent(lblLinkedInUrl)
                            .addComponent(lblIPAddress)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMRN)
                                        .addComponent(lblHealthPlanNumber))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMRN, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblBankAccNumber)
                                        .addComponent(lblCertificateNumber)
                                        .addComponent(lblBiometricIdentifier))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDeviceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnOpen))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(201, 201, 201)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 269, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipCode)
                    .addComponent(lblCity)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblFullName))
                            .addComponent(lblLineAddress1)
                            .addComponent(lblLineAddress2)
                            .addComponent(lblContactNumber)
                            .addComponent(lblFaxNumber)
                            .addComponent(lblEmail)
                            .addComponent(lblDOB)
                            .addComponent(lblState))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ddState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLineAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullName)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLineAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLineAddress2)
                    .addComponent(txtLineAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(ddState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDOB)
                    .addComponent(dateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNumber)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaxNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMRN)
                    .addComponent(txtMRN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHealthPlanNumber)
                    .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankAccNumber)
                    .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificateNumber)
                    .addComponent(txtCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVehicleNumber)
                    .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceNumber)
                    .addComponent(txtDeviceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLinkedInUrl)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblIPAddress))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpen)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBiometricIdentifier)
                        .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(performCompulsoryFieldsValidation() && performFieldValueValidation()){
            
        personProfile.setName(txtFullName.getText());
        personProfile.setAge(personProfile.calculateAgeOfPerson(dateChooserDOB));
        personProfile.setLineAddress2(txtAddressLine1.getText() + "\n"+txtLineAddress2.getText());
        personProfile.setState(ddState.getSelectedItem().toString());
        personProfile.setCity(txtCity.getText());
        personProfile.setZipCode(txtZipCode.getText());
        personProfile.setDateOfBirth(dateChooserDOB.getDate());
        personProfile.setTelephoneNumer(txtContactNumber.getText());
        personProfile.setFaxNumber(txtFaxNumber.getText());
        personProfile.setEmailID(txtEmailID.getText());
        personProfile.setSsn(txtSSN.getText());
        personProfile.setBankAccountNumber(txtBankAccountNumber.getText());
        personProfile.setMedicalRecordNumber(txtMRN.getText());
        personProfile.setHealthPlanNumber(txtHealthPlanNumber.getText());
        personProfile.setCertificateNumber(txtCertificateNumber.getText());
        personProfile.setVehicleNumber(txtVehicleNumber.getText());
        personProfile.setDeviceIdenitifer(txtDeviceNumber.getText());
        personProfile.setLinkedInUrl(txtLinkedIn.getText());
        personProfile.setIpAddress(txtIPAddress.getText());
        personProfile.setBiometricIdentifier(txtImagePath.getText());
        personProfile.setUniqueIdentiferCode(personProfile.generateUniqueIdentiferCode(txtFullName, ddState));
        JOptionPane.showMessageDialog(this, constantvalues.successfulSaveMessage);
        }   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtMRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMRNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMRNActionPerformed

    private void txtDeviceNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceNumberActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.showOpenDialog(null);
    File file = fileChooser.getSelectedFile();
    String filename = file.getAbsolutePath();
    txtImagePath.setText(filename);
    }//GEN-LAST:event_btnOpenActionPerformed

    private void ddStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddStateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dateChooserDOB;
    private javax.swing.JComboBox<String> ddState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBankAccNumber;
    private javax.swing.JLabel lblBiometricIdentifier;
    private javax.swing.JLabel lblCertificateNumber;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeviceNumber;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFaxNumber;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblHealthPlanNumber;
    private javax.swing.JLabel lblIPAddress;
    private javax.swing.JLabel lblLineAddress1;
    private javax.swing.JLabel lblLineAddress2;
    private javax.swing.JLabel lblLinkedInUrl;
    private javax.swing.JLabel lblMRN;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblVehicleNumber;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtCertificateNumber;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDeviceNumber;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtHealthPlanNumber;
    private javax.swing.JTextField txtIPAddress;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JTextField txtLineAddress2;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMRN;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtVehicleNumber;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables

      
}
