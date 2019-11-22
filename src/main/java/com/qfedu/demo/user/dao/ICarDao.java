package com.qfedu.demo.user.dao;

import com.qfedu.demo.user.pojo.Car;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ICarDao {

    List<Car> findByNum(int id);

    List<Car> findByPrice(int id);

    Car findCar(int id);
}
