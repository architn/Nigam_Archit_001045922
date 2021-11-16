/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author architnigam
 */
public class MenuItems {
    private int MenuItemID;
    private String MenuItemName;
    private double MenuItemCost;
    private boolean MenuItemAvailability;

    public int getMenuItemID() {
        return MenuItemID;
    }

    public void setMenuItemID(int MenuItemID) {
        this.MenuItemID = MenuItemID;
    }

    public String getMenuItemName() {
        return MenuItemName;
    }

    public void setMenuItemName(String MenuItemName) {
        this.MenuItemName = MenuItemName;
    }

    public double getMenuItemCost() {
        return MenuItemCost;
    }

    public void setMenuItemCost(double MenuItemCost) {
        this.MenuItemCost = MenuItemCost;
    }

    public boolean isMenuItemAvailability() {
        return MenuItemAvailability;
    }

    public void setMenuItemAvailability(boolean MenuItemAvailability) {
        this.MenuItemAvailability = MenuItemAvailability;
    }
}
