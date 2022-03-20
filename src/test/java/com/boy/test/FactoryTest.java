package com.boy.test;

import com.boy.dao.UserDAO;
import com.boy.factory.MyFactory;
import com.boy.service.UserService;

import java.io.IOException;

public class FactoryTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 创建工厂对象
        MyFactory myFactory = new MyFactory("/bean.properties");
        // 从工厂中获取对象
        UserDAO userDAO = (UserDAO)myFactory.getBean("userDao");
        UserService userService = (UserService) myFactory.getBean("usrService");
        userDAO.deleteUser(1);
        userService.deleteUser(1);
    }
}
