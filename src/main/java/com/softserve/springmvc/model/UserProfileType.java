package com.softserve.springmvc.model;

import java.io.Serializable;

/**
 * @author invzbl3 on 07.07.2020.
 * @project SpringApplication
 */

public enum UserProfileType implements Serializable{
    USER("USER"),
    DBA("DBA"),
    ADMIN("ADMIN");

    String userProfileType;

    private UserProfileType(String userProfileType){
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType(){
        return userProfileType;
    }
}