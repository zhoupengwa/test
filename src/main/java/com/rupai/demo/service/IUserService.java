package com.rupai.demo.service;

import com.rupai.demo.model.ResponseDTO;
import com.rupai.demo.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhoupeng
 */
public interface IUserService {

    /**
     * 新增用户
     *
     * @param user 用户信息对象
     */
    void addUser(@Param("user") User user);


    /**
     * 根据ID查询用户信息
     *
     * @param userId 用户ID
     * @return 用户
     */
    User selectById(@Param("userId") Long userId);


    /**
     * 删除用户
     *
     * @param userId 用户ID
     * @return
     */
    ResponseDTO deleteUserById(@Param("userId") Long userId);


}
