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
    MenuItemsDirectory menuItems = new MenuItemsDirectory();
    
    public RestaurantDirectory(){
          restaurantList = new ArrayList<Restaurant>();
        }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Restaurant createRestaurant(String name, String address, String type, String manager){
        
        Restaurant res = new Restaurant();
        res.setName(name);
        res.setAddress(address);
        res.setType(type);
        res.setManager(manager);
        res.setMenuDirectory(menuItems);
        restaurantList.add(res);
        return res;
    
    }
     public Restaurant findRestaurant(String name){
        
         
         for(Restaurant res : restaurantList){
             if(res.getName().equals(name)){
                 return res;
             }
         }
         return null;
     }
    
    
}