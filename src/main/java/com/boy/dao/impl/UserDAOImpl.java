package com.boy.dao.impl;

import com.boy.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

    @Override
    public int deleteUser(int id) {
        System.out.println("delete User in DAO");
        return 0;
    }
}
