package com.ebnew.service;

import com.ebnew.dao.UserDao;
import com.ebnew.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}
