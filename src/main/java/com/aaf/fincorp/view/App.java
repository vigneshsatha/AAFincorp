package com.aaf.fincorp.view;

import java.awt.Toolkit;
import java.net.MalformedURLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        JFrame loginWindow = (JFrame) ctx.getBean("login");
        ImageIcon icon = new ImageIcon("icon.png");
        loginWindow.setIconImage(Toolkit.getDefaultToolkit().createImage("icon.png"));
        loginWindow.setVisible(true);
//        Session sessionObj = HibernateUtil.getSessionFactory().openSession();
//        sessionObj.beginTransaction();
//        UserVO userVO = new UserVO();
//        userVO.setUserName("vicky");
//        userVO.setFirstName("Vignesh");
//        userVO.setLastName("sathasivam");
//        userVO.setUserPassword("12345");
//        userVO.setId(1);
//        
//        sessionObj.save(userVO);
//        sessionObj.getTransaction().commit();
//    
    }
}
