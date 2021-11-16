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
    private ArrayList<Restaurant> restaurantsRecords;
    private ArrayList<MenuItems> menuItemRecords;
    
    public RestaurantDirectory()
    {
        this.restaurantsRecords = new ArrayList<Restaurant>();
        this.menuItemRecords = new ArrayList<MenuItems>();
    }
    
    public ArrayList<Restaurant> getDeliveryManRecords() {
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
    
    public ArrayList<MenuItems> getMenuItemRecords() {
        return menuItemRecords;
    }
    
    public void setMenuItemRecords(ArrayList<MenuItems> menuItemRecords) {
        this.menuItemRecords = menuItemRecords;
    }  
    
    public MenuItems addMenuItemRecord(){
        MenuItems newMenuItem = new MenuItems();
        menuItemRecords.add(newMenuItem);
        return newMenuItem;
    }
    
    public MenuItems updateMenuItemsRecord(int indexOfSelectedRecord, MenuItems newMenuItemRecord)
    {
        menuItemRecords.set(indexOfSelectedRecord, newMenuItemRecord);
        return newMenuItemRecord;
    }
}
