package com.qfedu.demo.user.controller;


import com.qfedu.demo.common.JsonBean;
import com.qfedu.demo.common.JsonUtils;
import com.qfedu.demo.user.pojo.Order;
import com.qfedu.demo.user.pojo.User;
import com.qfedu.demo.user.pojo.VOrder;
import com.qfedu.demo.user.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/add")
    @ResponseBody
    public JsonBean add(HttpSession session, Integer cid, Integer getid, Integer backid, String oprice) {
        JsonBean bean = null;
        User user = (User) session.getAttribute("user");
        if (user == null) {
            bean = JsonUtils.createJsonBean(2, "您未登录，请先去登录");
        } else {
            try {
                orderService.add(user.getId(), cid, getid, backid, oprice);
                bean = JsonUtils.createJsonBean(1, "预订成功");
            } catch (Exception e) {
                bean = JsonUtils.createJsonBean(0, e.getMessage());
            }
        }
        return bean;
    }



    @RequestMapping("allOrder")
    @ResponseBody
    public JsonBean selectAll(HttpSession session, int page) {
        JsonBean bean = null;
        User user = (User) session.getAttribute("user");

        try {
            Map<String, Object> map = orderService.selectAll(user.getId(), page);
            bean = JsonUtils.createJsonBean(1,map);
        } catch (Exception e) {
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }

        return bean;

    }


    @RequestMapping("/loginOut")
    public String login(HttpSession session) {
        session.invalidate();
        return "page/index";
    }


}
