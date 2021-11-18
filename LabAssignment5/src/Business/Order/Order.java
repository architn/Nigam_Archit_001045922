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
import java.util.Date;
import java.util.Random;

/**
 *
 * @author architnigam
 */
public class Order {
    private int OrderID;
    private ArrayList<MenuItems> ordersByCustomer;
    String deliveryMan;
    String customerUsername;
    String orderStatus;
    Date orderTime;
    
    Random rand = new Random();

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

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }
    
    public int generateOrderID()
    {
        int upperbound = 1000;
        int generatedID = rand.nextInt(upperbound);
        return generatedID;
    }
    
}
