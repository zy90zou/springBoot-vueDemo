package com.zouyi.service;

import com.zouyi.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User findOne(int id);

    public void update(User user);
}
