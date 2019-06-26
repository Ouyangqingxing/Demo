package com.service.impl;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(long id) {
        User user = null;
        try {
            user = userMapper.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}