package Business;

import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
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
        UserAccount ua_Restaurant = system.getUserAccountDirectory().createUserAccount("resto", "resto", employee, new AdminRole());
        UserAccount ua_Customer = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee, new CustomerRole());
        //Restaurant resto = system.getRestaurantDirectory().createRestaurant("Food Plaza", "8578905431", "Boylston Street");
        return system;
    }
    
}
