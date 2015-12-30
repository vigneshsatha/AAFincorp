/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.service.vehicle;

import com.aaf.fincorp.model.VehicleVO;
import java.util.List;

/**
 *
 * @author VIC
 */
public interface VehicleService {
     
    public VehicleVO save(VehicleVO vehicleVO);
    public VehicleVO find(VehicleVO vehicleVO);
    public List<VehicleVO> findAll();
    public VehicleVO update(VehicleVO vehicleVO);
    public boolean delete(VehicleVO vehicleVO);
    
}
