/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Menu.MenuItems;
import Business.Restaurant.Restaurant;
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
    DeliveryMan deliveryMan;
    String customerUsername;
    Date orderTime;
    double orderAmount;
    boolean isOrderDelivered;
    Restaurant restaurant;
    
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

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
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

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }
    
    
    public int generateOrderID()
    {
        int upperbound = 1000;
        int generatedID = rand.nextInt(upperbound);
        return generatedID;
    }

    public boolean isIsOrderDelivered() {
        return isOrderDelivered;
    }

    public void setIsOrderDelivered(boolean isOrderDelivered) {
        this.isOrderDelivered = isOrderDelivered;
    }
    
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
