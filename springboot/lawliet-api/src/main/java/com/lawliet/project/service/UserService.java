package com.lawliet.project.service;

import com.lawliet.project.pojo.User;

/**
 * @ClassName UserService
 * @Description TODO
 * @date 2021/11/25 21:14
 */
public interface UserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    User addUser(User user);

    /**
     * 查询User
     */
    User selectUser();

}
