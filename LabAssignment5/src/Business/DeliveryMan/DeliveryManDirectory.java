/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> deliveryMan;
     Random rand = new Random();

   public DeliveryManDirectory(){
        deliveryMan = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(ArrayList<DeliveryMan> deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
       public DeliveryMan createDeliveryMan(String name, String username, int rating, String phoneNumber){
       
       DeliveryMan dm = new DeliveryMan();
       dm.setDeliveryManName(name);
       dm.setDeliveryusername(username);
       dm.setRating(rating);
       dm.setStatus("Available");
       dm.setDeliveryPhoneNumber(phoneNumber);
       deliveryMan.add(dm);
       return dm;      
   }
   
   public DeliveryMan findDeliveryMan(String name){
       for(DeliveryMan dm :deliveryMan ){
           
           if(dm.getDeliveryManName().equals(name)){
               return dm;
           }
       }
       return null;
   }
    public void deleteDeliveryMan(DeliveryMan deliveryman){
       deliveryMan.remove(deliveryman);
   }
    
   public DeliveryMan updateDeliveryMan(int indexOfSelectedRecord, DeliveryMan selectedDeliveryMan)
    {
        deliveryMan.set(indexOfSelectedRecord, selectedDeliveryMan);
        return selectedDeliveryMan;
    }
}
