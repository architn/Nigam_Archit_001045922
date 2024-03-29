/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.MenuItems;
import Business.Menu.MenuItemsDirectory;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    ArrayList<Restaurant> restaurantList;
    ArrayList<MenuItems> menuItems;
    
    public RestaurantDirectory(){
          restaurantList = new ArrayList<Restaurant>();
          menuItems = new ArrayList<MenuItems>();
        }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Restaurant createRestaurant(String name, String address, String type, String manager, String username){
        
        Restaurant res = new Restaurant();
        res.setName(name);
        res.setAddress(address);
        res.setType(type);
        res.setManager(manager);
        res.setUsername(username);
        res.setMenuItems(menuItems);
        restaurantList.add(res);
        return res;
    
    }
     public Restaurant findRestaurant(String name){
        
         
         for(Restaurant res : restaurantList){
             if(res.getName().equalsIgnoreCase(name)){
                 return res;
             }
         }
         return null;
     }
    
     public Restaurant updateRestaurantRecord(int indexOfSelectedRecord, Restaurant selectedRestaurant)
     {
         restaurantList.set(indexOfSelectedRecord, selectedRestaurant);
         return selectedRestaurant;
     }
     
     public void deleteRestaurantRecord(int indexOfSelectedRecord)
     {
         restaurantList.remove(indexOfSelectedRecord);
     }
    
}