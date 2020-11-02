package com.yg.service;

import com.yg.dao.UserDao;
import com.yg.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Map<String, Object> loginUser(String username, String password) {
        Map<String,Object> resultMap = new HashMap<>();
        String msg = "login success";
        String code="200";
        User user= userDao.selectUser(username ,password);
        if (user==null){
            msg="用户不存在";
            code="500";
            resultMap.put("msg",msg);
            resultMap.put("code",code);
            return  resultMap;
        }
        resultMap.put("msg",msg);
        resultMap.put("code",code);

        return resultMap;
    }
}
