package com.qfedu.demo.user.dao;

import com.qfedu.demo.user.pojo.Order;
import com.qfedu.demo.user.pojo.VOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderDao {
    int add(Order order);

    List<VOrder> selectAll(Integer uid);

}
