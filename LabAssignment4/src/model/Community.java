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
public class Community extends City {
    private String zipCode;
    private String communityName;
    City cityName;

    public String getCommunityID() {
        return zipCode;
    }

    public void setCommunityID(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public void setCityName(City cityName) {
        this.cityName = cityName;
    }
    
}
