package com.boy.service.imp;

import com.boy.dao.UserDAO;
import com.boy.dao.impl.UserDAOImpl;
import com.boy.service.UserService;

/**
 * Demo class
 * @author 21141
 * @date 2022/3/20
 * // Servlet Service
 */
public class UserServiceImpl implements UserService {
    /**
     *    满足依赖关系 强耦合
     */
    private final UserDAO userDao = new UserDAOImpl();
    @Override
    public int deleteUser(int id) {
        System.out.println("delete Service in DAO");
        userDao.deleteUser(1);
        return 0;
    }
}
