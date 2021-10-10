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
public class CarRecords {
    private ArrayList<CarProfile> carRecords;
    
    public CarRecords()
    {
        this.carRecords = new ArrayList<CarProfile>();
    }

    public ArrayList<CarProfile> getCarRecords() {
        return carRecords;
    }

    public void setCarRecords(ArrayList<CarProfile> carRecords) {
        this.carRecords = carRecords;
    }  
    
    public CarProfile addNewCarRecord()
    {
        CarProfile newCarProfile = new CarProfile();
        carRecords.add(newCarProfile);
        return newCarProfile;
    }
    
    public CarProfile updateCarRecord(int indexOfSelectedRecord, CarProfile selectedCarRecord)
    {
        carRecords.set(indexOfSelectedRecord, selectedCarRecord);
        return selectedCarRecord;
    }
    
    public CarProfile returnCarRecords(int index)
    {
        return carRecords.get(index);
    }
    
    public int GenerateCarID()
    {
        int numberOfRecords = getCarRecords().size() - 1;
        numberOfRecords += 1;
        return numberOfRecords;
    }
    
    public void deleteCarProfile(CarProfile selectedCarProfile)
    {
        carRecords.remove(selectedCarProfile);
    }
}
