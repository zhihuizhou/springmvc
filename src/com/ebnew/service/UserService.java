package com.ebnew.service;

import com.ebnew.pojo.User;

import java.util.List;

/**
 * 用户业务层接口
 */
public interface UserService {

    /**根据用户名模糊查询用户
     * @param username
     * @return
     */
    public List<User> selectUsersByUsername(String username);

    /**保存用户
     * @param user
     */
    public void insertUser(User user);
}
