/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class MenuItemsDirectory {
    ArrayList<MenuItems> menuItemRecords;
    
    public MenuItemsDirectory(){
        menuItemRecords = new ArrayList<MenuItems>();
    }
    
    public ArrayList<MenuItems> getMenuItemRecords() {
        return menuItemRecords;
    }
    
    public void setMenuItemRecords(ArrayList<MenuItems> menuItemRecords) {
        this.menuItemRecords = menuItemRecords;
    }  
}
