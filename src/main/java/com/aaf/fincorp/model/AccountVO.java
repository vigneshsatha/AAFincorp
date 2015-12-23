/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.model;

/**
 *
 * @author VIC
 */
public class AccountVO {
    private Long accountId;
    private Long vehicleId;
    private Long clientId;
    private String accountNo;
    private String vehiclePurchaseDate;
    private Double loanAmount;
    private Double documentCharge;
    private int noOfDues;
    private Float rateOfInterest;
    private Double primaryAmount;
    private Double interestAmount;
    private Double duePerMonth;

    public AccountVO() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getVehiclePurchaseDate() {
        return vehiclePurchaseDate;
    }

    public void setVehiclePurchaseDate(String vehiclePurchaseDate) {
        this.vehiclePurchaseDate = vehiclePurchaseDate;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getDocumentCharge() {
        return documentCharge;
    }

    public void setDocumentCharge(Double documentCharge) {
        this.documentCharge = documentCharge;
    }

    public int getNoOfDues() {
        return noOfDues;
    }

    public void setNoOfDues(int noOfDues) {
        this.noOfDues = noOfDues;
    }

    public Float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(Float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public Double getPrimaryAmount() {
        return primaryAmount;
    }

    public void setPrimaryAmount(Double primaryAmount) {
        this.primaryAmount = primaryAmount;
    }

    public Double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public Double getDuePerMonth() {
        return duePerMonth;
    }

    public void setDuePerMonth(Double duePerMonth) {
        this.duePerMonth = duePerMonth;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getActualDueDate() {
        return actualDueDate;
    }

    public void setActualDueDate(String actualDueDate) {
        this.actualDueDate = actualDueDate;
    }

    public String getInterestReceivedDate() {
        return interestReceivedDate;
    }

    public void setInterestReceivedDate(String interestReceivedDate) {
        this.interestReceivedDate = interestReceivedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNoOfDuesPaid() {
        return noOfDuesPaid;
    }

    public void setNoOfDuesPaid(int noOfDuesPaid) {
        this.noOfDuesPaid = noOfDuesPaid;
    }

    public String getDueCloseDate() {
        return dueCloseDate;
    }

    public void setDueCloseDate(String dueCloseDate) {
        this.dueCloseDate = dueCloseDate;
    }

    public String getAccountCloseDate() {
        return accountCloseDate;
    }

    public void setAccountCloseDate(String accountCloseDate) {
        this.accountCloseDate = accountCloseDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    private String loanDate;
    private String actualDueDate;
    private String interestReceivedDate;
    private String status;
    private int noOfDuesPaid;
    private String dueCloseDate;
    private String accountCloseDate;
    private String createdDate;
    private String modifiedDate;
    
    
}
