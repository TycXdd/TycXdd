package com.qfedu.demo.user.service;

import com.qfedu.demo.user.pojo.City;
import com.qfedu.demo.user.pojo.VCity;

import java.util.List;

public interface ICityService {
    public List<City> select(int pid);

    VCity selectPrimaryKey (Integer getid, Integer backid);
}
