package com.study.controller;

import com.study.entity.Result;
import com.study.entity.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService = new UserService();

    @GetMapping("/{id}")
    public Result getUser(@PathVariable Integer id) {
        User user = userService.getUserById(id);
        return new Result(200, "查询成功", user);

    }

    @PostMapping("/add")
    public Result addUser(User user) {
        userService.add(user);
        return new Result(200, "添加成功");

    }

    @PutMapping("/update")
    public Result updateUser(User user) {
        userService.update(user);
        return new Result(200, "更新成功");

    }

    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable Integer id) {
        userService.delete(id);
        return new Result(200, "删除成功");

    }


}

