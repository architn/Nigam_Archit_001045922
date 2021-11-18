package Business;

import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount uam = system.getUserAccountDirectory().createUserAccount("sysman", "sysman", employee, new AdminRole());
        UserAccount uac = system.getUserAccountDirectory().createUserAccount("syscus", "syscus", employee, new CustomerRole());
        UserAccount uad = system.getUserAccountDirectory().createUserAccount("sysdel", "sysdel", employee, new DeliverManRole());
        //Restaurant restaurant = system.getRestaurantDirectory().createRestaurant("test", "sysres", "Non veg", "Manager");

        
        
        return system;
    }
    
}