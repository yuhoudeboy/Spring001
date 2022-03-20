package com.boy.test;

import com.boy.dao.UserDAO;
import com.boy.entity.User;
import com.boy.service.imp.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 21141
 */
public class springFactoryTest {
    @Test
    public void testSpringFactory(){
        /**
         * 启动工厂
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        /**
         * 获取对象
         * UserDAO userDAO = (UserDAO) context.getBean("userDAO");
         */
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        /**
         * userDAO.deleteUser(1);
         */
        userService.deleteUser(1);
    }
    @Test
    public void testSet(){
        /**
         * 气功工厂
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        User user = (User) context.getBean("user");
        System.out.println("===========");
    }
}
