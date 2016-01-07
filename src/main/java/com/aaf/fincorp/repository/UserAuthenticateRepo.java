/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.repository;

import com.aaf.fincorp.model.UserVO;
import org.springframework.stereotype.Component;

/**
 *
 * @author VIC
 */
@Component
public interface UserAuthenticateRepo {
    public UserVO authenticateUser(UserVO userVO);
}
