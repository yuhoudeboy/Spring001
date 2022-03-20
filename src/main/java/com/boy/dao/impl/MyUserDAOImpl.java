package com.boy.dao.impl;

import com.boy.dao.UserDAO;

/**
 * @author 21141
 */
public class MyUserDAOImpl implements UserDAO {
    @Override
    public int deleteUser(int id) {
        System.out.println("MyUserDAOImpl");
        return 0;
    }
}
