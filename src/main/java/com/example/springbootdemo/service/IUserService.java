package com.example.springbootdemo.service;

import com.example.springbootdemo.polo.User;
import com.example.springbootdemo.polo.dto.UserDto;

public interface IUserService {
    /**
     * 插入用户
     *
     * @param user
     * @return
     */
    User add(UserDto user);

    /**
     * 根据id查询用户
     *
     * @param userId
     * @return
     */
    User getUser(Integer userId);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    User edit(UserDto user);

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    void delete(Integer userId);
}
