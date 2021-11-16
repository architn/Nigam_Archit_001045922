/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerRecords;
    
    public ArrayList<Customer> getCustomerRecords() {
        return customerRecords;
    }
    
    public void setCustomerRecords(ArrayList<Customer> customerRecords) {
        this.customerRecords = customerRecords;
    }  
    
    public Customer addCustomerRecord()
    {
        Customer newCustomerRecord = new Customer();
        customerRecords.add(newCustomerRecord);
        return newCustomerRecord;
    }
    
    public Customer updateCustomerRecord(int indexOfSelectedRecord, Customer selectedCustomerRecord)
    {
        customerRecords.set(indexOfSelectedRecord, selectedCustomerRecord);
        return selectedCustomerRecord;
    }
    
    public Customer returnCustomerRecords(int index)
    {
        return customerRecords.get(index);
    }
    
    public void deleteCustomerRecord(Customer selectedCustomerRecord)
    {
        customerRecords.remove(selectedCustomerRecord);
    }
    
    public int ReturnNumberOfRecords()
    {
        int numberOfRecords = customerRecords.size();
        return numberOfRecords;
    }
}
