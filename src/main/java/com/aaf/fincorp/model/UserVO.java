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
    private String pwdKey;
    private String pwdEncyrpt;
    
    public UserVO() {
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

    public String getPwdKey() {
        return pwdKey;
    }

    public void setPwdKey(String pwdKey) {
        this.pwdKey = pwdKey;
    }

    public String getPwdEncyrpt() {
        return pwdEncyrpt;
    }

    public void setPwdEncyrpt(String pwdEncyrpt) {
        this.pwdEncyrpt = pwdEncyrpt;
    }

}
