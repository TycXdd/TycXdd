package com.qfedu.demo.user.service.Impl;

import com.qfedu.demo.user.dao.IUserDao;
import com.qfedu.demo.user.pojo.User;
import com.qfedu.demo.user.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {


    public static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    private IUserDao userDao;

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }



    @Override
    public User login(String tel) {
        return userDao.login(tel);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }



}
