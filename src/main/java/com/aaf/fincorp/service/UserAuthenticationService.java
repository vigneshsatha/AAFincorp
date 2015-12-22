/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.service;

import com.aaf.fincorp.model.UserVO;
import org.springframework.stereotype.Component;

/**
 *
 * @author VIC
 */
@Component
public interface UserAuthenticationService {
     public boolean authenticateUser(UserVO userVO);
}
