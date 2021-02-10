package com.rupai.demo.mapper;

import com.rupai.demo.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhoupeng
 */
public interface UserMapper {


    /**
     * 插入用户
     *
     * @param user 用户信息
     * @return 影响行数
     */
    int insert(@Param("user") User user);


    User selectById(@Param("userId") Long userId);


    int deleteUserById(@Param("userId") Long userId);
}
