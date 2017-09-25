package com.ebnew.controller;

import com.ebnew.pojo.User;
import com.ebnew.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
import java.util.Map;

/**
 * 用户表现层action
 */
@Controller
@RequestMapping
public class UserAction {

    @Autowired
    private UserService userService;

    /**
     * 根据用户模糊查询
     *
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(String username, Model model) {
        List<User> users = userService.selectUsersByUsername(username);
        model.addAttribute("users", users);
        return "success";
    }

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    @RequestMapping("/insert")
    public String insert(User user) {
        userService.insertUser(user);
        return "insert";
    }

    @RequestMapping("/page")
    public String page(String username, Integer page, Integer size, Model model) {
        List<User> users = userService.selectUserByPage(username, page, size);
        model.addAttribute("users", users);
        return "success";
    }

    @RequestMapping("/selectOne")
    public @ResponseBody
        User selectOne(Integer id, Model model) {
            User user = userService.selectUserById(id);
            return user;
//        model.addAttribute("user", user);
//        return "user";
    }

    @RequestMapping("/findAll")
    public @ResponseBody
    List<Map> findAll(){
        List<Map> maps = userService.selectList();
        return maps;
    }

    @RequestMapping("/selectMap")
    public @ResponseBody
    Map selectMap(){
        Map map = userService.selectMap();
        return map;
    }



}
