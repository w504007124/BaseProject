package com.lawliet.project.service.impl;

import com.lawliet.project.mapper.UserMapper;
import com.lawliet.project.pojo.User;
import com.lawliet.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @date 2021/11/25 21:14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User addUser(User user) {

        return null;
    }

    @Override
    public User selectUser() {
        return userMapper.selectUser();
    }
}
