package com.boy.service.imp;

import com.boy.dao.UserDAO;

import com.boy.service.UserService;

/**
 * Demo class
 * @author 21141
 * @date 2022/3/20
 * Servlet Service
 * 稳定和健壮
 */
public class UserServiceImpl implements UserService {

   /**
    *  满足依赖关系 强耦合
    *  private final UserDAO userDao = new MyUserDAOImpl();
    */
   private UserDAO userDAO;
    @Override
    public int deleteUser(int id) {
        System.out.println("delete Service in DAO");
        userDAO.deleteUser(1);
        return 0;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
