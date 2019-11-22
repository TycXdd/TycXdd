package com.qfedu.demo.user.pojo;

public class VCity {
    private City getCity;
    private City backCity;

    public City getGetCity() {
        return getCity;
    }

    public void setGetCity(City getCity) {
        this.getCity = getCity;
    }

    public City getBackCity() {
        return backCity;
    }

    public void setBackCity(City backCity) {
        this.backCity = backCity;
    }

    @Override
    public String toString() {
        return "VCity{" +
                "getCity=" + getCity +
                ", backCity=" + backCity +
                '}';
    }
}
