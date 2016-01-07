/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.service;

import com.aaf.fincorp.model.UserVO;
import com.aaf.fincorp.repository.UserAuthenticateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
   
   public UserVO authenticateUser(UserVO userVO){
           return authRepository.authenticateUser(userVO);
   }
}
    