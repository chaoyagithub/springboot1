package com.study.service;

import com.study.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private static Map<Integer, User> users = new HashMap<>();

    static {
        users.put(1, new User(1, "zhangsan", "北京"));
        users.put(1, new User(2, "lisi", "上海"));
        users.put(1, new User(3, "wangwu", "广州"));
        users.put(1, new User(4, "zhaoliu", "深圳"));
        users.put(1, new User(5, "zhenqi", "杭州"));
    }

    public User getUserById(Integer id) {
        return users.get(id);
    }

    public List<User> getAllUser() {
        return new ArrayList(users.values());
    }

    public void add(User user) {
        Integer newId = users.size() + 1;
        user.setId(newId);
        users.put(newId, user);
    }

    public void update(User user) {
        users.replace(user.getId(), user);

    }

    public void delete(Integer id) {
        users.keySet().removeIf(key -> key == id);

    }
}
