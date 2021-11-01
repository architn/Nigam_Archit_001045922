/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

// Important Links: 

import controller.XMLHandler;
import java.util.Date;

//Blodd Pressure:  https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings
// Cholestrol: https://www.ahajournals.org/doi/full/10.1161/01.cir.0000141564.89465.4e
/**
 *
 * @author architnigam
 */
public class PatientInfo extends ResidentInfo {
    private String medicalRecordNumber;
    private Date dateOfVisit;
    private double weightInPounds;
    private double heightInInches;
    private Date dateOfBirth;
    private int age;
    private String ethinicity;
    private String gender;
    private double BMI;
    private double systoleReadingInmmHg;
    private double diastoleReadingInmmHg;
    private double cholesterolReadingInmgDl;
    private int cholesterolDangerLevel;
    private int BMIDangerLevel;
    private int bloodPressureDangerLevel;
    private String district;
    ResidentInfo residentInfo;
    
    PatientRecords patientRecords = new PatientRecords();
    XMLHandler xmlHandler = new XMLHandler();
    
    public PatientInfo()
    {
        super();
        
    }
    
    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public String getEthinicity() {
        return ethinicity;
    }

    public void setEthinicity(String ethinicity) {
        this.ethinicity = ethinicity;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public double getSystoleReadingInmmHg() {
        return systoleReadingInmmHg;
    }

    public void setSystoleReadingInmmHg(double systoleReadingInmmHg) {
        this.systoleReadingInmmHg = systoleReadingInmmHg;
    }

    public double getDiastoleReadingInmmHg() {
        return diastoleReadingInmmHg;
    }

    public void setDiastoleReadingInmmHg(double diastoleReadingInmmHg) {
        this.diastoleReadingInmmHg = diastoleReadingInmmHg;
    }

    public double getCholestrolReadingInmgDl() {
        return cholesterolReadingInmgDl;
    }

    public void setCholestrolReadingInmgDl(double cholesterolReadingInmgDl) {
        this.cholesterolReadingInmgDl = cholesterolReadingInmgDl;
    }
    
    public int getCholestrolDangerLevel() {
        return cholesterolDangerLevel;
    }

    public void setCholestrolDangerLevel(int cholesterolDangerLevel) {
        this.cholesterolDangerLevel = cholesterolDangerLevel;
    }

    public int getBMIDangerLevel() {
        return BMIDangerLevel;
    }

    public void setBMIDangerLevel(int BMIDangerLevel) {
        this.BMIDangerLevel = BMIDangerLevel;
    }

    public int getBloodPressureDangerLevel() {
        return bloodPressureDangerLevel;
    }

    public void setBloodPressureDangerLevel(int bloodPressureDangerLevel) {
        this.bloodPressureDangerLevel = bloodPressureDangerLevel;
    } 

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    } 

    public ResidentInfo getResidentInfo() {
        return residentInfo;
    }

    public void setResidentInfo(ResidentInfo residentInfo) {
        this.residentInfo = residentInfo;
    }
    
}
