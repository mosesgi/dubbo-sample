package com.moses.web.controller;


import com.moses.user.api.UserApi;
import com.moses.user.vo.UserVo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference
    UserApi userApi;

    @GetMapping("/findUser")
    public UserVo findByUserId(@RequestParam int userId){
        return userApi.findUserById(userId);
    }
}

