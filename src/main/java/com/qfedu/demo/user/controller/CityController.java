package com.qfedu.demo.user.controller;

import com.qfedu.demo.common.JsonBean;
import com.qfedu.demo.common.JsonUtils;
import com.qfedu.demo.user.pojo.City;
import com.qfedu.demo.user.pojo.VCity;
import com.qfedu.demo.user.service.ICityService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {

    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private ICityService cityService;

    @RequestMapping("/select")
    @ResponseBody
    public List<City> select(int pid) {
        return cityService.select(pid);
    }
    @RequestMapping("/rent")
    public String select() {
        return "shortRent/shortrent";
    }


    @RequestMapping("/sort")
    public String sort() {
        return "shortRent/shortsort";
    }

    @RequestMapping("/index")
    public String index() {
        return "page/index";
    }


    @RequestMapping("/gbCity")
    @ResponseBody
    public JsonBean gbCity(Integer getid, Integer backid) {
        JsonBean bean = null;

        try {
            VCity vcity = cityService.selectPrimaryKey(getid, backid);
            bean = JsonUtils.createJsonBean(1, vcity);
        } catch (Exception e) {
            bean = JsonUtils.createJsonBean(0, e.getMessage());
        }
        return bean;
    }




}
