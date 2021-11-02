/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
/**
 *
 * @author architnigam
 */
public class ResidentInfo {
    private int ID;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int ageOfResident;
    private String SSN;
    private String address;
    private String city;
    private String zipCode;
    private String state; 
    private String mrnOfResident;
    private boolean isResidentAPatient;
    Residence residenceNumber;

    public int getResidentID() {
        return ID;
    }

    public void setResidentID(int ID) {
        this.ID = ID;
    }

    public String getResidentFirstName() {
        return firstName;
    }

    public void setResidentFirstName(String residentFirstName) {
        this.firstName = residentFirstName;
    }

    public String getResidentLastName() {
        return lastName;
    }

    public void setResidentLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSsnOfresident() {
        return SSN;
    }

    public void setSsnOfresident(String SSN) {
        this.SSN = SSN;
    }

    public String getAddressOfresident() {
        return address;
    }

    public void setAddressOfresident(String address) {
        this.address = address;
    }

    
    public String getCityOfResident() {
        return city;
    }

    public void setCityOfResident(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    } 

    public boolean isIsResidentAPatient() {
        return isResidentAPatient;
    }

    public String getMrnOfResident() {
        return mrnOfResident;
    }

    public void setMrnOfResident(String mrnOfResident) {
        this.mrnOfResident = mrnOfResident;
    }

    public void setIsResidentAPatient(boolean isResidentAPatient) {
        this.isResidentAPatient = isResidentAPatient;
    }  

    public int getAgeOfResident() {
        return ageOfResident;
    }

    public void setAgeOfResident(int ageOfResident) {
        this.ageOfResident = ageOfResident;
    }
   
}
