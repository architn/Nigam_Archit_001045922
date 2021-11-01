/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author architnigam
 */
public class Residence {
    private int residenceID;
    private int residenceName;
    private int numberOfMembers;
    Community communityName;

    public int getResidenceID() {
        return residenceID;
    }

    public void setResidenceID(int residenceID) {
        this.residenceID = residenceID;
    }

    public int getResidenceName() {
        return residenceName;
    }

    public void setResidenceName(int residenceName) {
        this.residenceName = residenceName;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }
    
    
    
}
