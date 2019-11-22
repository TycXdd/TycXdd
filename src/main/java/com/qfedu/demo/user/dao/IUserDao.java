package com.qfedu.demo.user.dao;

import com.qfedu.demo.user.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    public void insert(User user);

//    public User getTel(String tel);

    public User login(String tel);

    int update(User user);

//    int delete(User user);
//
//    public User selectByPrimaryKey(Integer id);



}
