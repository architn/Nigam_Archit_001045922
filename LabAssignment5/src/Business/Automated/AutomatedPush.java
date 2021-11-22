/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Automated;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.io.File;
import javax.swing.JPanel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author architnigam
 */
public class AutomatedPush {
    private JPanel userProcessContainer;
    Organization organization;
    private UserAccount userAccount;
    EcoSystem system;
    
    private Restaurant restaurant;
    
    public AutomatedPush(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system)
    {
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
    }

    public boolean pushRestaurantData() {
        String projectPath = System.getProperty("user.dir");

        try
             {
                File restaurantXMLFile = new File(projectPath + "/src/Business/Automated/Restaurants.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(restaurantXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("restaurant");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;

                   String restaurantName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   String restaurantAddress = eElement.getElementsByTagName("address")
                                        .item(0).getTextContent();
                   String type = eElement.getElementsByTagName("type")
                                        .item(0).getTextContent();
                    String manager = eElement.getElementsByTagName("manager")
                                        .item(0).getTextContent();                            
 
                   String username = eElement.getElementsByTagName("username")
                                        .item(0).getTextContent();
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();

                    restaurant = system.getRestaurantDirectory().createRestaurant(restaurantName, restaurantAddress, type, manager, username );
                    Employee emp = system.getEmployeeDirectory().createEmployee(manager);
                    system.getUserAccountDirectory().createUserAccount(username, password, emp, new AdminRole());
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }

    public boolean pushDeliveryManData() {
        String projectPath = System.getProperty("user.dir");

        try
             {
                File deliveryManXMLFile = new File(projectPath + "/src/Business/Automated/DeliveryMan.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(deliveryManXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("deliveryman");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;

                   String nameOfDeliveryMan = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   String rating =      eElement.getElementsByTagName("rating")
                                        .item(0).getTextContent();
                   String phoneNumber = eElement.getElementsByTagName("phoneNumber")
                                        .item(0).getTextContent();
                   String usernameOfDeliveryMan = eElement.getElementsByTagName("username")
                                        .item(0).getTextContent();
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();

                    Employee emp = system.getEmployeeDirectory().createEmployee(nameOfDeliveryMan);
                    UserAccount account = system.getUserAccountDirectory().createUserAccount(usernameOfDeliveryMan, password, emp, new DeliverManRole());
                    system.getDeliveryManDirectory().createDeliveryMan(nameOfDeliveryMan, usernameOfDeliveryMan, 
                    Integer.parseInt(rating), phoneNumber);
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }

    public boolean pushCustomerData() { 
        String projectPath = System.getProperty("user.dir");

        try
             {
                File customerXMLFile = new File(projectPath + "/src/Business/Automated/Customers.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(customerXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("customer");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;

                   String customername = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   String address = eElement.getElementsByTagName("address")
                                        .item(0).getTextContent();
                   String phoneNumber = eElement.getElementsByTagName("phoneNumber")
                                        .item(0).getTextContent();
                   String customerusername = eElement.getElementsByTagName("username")
                                        .item(0).getTextContent();
                   String customerpassword = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();

                    Employee emp = system.getEmployeeDirectory().createEmployee(customername);
                    system.getUserAccountDirectory().createUserAccount(customerusername, customerpassword, emp, new CustomerRole());
                    Business.Customer.Customer customer = (Business.Customer.Customer) system.getCustomerDirectory().createOrganization(Organization.Type.Customer);
                    customer.setName(customername);
                    customer.setAddress(address);
                    customer.setPhoneNumber(phoneNumber);
                    customer.setUsername(customerusername);
                    Business.Role.CustomerRole customerrole = new CustomerRole();
                    customer.getUserAccountDirectory().createUserAccount(customername, customerpassword, emp, customerrole);
                } 
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
    
    public boolean pushMenuItemData()
    {   boolean isAvailable = false;
        String projectPath = System.getProperty("user.dir");

        try
             {
                File customerXMLFile = new File(projectPath + "/src/Business/Automated/MenuItems.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(customerXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("menu");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                   String restaurantName = (eElement.getAttribute("restaurant"));
                   String dishName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   String dishCost = eElement.getElementsByTagName("price")
                                        .item(0).getTextContent();
                   String availability = eElement.getElementsByTagName("availability")
                                        .item(0).getTextContent();
                   if(availability.equals("true"))
                   {
                       isAvailable = true;
                   }
                   Restaurant searchedRestaurant = system.getRestaurantDirectory().findRestaurant(restaurantName);
                   searchedRestaurant.addMenuItemToARestaurant(dishName, Double.parseDouble(dishCost), isAvailable, restaurantName);                     
                   
                } 
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
    
}
