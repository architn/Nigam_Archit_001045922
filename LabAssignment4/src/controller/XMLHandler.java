/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
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
public class XMLHandler {
    AppConstants AppConstants = new AppConstants();
    PatientRecords patientRecords = new PatientRecords();
    BMICalculator bmiCalculator = new BMICalculator();
    ValidationLogic validationLogic;
    BloodPressureCalculator bloodPressureCalculator = new BloodPressureCalculator();
    CholesterolCalculator cholesterolCalculator = new CholesterolCalculator();
    JFrame frame;
    PatientInfo patientInfo;
    
    public void AutoPopulatePatientXMLRecords()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File patientRecordXMLFile = new File(projectPath + AppConstants.EncountersXMLFilePath);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(patientRecordXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("encounter");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;

                   String mrn = (eElement.getAttribute(AppConstants.nodeMRN));
                   String ethinicity = eElement.getElementsByTagName(AppConstants.nodeEthinicity)
                                        .item(0).getTextContent();
                   
                   String gender = eElement.getElementsByTagName(AppConstants.nodeGender)
                                        .item(0).getTextContent();
                   
                   int age = Integer.parseInt(eElement.getElementsByTagName(AppConstants.nodeAge)
                                        .item(0).getTextContent());
 
                   String district = eElement.getElementsByTagName(AppConstants.nodeDistrict)
                                        .item(0).getTextContent();
                   double weight = Double.parseDouble(eElement.getElementsByTagName(AppConstants.nodeWeight)
                                        .item(0).getTextContent());
                    double height = Double.parseDouble(eElement.getElementsByTagName(AppConstants.nodeHeight)
                                        .item(0).getTextContent());
                    double cholestrolReading = Double.parseDouble(eElement.getElementsByTagName(AppConstants.nodeCholestrolReading)
                                        .item(0).getTextContent());
                    double systoleReading = Double.parseDouble(eElement.getElementsByTagName(AppConstants.nodeSystoleReading)
                                        .item(0).getTextContent()); 
                    double diastoleReading = Double.parseDouble(eElement.getElementsByTagName(AppConstants.nodeDiastoleReading)
                                        .item(0).getTextContent());
                    double BMIValue = (bmiCalculator.CalculateBMI(weight, height));
                   
                    patientInfo = patientRecords.addPatientRecord();
                    
                    
                    int BMICriticality = bmiCalculator.DetermineBMICriticalityOfPatient(weight, height);
                    int CholesterolCriticality = cholesterolCalculator.DetermineCholesterolDangerLevelCriticalityOfPatient(cholestrolReading);
                    int BPCriticality = bloodPressureCalculator.DetermineBloodPressureCriticalityOfPatient(systoleReading, diastoleReading);
                    
                    patientInfo.setMedicalRecordNumber(mrn);
                    patientInfo.setEthinicity(ethinicity);
                    patientInfo.setGender(gender);
                    patientInfo.setAge(age);
                    patientInfo.setDistrict(district);
                    patientInfo.setWeightInPounds(weight);
                    patientInfo.setHeightInInches(height);
                    patientInfo.setCholestrolReadingInmgDl(cholestrolReading);
                    patientInfo.setSystoleReadingInmmHg(systoleReading);
                    patientInfo.setDiastoleReadingInmmHg(diastoleReading);
                    patientInfo.setBMI(BMIValue);
                    patientInfo.setBMIDangerLevel(BMICriticality);
                    patientInfo.setCholestrolDangerLevel(CholesterolCriticality);
                    patientInfo.setBloodPressureDangerLevel(BPCriticality);
                }
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public Date ReturnDateOfBirthForPatient(String mrn) throws Exception
    {
        // Fetching Resident ID from RegisteredPatients.xml
         String projectPath = System.getProperty("user.dir");
         String residentID = "";
         String dateOfBirthInString = "";
         try{
             File registeredPatientsXMLFile = new File(projectPath + AppConstants.PathOfRegisteredPatientXMLFile);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(registeredPatientsXMLFile);
                doc.getDocumentElement().normalize();
                
                NodeList nList = doc.getElementsByTagName("patient");
                for (int temp = 0; temp < nList.getLength(); temp++) 
                {
                    Node nNode = nList.item(temp);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                    {
                        Element eElement = (Element) nNode;
                        String mrnInXML = (eElement.getAttribute(AppConstants.nodeMRN));
                        if(mrnInXML.equals(mrn))
                        {
                            residentID = eElement.getElementsByTagName(AppConstants.nodeResidentID)
                                        .item(0).getTextContent();
                        }
                    }
                
                }
         }
         catch(Exception e)
        {
            e.printStackTrace();
        }
         
         // Fetching Date of Birth from ResidentRecords.xml
         
         try{
             File residentsXMLFile = new File(projectPath + AppConstants.ResidentXMLFilePath);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(residentsXMLFile);
                doc.getDocumentElement().normalize();
                
                NodeList nList = doc.getElementsByTagName("resident");
                for (int temp = 0; temp < nList.getLength(); temp++) 
                {
                    Node nNode = nList.item(temp);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                    {
                        Element eElement = (Element) nNode;
                        String residentIDInXML = (eElement.getAttribute(AppConstants.nodeID));
                        if(residentIDInXML.equals(residentID))
                        {
                            dateOfBirthInString = eElement.getElementsByTagName(AppConstants.nodeDateofBirth)
                                        .item(0).getTextContent();
                        }
                    }
                
                }
         }
         catch(Exception e)
        {
            e.printStackTrace();
        }
         Date dateOfBirth =new SimpleDateFormat("MM/dd/yyyy").parse(dateOfBirthInString); 
         return dateOfBirth;
    }
    
}
