package com.zouyi.service.impl;

import com.zouyi.dao.UserDao;
import com.zouyi.domain.User;
import com.zouyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 邹义(Dimo)
 * @date 2019/02/18 16:30
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDao.findById(id).get();
    }

    @Override
    public void update(User user) {

//        int a=1/0;
        userDao.save(user);
    }
}
