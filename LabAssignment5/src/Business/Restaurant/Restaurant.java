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
public class Restaurant {
 
    String name;
    String address;
    String type;
    String manager;
    String username;
    ArrayList<MenuItems> menuItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }
    
    public MenuItems addMenuItemToARestaurant(String menuItemName, double cost, boolean availability, String restaurant)
    {
        MenuItems menuItem = new MenuItems();
        menuItem.setItemName(menuItemName);
        menuItem.setItemPrice(cost);
        menuItem.setAvailability(availability);
        menuItem.setRestaurant(restaurant);
        menuItems.add(menuItem);
        return menuItem;
    }
    
    public MenuItems updateMenuItems(int indexOfSelectedRecord, MenuItems selectedMenuItem)
    {
        menuItems.set(indexOfSelectedRecord, selectedMenuItem);
        return selectedMenuItem;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }  
}