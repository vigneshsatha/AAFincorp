/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.service.accounts;

import com.aaf.fincorp.model.AccountVO;
import java.util.List;

/**
 *
 * @author VIC
 */
public interface AccountService {
    
    public AccountVO save(AccountVO accountVO);
    public AccountVO find(AccountVO accountVO);
    public List<AccountVO> findAll();
    public AccountVO update(AccountVO accountVO);
    public boolean delete(AccountVO accountVO);
    
}
