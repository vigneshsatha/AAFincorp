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
    public boolean authenticateUser(UserVO userVO){

        
            Session session = sessionFactory.openSession();
            String query = "FROM UserVO WHERE userName= :usrname"; 
            Query authQuery = session.createQuery(query);
            authQuery.setParameter("usrname", userVO.getUserName());
            List userVOList = authQuery.list();
            for (Iterator it = userVOList.iterator(); it.hasNext();) {
                UserVO userVO1 = (UserVO) it.next();
                if(userVO1.getUserName().equals(userVO.getUserName())&&userVO1.getUserPassword().equals(userVO.getUserPassword())){
                    return true;
                }
            }
        session.getTransaction().commit();
        return false;
    }
}
