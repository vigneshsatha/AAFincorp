/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.repository.client;

import com.aaf.fincorp.model.AccountVO;
import com.aaf.fincorp.model.ClientVO;
import java.util.List;

/**
 *
 * @author VIC
 */
public interface ClientDao {
    public ClientVO save(ClientVO clientVO);
    public ClientVO find(ClientVO clientVO);
    public List<ClientVO> findAll();
    public ClientVO update(ClientVO clientVO);
    public boolean delete(ClientVO clientVO);
    
}
