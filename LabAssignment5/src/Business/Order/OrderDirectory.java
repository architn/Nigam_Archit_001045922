/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.DeliveryMan.DeliveryMan;
import Business.Menu.MenuItems;
import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class OrderDirectory {
    private ArrayList<Order> orderhist;  
    
    public OrderDirectory(){
        orderhist = new ArrayList();
    }

    public ArrayList<Order> getOrderhist() {
        return orderhist;
    }

    public void setOrderhist(ArrayList<Order> orderhist) {
        this.orderhist = orderhist;
    }
    
     public Order createOrder(ArrayList<MenuItems> orderedItems, String username, 
             DeliveryMan assignedDeliveryMan, double totalOrderAmount, Restaurant assignedRestaurant) {
            
            Order od = new Order();
            int orderID = od.generateOrderID();
            od.setOrderID(orderID);
            od.setOrdersByCustomer(orderedItems);
            od.setCustomerUsername(username);
            od.setOrderTime(new Date());
            od.setDeliveryMan(assignedDeliveryMan);
            od.setOrderAmount(totalOrderAmount);
            od.setRestaurant(assignedRestaurant);
            od.setIsOrderDelivered(false);
            orderhist.add(od);
            return od;
    }
    
    public Order updateOrder(int indexOfSelectedRecord, Order selectedOrder)
    {
        orderhist.set(indexOfSelectedRecord, selectedOrder);
        return selectedOrder;
    }
    
    public void deleteOrder(int indexOfSelectedRecord)
    {
        orderhist.remove(indexOfSelectedRecord);
    }
}
