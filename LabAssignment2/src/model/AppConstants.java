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
public class AppConstants {
    // Regular Expressions
    public String RegularExpressionForNumericFields = "[0-9]+";
    
    // Internal XML file Path
    public String XMLFilePath = "/src/files/CarRecords.xml";
    
    // MESSAGE BOX ALERTS
    public String ErrorMessageForMaximumSeatingCapacity = "Maximum Seating Capacity should be a number!";
    public String ErrorMessageForVehicleNumberNotBeingUnique = "A car with this vehicle number already exists!";
    public String SuccessMessageForCarAddition = "New Car information record added successfully!";
    public String SuccessMessageForXMLupload = "XML File successfully uploaded!";
    public String ErrorMessageForXMLupload = "No file found!"; 
    public String ErrorMessageForNoRowSelected = "No row selected! Please select a row to proceed";
    public String SuccessfulCarDeletionMessage = "Selected Record has been successfully deleted!";
    public String UnsuccessfulCarDeletionMessage = "Selected Record cannot be deleted! A booked car not be deleted";
    public String UnsuccessfulCarUpdationMessage = "Selected Record cannot be updated! A booked car not be updated";
    public String SuccessfulCarUpdatedMessage = "Selected Record has been successfully updated!";
    public String SuccessfulBookingMessage = "Selected car has been successfully been booked!";
    public String UnsuccessfulBookingMessage = "Selected car cannot be booked! Please select another car";
    public String ErrorMessageForMaxSeatingValue = "Maximum seating capacity cannot be 0!";
    public String NoRecordsFound = "No records found with this filter criteria";
    
    // Car Availability Status
    public String CarIsAvailableForRide = "Available for Ride";
    public String CarIsUnavailableForRide = "Unavailable for Ride";
    public String CarIsBookedForRide = "Booked";
    
    // Mode of Addition
    public String modeOfAdditionUI = "UI";
    public String modeOfAdditionXML = "XML";
    
    
    // XML Nodes
    public String nodeCar = "car";
    public String nodeID = "id";
    public String nodeDriverName = "drivername";
    public String nodeCarBrand = "carbrand";
    public String nodeManufactureYear = "manufactureyear";
    public String nodeMaxSeatingCapacity = "maxseatingcapacity";
    public String nodeVehicleNumber = "vehiclenumber";
    public String nodeModelNumber = "modelnumber";
    public String nodeCity = "city";
    public String nodeLicenseExpiryDate = "licenseexpirydate";
}
