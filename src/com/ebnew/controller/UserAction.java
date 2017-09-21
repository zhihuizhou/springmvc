package com.ebnew.controller;

import com.ebnew.pojo.User;
import com.ebnew.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 用户表现层action
 */
@Controller
public class UserAction {

    @Autowired
    private UserService userService;

    /**根据用户模糊查询
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public  String list(Model model){
        List<User> users = userService.selectUsersByUsername("ad");
        model.addAttribute("users", users);
        return "success";
    }

    /**保存用户
     * @param user
     * @return
     */
    @RequestMapping("/insert")
    public  String insert(User user){
        userService.insertUser(user);
        return "insert";
    }


}
