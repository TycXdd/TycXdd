package com.qfedu.demo.user.service.Impl;

import com.qfedu.demo.user.dao.ICityDao;
import com.qfedu.demo.user.pojo.City;
import com.qfedu.demo.user.pojo.VCity;
import com.qfedu.demo.user.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService {
    @Autowired
    private ICityDao cityDao;

    @Override
    public List<City> select(int pid) {
        return cityDao.select(pid);
    }

    @Override
    public VCity selectPrimaryKey(Integer getid, Integer backid) {
        City getCity = cityDao.selectPrimaryKey(getid);
        City backCity = cityDao.selectPrimaryKey(backid);

        VCity vcity = new VCity();

        vcity.setGetCity(getCity);
        vcity.setBackCity(backCity);

        return vcity;
    }
}
