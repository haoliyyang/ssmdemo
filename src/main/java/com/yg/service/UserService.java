package com.yg.service;

import java.util.Map;

public interface UserService {

    public Map<String, Object> loginUser(String username, String password);
}
