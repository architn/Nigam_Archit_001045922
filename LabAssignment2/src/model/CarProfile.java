/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
/**
 *
 * @author architnigam
 */
public class CarProfile {
    private int carID;
    private String driverName;
    private String availabilityStatus;
    private String carBrand;
    private int carManufactureYear;
    private int maximumSeatingCapacity;
    private String carSerialNumber;
    private String carModelNumber;
    private String carLocatedInCity;
    private Date carExpirationDate;
    private boolean isCarAvailableOrNot;
    private Date createUpdateTimeStamp;
    private String pathOfXMLFile;
    private String modeOfAddition;
    private int brandOfCarCount;

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCarManufactureYear() {
        return carManufactureYear;
    }

    public void setCarManufactureYear(int carManufactureYear) {
        this.carManufactureYear = carManufactureYear;
    }

    public int getMaximumSeatingCapacity() {
        return maximumSeatingCapacity;
    }

    public void setMaximumSeatingCapacity(int maximumSeatingCapacity) {
        this.maximumSeatingCapacity = maximumSeatingCapacity;
    }

    public String getCarSerialNumber() {
        return carSerialNumber;
    }

    public void setCarSerialNumber(String carSerialNumber) {
        this.carSerialNumber = carSerialNumber;
    }

    public String getCarModelNumber() {
        return carModelNumber;
    }

    public void setCarModelNumber(String carModelNumber) {
        this.carModelNumber = carModelNumber;
    }

    public String getCarLoctatedInCity() {
        return carLocatedInCity;
    }

    public void setCarLocatedInCity(String carLocatedInCity) {
        this.carLocatedInCity = carLocatedInCity;
    }

    public Date getCarExpirationDate() {
        return carExpirationDate;
    }

    public void setCarExpirationDate(Date carExpirationDate) {
        this.carExpirationDate = carExpirationDate;
    }

    public boolean getIsCarAvailableOrNot() {
        return isCarAvailableOrNot;
    }

    public void setIsCarAvailableOrNot(boolean isCarAvailableOrNot) {
        this.isCarAvailableOrNot = isCarAvailableOrNot;
    }

    public Date getCreateUpdateTimeStamp() {
        return createUpdateTimeStamp;
    }

    public void setCreateUpdateTimeStamp(Date createUpdateTimeStamp) {
        this.createUpdateTimeStamp = createUpdateTimeStamp;
    }

    public String getPathOfXMLFile() {
        return pathOfXMLFile;
    }

    public void setPathOfXMLFile(String pathOfXMLFile) {
        this.pathOfXMLFile = pathOfXMLFile;
    }

    public String getModeOfAddition() {
        return modeOfAddition;
    }

    public void setModeOfAddition(String modeOfAddition) {
        this.modeOfAddition = modeOfAddition;
    }

    public int getBrandOfCarCount() {
        return brandOfCarCount;
    }

    public void setBrandOfCarCount(int brandOfCarCount) {
        this.brandOfCarCount = brandOfCarCount;
    }
}
