/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.model;

/**
 *
 * @author VIC
 */
public class ClientVO {

    private Long clientId;
    private String clientFirstName;
    private String clientLastName;
    private String dob;
    private int age;
    private String mobileNo;
    private String proofType;
    private String proofId;
    private String guranteePersonName;
    private String guranteePersonProofId;
    private String address;

    public ClientVO(Long clientId,String clientFirstName, String clientLastName, String dob, int age, String mobileNo, String proofType, String proofId, String guranteePersonName, String guranteePersonProofId, String address) {
        this.clientId = clientId;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.dob = dob;
        this.age = age;
        this.mobileNo = mobileNo;
        this.proofType = proofType;
        this.proofId = proofId;
        this.guranteePersonName = guranteePersonName;
        this.guranteePersonProofId = guranteePersonProofId;
        this.address = address;
    }

    
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
    public ClientVO() {
    }
    
    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public String getProofId() {
        return proofId;
    }

    public void setProofId(String proofId) {
        this.proofId = proofId;
    }

    public String getGuranteePersonName() {
        return guranteePersonName;
    }

    public void setGuranteePersonName(String guranteePersonName) {
        this.guranteePersonName = guranteePersonName;
    }

    public String getGuranteePersonProofId() {
        return guranteePersonProofId;
    }

    public void setGuranteePersonProofId(String guranteePersonProofId) {
        this.guranteePersonProofId = guranteePersonProofId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
