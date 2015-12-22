/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.repository;

import com.aaf.fincorp.model.UserVO;
import java.beans.Transient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author VIC
 */
@Component
public interface UserAuthenticateRepo {
    public boolean authenticateUser(UserVO userVO);
}
