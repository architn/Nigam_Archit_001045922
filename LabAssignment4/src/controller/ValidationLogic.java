/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import model.AppConstants;
import model.PatientInfo;
import model.PatientRecords;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author architnigam
 */
public class ValidationLogic {
    AppConstants AppConstants = new AppConstants();
    JFrame frame;
    
    public boolean ValidateIfAllFieldsOnUIAreFilledAndAreNumeric(String MRN, String age, String weight, 
            String height, String cholesterolReading, String systoleReading, 
            String diastoleReading) {
        
        boolean areAllFieldsFilled = false;
        if (!(MRN.equals("")) && !(age.equals("")) && !(weight.equals("")) && !(height.equals("")) && !(cholesterolReading.equals(""))
               && !(systoleReading.equals("")) && !(diastoleReading.equals("")))
        {
            areAllFieldsFilled = true;
        }
        boolean areAllFieldsNumeric = false;
        
        if(MRN.length() >= 1 && age.length()>=1 && weight.length() >= 1 && height.length() >= 1 && cholesterolReading.length() >= 1
                && systoleReading.length() >= 1 && diastoleReading.length() >= 1)
        {
            if(! MRN.matches(AppConstants.RegularExpressionForNumericFields)
                    || ! age.matches(AppConstants.RegularExpressionForNumericFields)
                    || ! weight.matches(AppConstants.RegularExpressionForNumericFields)
                    || ! height.matches(AppConstants.RegularExpressionForNumericFields) 
                    || ! cholesterolReading.matches(AppConstants.RegularExpressionForNumericFields)
                    || ! systoleReading.matches(AppConstants.RegularExpressionForNumericFields)
                    || ! diastoleReading.matches(AppConstants.RegularExpressionForNumericFields))
            {
                areAllFieldsNumeric = false;
                JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageAllFieldsAreNotNumeric);
            }
            else 
            {
                areAllFieldsNumeric = true;
            }
        }
        else
        {
                areAllFieldsFilled = false;
                JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageAllFieldsNotFilled);
        }
        
        boolean validationSuccessful = false;
        
        if(areAllFieldsFilled && areAllFieldsNumeric)
        {
            validationSuccessful = true;
        }
        else{
            validationSuccessful = false;
        }
        return validationSuccessful;
    }
    
    public boolean ValidateThatAllFieldsAreFilledDuringUpdate(String weight, 
            String height, String cholesterolReading, String systoleReading, 
            String diastoleReading)
    {
        boolean areAllFieldsFilled = false;
        if ( !(weight.equals("")) && !(height.equals("")) && !(cholesterolReading.equals(""))
               && !(systoleReading.equals("")) && !(diastoleReading.equals("")))
        {
            areAllFieldsFilled = true;
        }
        else
        {
                areAllFieldsFilled = false;
                JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageAllFieldsNotFilled);
        }
        return areAllFieldsFilled;
    }
    
    
    public boolean ValidateIfMRNIsARegisteredPatient(PatientRecords patientRecords, String inputMRN)
    {
        boolean isInputMRNARegisteredPatient = false;
        int doesInputMRNExistInXML = 0;
           for(String registeredMRNs : patientRecords.getRegisteredMRNs())
           {
               if(registeredMRNs.equals(inputMRN))
               {
                   doesInputMRNExistInXML++;
               }
           }
           
            if(doesInputMRNExistInXML != 0)
            {
                isInputMRNARegisteredPatient = true;
            }
            else
            {
                isInputMRNARegisteredPatient = false;
                JOptionPane.showMessageDialog(frame, (AppConstants.ErrorMessageMRNNotFound1 + inputMRN +
                AppConstants.ErrorMessageMRNNotFound2));
            } 
        return isInputMRNARegisteredPatient;
    }
    
    public boolean ValidateIfMRNDoesNotHaveAnExistingVitalSign(PatientRecords patientRecords, String inputMRNOnVitalSign)
    {
        int numberOfDuplicateRecords = 0;
        boolean doesMRNHaveExistingVitalSigns = true;
        
        for(PatientInfo patientInfo : patientRecords.getPatientRecords())
        {
            if(inputMRNOnVitalSign.equals(patientInfo.getMedicalRecordNumber()))
            {
                numberOfDuplicateRecords++;
            }
        }
        if(numberOfDuplicateRecords !=0)
        {
            doesMRNHaveExistingVitalSigns = false;
            JOptionPane.showMessageDialog(frame, AppConstants.TheMRN + inputMRNOnVitalSign 
            + AppConstants.ErrorMessageForDuplicateVitalSigns);
        }
        return doesMRNHaveExistingVitalSigns;
    }
    
    public boolean ValidateIfAllFieldsAreFilledOnCreateResident(String fname, String lname, String address, 
            String zipCode, String dateOfBirth, String ssn, String mrn)
    {
        boolean areAllFieldsSet = false;
        if(fname.length() >= 1 && lname.length()>=1 && address.length() >= 1 && zipCode.length() >= 1 && dateOfBirth.length() >= 1
                && ssn.length() >= 1 && mrn.length() >= 1)
        {
            areAllFieldsSet = true;
        }
        else{
            areAllFieldsSet = false;
            JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageAllFieldsNotFilled);
        }
        return areAllFieldsSet;
    }
    
    public boolean ValidateAllFieldsAreFilledOnRegistration(String residentID, String firstName, 
            String lastName, String dateOfBirth, String city, String state, String mrn)       
    {
         boolean areAllFieldsSet = false;
         if(residentID.length() >= 1 && firstName.length()>=1 && lastName.length() >= 1 && dateOfBirth.length() >= 1 && dateOfBirth.length() >= 1
                && city.length() >= 1 && state.length() >= 1 && mrn.length() >= 1)
         {
            areAllFieldsSet = true;
         }
         else{
            areAllFieldsSet = false;
            JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageAllFieldsNotFilled);
        }
        return areAllFieldsSet;
    }
    
    public boolean ValidateIfPatientIsAbove18YearsOfAge(Date dateOfBirth)
    {
        LocalDate today = LocalDate.now(); 
        boolean isPatientAboveOrEqualtoEighteeenYearsOfAge = false;
        LocalDate dateOfBirthOfPatient = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period p = Period.between(dateOfBirthOfPatient, today);
        int ageOfPatient = p.getYears();
        if(ageOfPatient >= 18)
        {
            isPatientAboveOrEqualtoEighteeenYearsOfAge = true;
        }
        else{
            isPatientAboveOrEqualtoEighteeenYearsOfAge = false;
            JOptionPane.showMessageDialog(frame, AppConstants.ErrorPatientIsAbove18YearsOfAge);
        }
        return isPatientAboveOrEqualtoEighteeenYearsOfAge;
    }
    
    public boolean ValidateIfPatientIsAbove18YearsOfAge(int ageOfPatient)
    {
        boolean isPatientAboveOrEqualtoEighteeenYearsOfAge = false;
        if(ageOfPatient >= 18)
        {
            isPatientAboveOrEqualtoEighteeenYearsOfAge = true;
        }
        else{
            isPatientAboveOrEqualtoEighteeenYearsOfAge = false;
            JOptionPane.showMessageDialog(frame, AppConstants.ErrorPatientIsAbove18YearsOfAge);
        }
        return isPatientAboveOrEqualtoEighteeenYearsOfAge;
    }
}
