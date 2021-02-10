package com.rupai.demo.controller;

import com.rupai.demo.model.ResponseDTO;
import com.rupai.demo.model.User;
import com.rupai.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhoupeng
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public void userRegister(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/query")
    public User queryUserInfo(@RequestParam("userId") Long userId) {
        return userService.selectById(userId);
    }

    @PutMapping("/delete")
    public ResponseDTO delete(@RequestParam("userId") Long userId) {
        return userService.deleteUserById(userId);
    }

}
