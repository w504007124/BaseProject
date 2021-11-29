package com.lawliet.project.controller;

import com.lawliet.project.aop.SysLogs;
import com.lawliet.project.pojo.User;
import com.lawliet.project.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @date 2021/11/25 21:13
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/select")
    @ApiOperation(value = "查看用户表")
    @SysLogs("查看用户表")
    public User selectUser() {
        return userService.selectUser();
    }
}
