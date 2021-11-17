/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> restaurantsRecords;
    
    public RestaurantDirectory()
    {
        restaurantsRecords = new ArrayList();
    }
    
    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantsRecords;
    }
    
    public void setRestaurantRecords(ArrayList<Restaurant> restaurantsRecords) {
        this.restaurantsRecords = restaurantsRecords;
    }  
    
    public Restaurant addRestaurantRecord(){
        Restaurant newRestaurantRecord = new Restaurant();
        restaurantsRecords.add(newRestaurantRecord);
        return newRestaurantRecord;
    }
    
    public Restaurant updateRestaurantRecord(int indexOfSelectedRecord, Restaurant newRestaurantRecord)
    {
        restaurantsRecords.set(indexOfSelectedRecord, newRestaurantRecord);
        return newRestaurantRecord;
    }
    
    public Restaurant returnRestaurantRecords(int index)
    {
        return restaurantsRecords.get(index);
    }
    
    public void deleteRestaurantRecord(Restaurant selectedRestaurantRecord)
    {
        restaurantsRecords.remove(selectedRestaurantRecord);
    }
    
    public int ReturnNumberOfRecords()
    {
        int numberOfRecords = restaurantsRecords.size();
        return numberOfRecords;
    }
    
    public Restaurant createRestaurant(String name, String phoneNumber, String address){
        
        Restaurant resto = new Restaurant();
        resto.setRestaurantName(name);
        resto.setRestaurantPhoneNumber(phoneNumber);
        resto.setRestaurantAddress(address);
        return resto;
    }
    
    
    public Restaurant FindRestaurantByName(String restaurantName)
    {
        for(Restaurant resto : restaurantsRecords)
        {
            if(resto.getRestaurantName().equalsIgnoreCase(restaurantName))
            {
                return resto;
            }
        }
        return null;
    }

}
