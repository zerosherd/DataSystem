package zerosherd.project.DataManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zerosherd.project.DataManager.dao.UserMapper;
import zerosherd.project.DataManager.entity.User;

import java.util.List;


/**
 * @Description: This is a User Controller
 * @ClassName: UserController
 * @Author: ZeroSherd
 * @Date: 2021/12/30 13:42
 */

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        List<User> userList = userMapper.getAllUser();
        return userList;
    }

    @RequestMapping("/register")
    public boolean register(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        userMapper.addUser(new User(username, password));
        return true;
    }
}
