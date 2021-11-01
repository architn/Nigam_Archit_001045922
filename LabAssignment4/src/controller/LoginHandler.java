/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import model.AppConstants;
import model.UserProfile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import view.HomePage;

/**
 *
 * @author architnigam
 */
public class LoginHandler {
    AppConstants AppConstants = new AppConstants();
    JFrame frame;
    UserProfile userProfile = new UserProfile();
    
    public boolean VerifyLoginCredentials(JTextField txtUsername, JPasswordField txtPassword)
    {
        boolean loginSuccessful = false;
        String projectPath = System.getProperty("user.dir");
        String inputUsername = txtUsername.getText();
        String inputPassword = txtPassword.getText();
        int loginAttemptCounter = 0;
        ArrayList<UserProfile> loggedInUser = new ArrayList<UserProfile>();
        String pathOfRegisteredUsers = projectPath + AppConstants.PathOfRegisteredUsersXMLFile;
        try{
                File registeredUsersXMLFile = new File(pathOfRegisteredUsers);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(registeredUsersXMLFile);
                doc.getDocumentElement().normalize();
                String accessLevel = "";
                
                NodeList nList = doc.getElementsByTagName("user");
                
                 for (int temp = 0; temp < nList.getLength(); temp++) 
                 {
                     Node nNode = nList.item(temp);
                     if (nNode.getNodeType() == Node.ELEMENT_NODE)
                     {
                         Element eElement = (Element) nNode;
                         String registeredUserName = eElement.getElementsByTagName("username")
                                        .item(0).getTextContent();
                        String registeredPassword = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();
                        accessLevel = eElement.getElementsByTagName("accessLevel")
                                        .item(0).getTextContent();
                        if(registeredUserName.equals(inputUsername) 
                                && registeredPassword.equals(inputPassword))
                        { 
                            loginAttemptCounter++;
                            userProfile.setAccessLevel(Integer.parseInt(accessLevel));
                            loggedInUser.add(userProfile);
                        }
                     }
                 }
                 if(loginAttemptCounter!=0)
                 {
                     
                     JOptionPane.showMessageDialog(frame, "Login Successful!");
                     HomePage homePage = new HomePage(userProfile);
                     //HomeScreen homePage = new HomeScreen(userProfile);
                     homePage.setVisible(true);
                     loginSuccessful = true;
                     return loginSuccessful;
                 }
                 else{
                     JOptionPane.showMessageDialog(frame, "Wrong username or password");
                 } 
                 
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return loginSuccessful;
        
    }
    
}
