package com.crorylove.web.dao;



import com.crorylove.web.domain.User;

import java.util.List;

/**
 * 用户操作的DAO
 */
public interface UserDao {


    public List<User> findAll();
}