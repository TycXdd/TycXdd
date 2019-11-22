package com.qfedu.demo.user.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.demo.user.dao.IOrderDao;
import com.qfedu.demo.user.pojo.Order;
import com.qfedu.demo.user.pojo.VOrder;
import com.qfedu.demo.user.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderDao orderDao;

    @Override
    public void add(Integer uid, Integer cid, Integer getid, Integer backid, String oprices) {
        Order order = new Order();
        String status = "已预订";
        double oprice = Double.parseDouble(oprices);
        order.setCid(cid);
        order.setUid(uid);
        order.setGetid(getid);
        order.setBackid(backid);
        order.setOprice(oprice);
        order.setStatus(status);
        orderDao.add(order);

    }

    @Override
    public Map<String, Object> selectAll(Integer uid, int page) {
        PageHelper.startPage(page, 5);
        List<VOrder> list = orderDao.selectAll(uid);

        Map<String, Object> map = new HashMap<>();
        map.put("total", ((Page)list).getTotal());
        map.put("rows", list);

        return map;
    }



}
