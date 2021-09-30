package com.crorylove.dao.Impl;

import com.crorylove.dao.UserDao;
import com.crorylove.domain.User;
import com.crorylove.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoimpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDateSource());
    @Override
    public List<User> findAll() {
        String sql ="select * from user ";
        List<User> users= template.query(sql,new BeanPropertyRowMapper<User>(User.class));

        return users;
    }
}
