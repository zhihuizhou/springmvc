package com.ebnew.dao;

import com.ebnew.pojo.User;

import java.util.List;

public interface UserDao {

    public List<User> selectUsersByUsername(String username);

    public void insertUser(User user);

    public List<User> selectUserByPage(String username, Integer page, Integer size);
}
