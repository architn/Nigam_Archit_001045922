/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class PatientRecords {
    
    private ArrayList<PatientInfo> patientRecords;
    private ArrayList<String> registeredMRNs;
    
    public PatientRecords()
    {
        this.patientRecords = new ArrayList<PatientInfo>();
        this.registeredMRNs = new ArrayList<String>();
    }

    public ArrayList<PatientInfo> getPatientRecords() {
        return patientRecords;
    }
    

    public void setPatientRecords(ArrayList<PatientInfo> patientRecords) {
        this.patientRecords = patientRecords;
    }  
    
    public PatientInfo addPatientRecord()
    {
        PatientInfo newPatientRecord = new PatientInfo();
        patientRecords.add(newPatientRecord);
        return newPatientRecord;
    }
    
    public PatientInfo updatePatientRecord(int indexOfSelectedRecord, PatientInfo selectedPatientRecord)
    {
        patientRecords.set(indexOfSelectedRecord, selectedPatientRecord);
        return selectedPatientRecord;
    }
    
    public PatientInfo returnPatientRecords(int index)
    {
        return patientRecords.get(index);
    }
    
    
    public void deletePatientRecord(PatientInfo selectedPatientRecord)
    {
        patientRecords.remove(selectedPatientRecord);
    }
    
    public int ReturnNumberOfRecords()
    {
        int numberOfRecords = patientRecords.size();
        return numberOfRecords;
    }
    
     public ArrayList<String> getRegisteredMRNs() {
        return registeredMRNs;
    }
    

    public void setRegisteredMRN(ArrayList<String> registeredMRNs) {
        this.registeredMRNs = registeredMRNs;
    }  
    
    public ArrayList<String> addMRNRecord(String mrn)
    {
        registeredMRNs.add(mrn);
        return registeredMRNs;
    }
}
