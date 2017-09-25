package com.ebnew.dao;

import com.ebnew.pojo.User;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

/**
 * 持久层实现类
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    /**根据用户名模糊查询
     * @param username
     * @return
     */
    @Override
    public List<User> selectUsersByUsername(String username) {
        return this.getSqlSession().selectList("com.ebnew.pojo.User.findListByUsername",username);
    }

    /**保存用户
     * @param user
     */
    @Override
    public void insertUser(User user) {
        this.getSqlSession().insert("com.ebnew.pojo.User.insert", user);
    }

    /**分页查询
     * @param username
     * @param page
     * @param size
     * @return
     */
    @Override
    public List<User> selectUserByPage(String username, Integer page, Integer size) {
        RowBounds rowBounds = new RowBounds((page-1)*size,size);
        return this.getSqlSession().selectList("com.ebnew.pojo.User.findPageByUsername",username,rowBounds);
    }

    @Override
    public User selectUserById(Integer id) {
        return this.getSqlSession().selectOne("com.ebnew.pojo.User.selectUserById",id);
    }

    @Override
    public List<Map> selectList() {
        return this.getSqlSession().selectList("com.ebnew.pojo.User.selectList");
    }

    public Map selectMap(){
        return this.getSqlSession().selectMap("com.ebnew.pojo.User.selectMap", "ab");
    }

}
