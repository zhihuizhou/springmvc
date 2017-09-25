package com.ebnew.service;

import com.ebnew.dao.UserDao;
import com.ebnew.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectUsersByUsername(String username) {
        return userDao.selectUsersByUsername(username);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public List<User> selectUserByPage(String username, Integer page, Integer size) {
        return userDao.selectUserByPage(username, page, size);
    }

    @Override
    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    @Override
    public List<Map> selectList() {
        return userDao.selectList();
    }

    @Override
    public Map selectMap() {
        return userDao.selectMap();
    }
}
