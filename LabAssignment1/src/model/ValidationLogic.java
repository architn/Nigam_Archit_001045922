/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author architnigam
 * 
 * This class file contains the validations for the following fields:
 *      1. Validation logic to ensure that numeric fields only allow the input of digits
 *      2. Email ID format is correct.
 *      3. SSN value is 9 digits long
 *      4. Contact Number is 10 digits long.
 *      5. Zip Code is 5 digits long.
 *      6. Verifying that entered URL is correct
 *      7. IP Address format is correct.
 */
public class ValidationLogic {
    
    JFrame frame;
    ConstantValues constantvalues = new ConstantValues();
    
     // Validation logic for Numeric Fields to accept only digits.
     public boolean validateIfFieldInputsNumberOnly(String input, String field)
    {
        boolean numbersOnlyValidation = true;
        if(input.length() > 1)
        {
            if(! input.matches(constantvalues.RegularExpressionForNumericFields))
            {
                numbersOnlyValidation = false;
                if(field.equals(constantvalues.labelMRN) || field.equals(constantvalues.labelMedicalRecordNumber))
                {
                    JOptionPane.showMessageDialog(frame, constantvalues.wrongMRNValueMessage);
                }
                else if(field.equals(constantvalues.labelHealthPlanNumber))
                {
                    JOptionPane.showMessageDialog(frame, constantvalues.wrongHealthPlanNumberValueMessage);
                }
            }
        }
        return numbersOnlyValidation;
        
    }
     
     public boolean validateIfTextFieldOnlyTakesCharactersAsInput(JTextField txtName, String fieldType)
     {
         boolean stringOnlyValidation = true;
         String fieldValue = txtName.getText();
         if(fieldValue.length() > 1)
         {
            if(! fieldValue.matches(constantvalues.RegularExpressionForCharacterOnly))
           {
               stringOnlyValidation = false;
               JOptionPane.showMessageDialog(frame, fieldType+" accepts characters input only! No digits or special"
                       + " characters allowed");
           }
        }
         return stringOnlyValidation;
     }
     
     public boolean validateIfFieldsAcceptAlphanumericInputOnly(JTextField textField, String fieldType)
     {
         boolean alphaNumericValidation = true;
         String fieldValue = textField.getText();
         if(fieldValue.length() > 1)
         {
             if(fieldValue.length() > 1)
             {
                if(! fieldValue.matches(constantvalues.RegularExpressionForAlphanumericFields))
               {
                   alphaNumericValidation = false;
                   JOptionPane.showMessageDialog(frame, fieldType+" accepts alphanumeric input only! No special"
                           + " characters allowed");

               }
            }
         }
         return alphaNumericValidation;
     }
    
     // Validation logic to ensure Email ID is entered in correct format by user
    public boolean validateIfEmailIDIsCorrect(JTextField txtEmailID){
        
        boolean isEmailIDValid = false;
        Pattern patternRegexEmail = Pattern.compile(constantvalues.RegularExpressionForEmailValidation);
        Matcher matchRegexEmail = patternRegexEmail.matcher(txtEmailID.getText());

        if (matchRegexEmail.find())
        {
            isEmailIDValid = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, constantvalues.wrongEmailIDValueMessage);
        }
        return isEmailIDValid;
    }
    
    // Function to validate that SSN only has 9 digits
    public boolean validateIfSSNValueIsCorrect(JTextField txtSSN){
        boolean isSSNValid = true;
        String ssnValue = txtSSN.getText();
        
        // SSN is a non-mandatory field, however if value is entered, then it should be a 9 digit code
        if(ssnValue.length() > 1)
        {
            if(ssnValue.length() == 9 && validateIfFieldInputsNumberOnly(ssnValue, constantvalues.labelSSN) )
            {
                isSSNValid = true;
            }
            else
            {
                JOptionPane.showMessageDialog(frame, constantvalues.wrongSSNValueMessage);
                isSSNValid = false;
            }  
        }
        return isSSNValid;
    }
    
    // Function to validate that contact mobile number has 10 digits
     public boolean validateIfContactNumberIsCorrect(JTextField txtContactNumber){
        boolean isContactNumberValid = false;
        String contactNumberValue = txtContactNumber.getText();
        if(contactNumberValue.length() == 10 && validateIfFieldInputsNumberOnly(contactNumberValue, constantvalues.labelContactNumber))
        {
            isContactNumberValid = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, constantvalues.wrongMobileNumberValueMessage);
        }
        return isContactNumberValid;
    }
     
     // Function to validate that zip code has 5 digits
    public boolean validateIfZipCodeIsCorrect(JTextField txtZipCode){
        boolean isZipCodeValid = false;
        String zipCodeValue = txtZipCode.getText();
        
        if(zipCodeValue.length() == 5 && validateIfFieldInputsNumberOnly(zipCodeValue, constantvalues.labelZipCode)){
            isZipCodeValid = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, constantvalues.wrongZipCodeValueMessage);
        }
        return isZipCodeValid;
    }
      
    public boolean validateIfFaxNumberOnlyAcceptsNumericValues(JTextField txtFaxNo)
    {
        boolean isFaxNumberValid = true;
        String faxNumberValue = txtFaxNo.getText();
        
        // Fax Number is a non-mandatory field, however if value is entered, then it should be a 10 digit code
        if(faxNumberValue.length() > 1)
        {
            if(faxNumberValue.length() == 10 && validateIfFieldInputsNumberOnly(faxNumberValue, constantvalues.labelFaxNumber) )
            {
                isFaxNumberValid = true;
            }
            else
            {
                JOptionPane.showMessageDialog(frame, constantvalues.wrongFaxNumberValueMessage);
                isFaxNumberValid = false;
            }  
        }
        return isFaxNumberValid;
    }
    
    // Validate that URL entered by user is correct 
    public boolean validateIfUrlIsCorrect(JTextField txtUrl)
    {
        boolean isUrlValid = true;
        String urlValue = txtUrl.getText();
        if(urlValue.length() > 1)
        {
          Pattern patternRegexUrl = Pattern.compile(constantvalues.RegularExpressionForURLValidation);
          Matcher matchRegexUrl = patternRegexUrl.matcher(txtUrl.getText());
            if (matchRegexUrl.find())
            {
                isUrlValid = true;
            }   
            else
            {
                    JOptionPane.showMessageDialog(frame, constantvalues.wrongURLFormat);
                    isUrlValid = false;
             }
        }
        return isUrlValid;
    }
    
    // Validate that IPv4 Address entered by user is correct.
    public boolean validateIPV4AddressFormat(JTextField txtIPAddress)
    {
        boolean isIPv4AddressURLvalid = true;
        String ipv4Addressvalue = txtIPAddress.getText();
        
        if(ipv4Addressvalue.length() > 1)
        {
            Pattern patternRegexIPAddress = Pattern.compile(constantvalues.RegularExpressionForIPAddressValidation);
            Matcher matchRegexIPAddress = patternRegexIPAddress.matcher(txtIPAddress.getText());
            if (matchRegexIPAddress.find())
            {
                isIPv4AddressURLvalid = true;
            }   
            else
            {
                    JOptionPane.showMessageDialog(frame, constantvalues.wrongIPAddressFormat);
                    isIPv4AddressURLvalid = false;
             }
        }
        return isIPv4AddressURLvalid;
    }
}
