package com.qfedu.demo.user.controller;

import com.qfedu.demo.common.JsonBean;
import com.qfedu.demo.common.JsonUtils;
import com.qfedu.demo.user.pojo.Code;
import com.qfedu.demo.user.pojo.User;
import com.qfedu.demo.user.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

//    /* 用户注册 */
//    @RequestMapping("/add")
//    public String insert(User user) {
//        userService.insert(user);
//        return "page/register";
//    }


    /* 用户注册 */

    @RequestMapping("/add")
    @ResponseBody
    public Code insert(User user) {
        userService.insert(user);
        Code code = new Code();
        code.setCode(1);

        return code;
    }

    /* UserInfo */
    @RequestMapping("/denglu")
    @ResponseBody
    public JsonBean denglu(HttpSession session) {
        JsonBean bean = null;
        User user = (User) session.getAttribute("user");
        if (user == null) {
            bean = JsonUtils.createJsonBean(0, 0);
        } else {
            bean = JsonUtils.createJsonBean(1, user);
        }
        return bean;
    }

    /* 修改用户Tel */
    @RequestMapping("/update")
    @ResponseBody
    public JsonBean update(HttpSession session, String tel) {
        JsonBean bean = null;
        User user = (User) session.getAttribute("user");
        user.setTel(tel);
        try {
            if (user.getId() != null) {
                userService.update(user);
                bean = JsonUtils.createJsonBean(1, "修改成功！");
            } else {
                bean = JsonUtils.createJsonBean(1, "未登录");
            }
        } catch (Exception e) {
            bean = JsonUtils.createJsonBean(0, e.getMessage());
        }
        return bean;
    }



    /*  用户登录  */

    @RequestMapping("/login")
    @ResponseBody
    public Code login(User user, HttpSession session) {
        User user1 = userService.login(user.getTel());
        Code code = new Code();
        logger.info(user1);
        if (user1 != null && user.getPassword().equals(user1.getPassword())) {
            session.setAttribute("user", user1);
            code.setCode(1);
            return code;
        } else {
            code.setCode(2);
            code.setResult("账号或密码错误");
            return code;
        }
    }

    @RequestMapping("/index")
    public String index2() {
        return "index";
    }

    @RequestMapping("/shortrent")
    @ResponseBody
    public String shortrent() {
        return "shortrent";
    }

}
