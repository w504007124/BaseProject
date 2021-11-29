package com.lawliet.project.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Table;

/**
 * @ClassName User
 * @Description TODO
 * @date 2021/11/25 21:15
 */
@Data
@Table(name = "user")
public class User {

    @JSONField(serializeUsing = ToStringSerializer.class)
    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("登录名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("权限")
    private String permission;

    @ApiModelProperty("角色")
    private String role;
}
