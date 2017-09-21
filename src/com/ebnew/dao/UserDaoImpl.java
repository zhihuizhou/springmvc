package com.ebnew.dao;

import com.ebnew.pojo.User;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * 持久层实现类
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    /**
     * @param username
     * @return
     */
    @Override
    public List<User> selectUsersByUsername(String username) {
        return this.getSqlSession().selectList("com.ebnew.pojo.User.findListByUsername",username);
    }

    /**
     * @param user
     */
    @Override
    public void insertUser(User user) {
        this.getSqlSession().insert("com.ebnew.pojo.User.insert", user);
    }

    /**
     * @param username
     * @param page
     * @param size
     * @return
     */
    @Override
    public List<User> selectUserByPage(String username, Integer page, Integer size) {
        RowBounds rowBounds = new RowBounds(page,size);
        return this.getSqlSession().selectList(username,rowBounds);
    }

}
