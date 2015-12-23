/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.model;

/**
 *
 * @author VIC
 */
public class VehicleVO {
    private Long vehicleId;
    private String regNo;
    private String make;
    private String model;
    private String color;
    private String insRenewalDate;
    private Double marketValue;
    private String chassisNo;
    private String createdDate;
    private String modifiedDate;

    public VehicleVO() {
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInsRenewalDate() {
        return insRenewalDate;
    }

    public void setInsRenewalDate(String insRenewalDate) {
        this.insRenewalDate = insRenewalDate;
    }

    public Double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
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
    
}
