package com.crorylove.web.service.impl;

import com.crorylove.web.dao.UserDao;
import com.crorylove.web.dao.impl.UserDaoImpl;
import com.crorylove.web.domain.User;
import com.crorylove.web.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }
}
