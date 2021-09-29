package com.crorylove.service;

import com.crorylove.domain.User;

import java.util.List;

/*
* 用户管理的业务接口*/
public interface Userservice {
    /*
    * 查询所用用户信息*/
    public List<User> findAll();
}
