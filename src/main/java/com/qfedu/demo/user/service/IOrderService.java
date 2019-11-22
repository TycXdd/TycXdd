package com.qfedu.demo.user.service;

import com.qfedu.demo.user.pojo.Order;
import com.qfedu.demo.user.pojo.User;
import com.qfedu.demo.user.pojo.VOrder;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public interface IOrderService {
    void add(Integer uid, Integer cid, Integer getid, Integer backid, String oprice);



    public Map<String, Object> selectAll(Integer uid, int page);




}
