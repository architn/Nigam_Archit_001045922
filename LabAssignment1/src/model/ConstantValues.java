/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author architnigam
 */
public class ConstantValues {
    
    
    // Labels
    
    public String labelMRN = "MRN";
    public String labelSSN = "SSN";
    public String labelContactNumber = "Contact Number";
    public String labelFaxNumber = "Fax Number";
    public String labelZipCode = "Zip Code";
    public String labelMedicalRecordNumber = "Medical Record Number";
    public String labelHealthPlanNumber = "Health Plan Number";
    public String labelBankAccountNumber = "Bank Account Number";
    public String labelVehicleNumber = "Vehicle Number";
    public String labelDeviceNumber = "Device Number";
    public String labelCertificateNumber = "Certificate Number";
    public String Name = "Full Name";
    public String City = "City";
    
    // Dialog Box Messages
    
    public String wrongSSNValueMessage = "Incorrect SSN format! SSN should have 9 digits";
    public String wrongMobileNumberValueMessage = "Incorrect Mobile Number format! Mobile number should have"
            + " 10 digits.";
    public String wrongZipCodeValueMessage = "Incorrect Zip Code format! Zip Code should have 5 digits";
    public String wrongEmailIDValueMessage = "Incorrect email address format! Please re-verify the entered format.";
    public String successfulSaveMessage = "User Information successfully saved!";
    public String compulsoryFieldsNotFilledErrorMessage = "Fields marked in asterix are compulsory fields! Make sure"
            + " all of them are filled before saving and submitting ";
    public String wrongFaxNumberValueMessage = "Incorrect Fax Number format. Fax Number should only have 10 digits";
    public String unexpectedErrorMessage = "Unexpected Error, contact system administrator.";
    public String wrongURLFormat = "Incorrect LinkedIn URL format, please verify the URL entered again!";
    public String wrongIPAddressFormat = "Incorrect IPv4  address format, please verify the IP Address entered again!";
    public String wrongMRNValueMessage = "Incorrect MRN value! MRN should only have digits";
    public String wrongHealthPlanNumberValueMessage = "Incorrect Health Plan number value! Health Plan Number should only "
            + "have digits";
    
    // Regular Expressions
    
    public String RegularExpressionForURLValidation = "[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)";
    public String RegularExpressionForEmailValidation = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    public String RegularExpressionForIPAddressValidation = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$";
    public String RegularExpressionForAlphanumericFields = "^[a-zA-Z0-9]+$";
    public String RegularExpressionForNumericFields = "[0-9]+";
    public String RegularExpressionForCharacterOnly = "^[\\\\p{L} .'-]+$";
    
}
