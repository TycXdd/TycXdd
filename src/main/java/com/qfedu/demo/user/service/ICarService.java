package com.qfedu.demo.user.service;

import com.qfedu.demo.user.pojo.Car;

import java.util.List;


public interface ICarService {
    List<Car> findByNum(int id);
    List<Car> findByPrice(int id);

    Car findCar(int id);
}
