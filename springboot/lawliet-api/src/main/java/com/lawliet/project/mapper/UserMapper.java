package com.lawliet.project.mapper;

import com.lawliet.project.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @date 2021/11/25 21:14
 */
@Mapper
public interface UserMapper {

    User selectUser();

}
