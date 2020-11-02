package com.yg.dao;

import com.yg.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    public int insertUser(User user);
    public List<User> selectUser(int pageNo,int pageSize);
    public  User selectUser(@Param("username")String username,@Param("password")String password);
}
