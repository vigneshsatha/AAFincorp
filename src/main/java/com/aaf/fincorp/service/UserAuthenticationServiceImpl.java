/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.service;

import com.aaf.fincorp.model.UserVO;
import com.aaf.fincorp.repository.UserAuthenticateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author VIC
 */
@Service("authenticationService")
public class UserAuthenticationServiceImpl implements UserAuthenticationService{
        
   UserAuthenticateRepo authRepository;
   
   @Autowired
   public void setAuthRepository(UserAuthenticateRepo authRepository) {
       this.authRepository = authRepository;
   }
   
   public boolean authenticateUser(UserVO userVO){
           return authRepository.authenticateUser(userVO);
   }
}
    