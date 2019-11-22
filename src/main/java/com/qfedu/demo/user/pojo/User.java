package com.qfedu.demo.user.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String tel;
    private String password;
    private String email;
    private String invitation;

    public User() {
    }

    public User(Integer id, String tel, String password, String email, String invitation) {
        this.id = id;
        this.tel = tel;
        this.password = password;
        this.email = email;
        this.invitation = invitation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInvitation() {
        return invitation;
    }

    public void setInvitation(String invitation) {
        this.invitation = invitation;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", tel='" + tel + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", invitation='" + invitation + '\'' +
                '}';
    }
}
