package com.crorylove.service.impl;

import com.crorylove.dao.Impl.UserDaoimpl;
import com.crorylove.dao.UserDao;
import com.crorylove.domain.User;
import com.crorylove.service.Userservice;

import java.util.List;

public class UserserviceImpl implements Userservice {
    private UserDao dao = new UserDaoimpl();
    @Override
    public List<User> findAll() {
//        调用dao完成查询
        return dao.findAll();
    }
}
