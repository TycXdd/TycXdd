package com.qfedu.demo.user.dao;

import com.qfedu.demo.user.pojo.City;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICityDao {
    public List<City> select(int pid);

    City selectPrimaryKey(Integer id);
}
