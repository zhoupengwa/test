package com.rupai.demo.service;

import com.rupai.demo.mapper.UserMapper;
import com.rupai.demo.model.ResponseCode;
import com.rupai.demo.model.ResponseDTO;
import com.rupai.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhoupeng
 */
@Service
public class UserServiceImpl implements IUserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private static final String BLACK_USER = "张三";


    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        if (user == null) {
            throw new RuntimeException("用户信息不全");
        }
        //todo 张三
        if (BLACK_USER.equals(user.getUsername())) {
            throw new RuntimeException("不允许叫张三的用户使用汝拍系统");
        }
        logger.info("add user, name is {}", user.getUsername());
        int rowCount = userMapper.insert(user);
        if (rowCount != 1) {
            throw new RuntimeException("insert error");
        }
    }

    @Override
    public User selectById(Long userId) {
        //todo 其他业务逻辑

        return userMapper.selectById(userId);
    }

    @Override
    public ResponseDTO deleteUserById(Long userId) {
        logger.info("delete the user: {}", userId);
        ResponseDTO response = new ResponseDTO();
        int rowCount = userMapper.deleteUserById(userId);


        if (rowCount != 1) {
            response.setStatus(ResponseCode.ERRPR.getCode());
            response.setMsg("用户不存在，无法删除");
        }else {
            response.setStatus(ResponseCode.SUCCESS.getCode());
            response.setMsg("删除成功");
        }

        return response;

    }
}
