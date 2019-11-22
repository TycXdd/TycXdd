package com.qfedu.demo.user.service.Impl;

import com.qfedu.demo.user.dao.ICarDao;
import com.qfedu.demo.user.pojo.Car;
import com.qfedu.demo.user.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private ICarDao carDao;

    @Override
    public List<Car> findByNum(int id) {
        return carDao.findByNum(id);
    }

    @Override
    public List<Car> findByPrice(int id) {
        return carDao.findByPrice(id);
    }

    @Override
    public Car findCar(int id) {
        return carDao.findCar(id);
    }
}
