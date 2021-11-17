/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Menu.MenuItems;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class Order {
    private int OrderID;
    private ArrayList<MenuItems> ordersByCustomer;
    DeliveryMan deliveryMan;
    Customer customer;

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public ArrayList<MenuItems> getOrdersByCustomer() {
        return ordersByCustomer;
    }

    public void setOrdersByCustomer(ArrayList<MenuItems> ordersByCustomer) {
        this.ordersByCustomer = ordersByCustomer;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
