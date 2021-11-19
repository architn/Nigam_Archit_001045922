/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class MenuItemsDirectory {
        ArrayList<MenuItems> menu;
    
    
     public MenuItemsDirectory(){
        this.menu = new ArrayList<MenuItems>();
        
    }

    public ArrayList<MenuItems> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItems> menu) {
        this.menu = menu;
    }
    
    public MenuItems updateMenuItem(int indexOfSelectedRecord, MenuItems selectedMenuItem)
     {
         menu.set(indexOfSelectedRecord, selectedMenuItem);
         return selectedMenuItem;
     }
     
     public void deleteMenuItem(int indexOfSelectedRecord)
     {
         menu.remove(indexOfSelectedRecord);
     }
}
