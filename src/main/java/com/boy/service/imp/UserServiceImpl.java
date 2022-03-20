package com.boy.service.imp;

import com.boy.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public int deleteUser(int id) {
        System.out.println("delete Service in DAO");
        return 0;
    }
}
