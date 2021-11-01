/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class UserProfile {
    private String username;
    private String password;
    private int accessLevel;
    private boolean hasDataBeenPopulated;
    private ArrayList<UserProfile> userRecords;
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }
    
    public void setPatientRecords(ArrayList<UserProfile> userRecords) {
        this.userRecords = userRecords;
    } 

    public boolean isHasDataBeenPopulated() {
        return hasDataBeenPopulated;
    }

    public void setHasDataBeenPopulated(boolean hasDataBeenPopulated) {
        this.hasDataBeenPopulated = hasDataBeenPopulated;
    }
}
