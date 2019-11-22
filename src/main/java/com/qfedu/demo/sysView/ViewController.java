package com.qfedu.demo.sysView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String index1() {
        return "page/index";
    }

    @RequestMapping("/index")
    public String index2() {
        return "page/index";
    }

    @RequestMapping("/login")
    public String login() {
        return "page/login";
    }

//    @RequestMapping("/loginSuccess")
//    public String loginSuccess() {
//        return "page/loginsuccess";
//    }
    @RequestMapping("/mymain")
    public String mymain() {
        return "myMain/mymain";
    }

    @RequestMapping("/myinfo")
    public String myinfo() {
        return "myMain/myinfo";
    }
}
