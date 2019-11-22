package com.qfedu.demo.user.controller;


import com.qfedu.demo.user.pojo.Car;
import com.qfedu.demo.user.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private ICarService carService;

    @RequestMapping("/orderSum")
    public String orderSum() {
        return "order/ordersubmit";
    }

    @RequestMapping("/price")
    @ResponseBody
    public List<Car> price(int getid) {
        return carService.findByPrice(getid);
    }

    @RequestMapping("/number")
    @ResponseBody
    public List<Car> number(int getid) {
        return carService.findByNum(getid);
    }

    @RequestMapping("/findCar")
    @ResponseBody
    public Car findCar(int cid) {
        return carService.findCar(cid);
    }
}
