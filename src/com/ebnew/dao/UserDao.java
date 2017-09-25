package com.ebnew.dao;

import com.ebnew.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    public List<User> selectUsersByUsername(String username);

    public void insertUser(User user);

    public List<User> selectUserByPage(String username, Integer page, Integer size);

    public User selectUserById(Integer id);

    public List<Map> selectList();

    public Map selectMap();
}
