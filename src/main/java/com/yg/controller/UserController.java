package com.yg.controller;

import com.yg.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
  private UserService userService;

    /*登录*/
    @RequestMapping(value = "/LoginUser",method = RequestMethod.POST)
    public  Map<String,Object>  LoginUser(@RequestParam("username")String username, @RequestParam("password")String password ){
        Map<String,Object> mapRequest =new HashMap<>();
        String msg="login success";
          String code="200";
          if (username==null||"".equals(username)){
              msg = "用户名不能为空";
              code = "500";
              mapRequest.put("msg",msg);
              mapRequest.put("code",code);
              return  mapRequest;
          }
          if (password==null||"".equals("password")){
              msg = "密码不能为空";
              code ="500";
              mapRequest.put("msg",msg);
              mapRequest.put("code",code);
              return  mapRequest;
          }
         mapRequest= userService.loginUser(username,password);
          return  mapRequest;

    }
}
