/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.model;

import java.io.Serializable;
/**
 *
 * @author VIC
 */
public class UserVO implements Serializable {

    private String firstName;
    private String lastName;
    private String userName;
    private String userPassword;
    private int id;
    
    public UserVO() {
    }

    public UserVO(String firstName, String lastName, String userName, String userPassword, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
