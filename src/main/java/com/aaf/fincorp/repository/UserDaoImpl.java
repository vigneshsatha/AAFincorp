/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.repository;

import com.aaf.fincorp.model.UserVO;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author VIC
 */
@Repository("authRepository")
public class UserDaoImpl  implements UserAuthenticateRepo {
    
   
    SessionFactory sessionFactory;
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public UserVO authenticateUser(UserVO userVO){

        
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            String query = "FROM UserVO WHERE userName= :usrname"; 
            Query authQuery = session.createQuery(query);
            authQuery.setParameter("usrname", userVO.getUserName());
            List userVOList = authQuery.list();
            for (Iterator it = userVOList.iterator(); it.hasNext();) {
                UserVO userVO1 = (UserVO) it.next();
                userVO.setPwdEncyrpt(userVO1.getPwdEncyrpt());
                userVO.setPwdKey(userVO1.getPwdKey());
            }
        if(!session.getTransaction().wasCommitted()){
        session.getTransaction().commit();
        }
        return userVO;
    }
}
