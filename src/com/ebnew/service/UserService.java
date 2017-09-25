package com.ebnew.service;

import com.ebnew.pojo.User;

import java.util.List;
import java.util.Map;

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

    public List<User> selectUserByPage(String username, Integer page, Integer size);

    public User selectUserById(Integer id);

    public List<Map> selectList();

    public Map selectMap();
}
