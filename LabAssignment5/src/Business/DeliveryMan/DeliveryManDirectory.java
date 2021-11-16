/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> deliveryManRecords;
    
    public ArrayList<DeliveryMan> getDeliveryManRecords() {
        return deliveryManRecords;
    }
    

    public void setDeliveryManRecords(ArrayList<DeliveryMan> deliveryManRecords) {
        this.deliveryManRecords = deliveryManRecords;
    }  
    
    public DeliveryMan addDeliveryManRecord()
    {
        DeliveryMan newDeliveryManRecord = new DeliveryMan();
        deliveryManRecords.add(newDeliveryManRecord);
        return newDeliveryManRecord;
    }
    
    public DeliveryMan updateDeliveryManRecord(int indexOfSelectedRecord, DeliveryMan newDeliveryManRecord)
    {
        deliveryManRecords.set(indexOfSelectedRecord, newDeliveryManRecord);
        return newDeliveryManRecord;
    }
    
    public DeliveryMan returnDeliveryManRecords(int index)
    {
        return deliveryManRecords.get(index);
    }
    
    
    public void deleteDeliveryManRecord(DeliveryMan selectedDeliveryManRecord)
    {
        deliveryManRecords.remove(selectedDeliveryManRecord);
    }
    
    public int ReturnNumberOfRecords()
    {
        int numberOfRecords = deliveryManRecords.size();
        return numberOfRecords;
    }
}
