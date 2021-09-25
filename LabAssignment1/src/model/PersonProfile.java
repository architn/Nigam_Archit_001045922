/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author architnigam
 */
public class PersonProfile {
    
    private String name; 
    private String lineAddress1;
    private String lineAddress2;
    private String state;
    private String city;
    private String zipCode;
    private Date dateOfBirth;
    private String telephoneNumer;
    private String faxNumber;
    private String emailID;
    private String ssn;
    private String medicalRecordNumber;
    private String healthPlanNumber;
    private String bankAccountNumber;
    private String certificateNumber;
    private String vehicleNumber;
    private String deviceIdenitifer;
    private String linkedInUrl;
    private String ipAddress;
    private String biometricIdentifier;
    private String imageOfPerson;
    private int age;
    private String uniqueIdentiferCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLineAddress1() {
        return lineAddress1;
    }

    public void setLineAddress1(String lineAddress1) {
        this.lineAddress1 = lineAddress1;
    }

    public String getLineAddress2() {
        return lineAddress2;
    }

    public void setLineAddress2(String lineAddress2) {
        this.lineAddress2 = lineAddress2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephoneNumer() {
        return telephoneNumer;
    }

    public void setTelephoneNumer(String telephoneNumer) {
        this.telephoneNumer = telephoneNumer;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }
    
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getHealthPlanNumber() {
        return healthPlanNumber;
    }

    public void setHealthPlanNumber(String healthPlanNumber) {
        this.healthPlanNumber = healthPlanNumber;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDeviceIdenitifer() {
        return deviceIdenitifer;
    }

    public void setDeviceIdenitifer(String deviceIdenitifer) {
        this.deviceIdenitifer = deviceIdenitifer;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getBiometricIdentifier() {
        return biometricIdentifier;
    }

    public void setBiometricIdentifier(String biometricIdentifier) {
        this.biometricIdentifier = biometricIdentifier;
    }

    public String getImageOfPerson() {
        return imageOfPerson;
    }

    public void setImageOfPerson(String imageOfPerson) {
        this.imageOfPerson = imageOfPerson;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
     public String getUniqueIdentiferCode() {
        return uniqueIdentiferCode;
    }

    public void setUniqueIdentiferCode(String unqiqueIdentiferCode) {
        this.uniqueIdentiferCode = unqiqueIdentiferCode;
    }
    
     // Function to calculate the age of a person.
    public int calculateAgeOfPerson(JDateChooser dateChooserDOB){
        Date dateOfBirthOfPerson = dateChooserDOB.getDate();
        LocalDate date = dateOfBirthOfPerson.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yearOfBirth = date.getYear();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int ageOfPerson = currentYear - yearOfBirth;
        return ageOfPerson;
    }
    
    public String generateUniqueIdentiferCode(JTextField txtName, JComboBox ddState)
    {
//        // First two characters of name + current year + 6 digit random number
//        // AR2021MA651907
        String firstTwoCharactersOfName = txtName.getText().substring(0, 2).toUpperCase();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int min = 100000;
        int max = 999999;
        String stateValue = getState();
        String stateCode;
        switch(stateValue){
            case "Massachusetts":
                stateCode = "MA";
                break;
            case "New York":
                stateCode = "NY";
                break;
            case "Texas":
                  stateCode = "TX";
                  break;
            case "Florida":
                stateCode = "FL";
                break;  
                
            default:
                stateCode = "US";
                break;
        }
        int randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        String uniqueIdentifierCodeValue = firstTwoCharactersOfName + currentYear + stateCode + randomNumber;
        return uniqueIdentifierCodeValue;
    }
}
