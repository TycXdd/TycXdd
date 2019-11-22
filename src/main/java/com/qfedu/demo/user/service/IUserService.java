package com.qfedu.demo.user.service;

import com.qfedu.demo.user.pojo.User;

public interface IUserService {
    public void insert(User user);

//    public User login(User user);

    public User login(String tel);

    public void update(User user);

//    public void delete(User user);

//    public User selectByPrimaryKey(Integer id);
}
