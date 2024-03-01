package com.example.entity;

import java.io.Serializable;

/**
 * @className: MyUser
 * @author: YanBo
 * @date: 2023/8/29 17:20
 */
public class MyUser implements Serializable {
    private String id;
    private String name;
    private String desc;

    public MyUser(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }
    public MyUser() {
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc=" + desc +
                '}';
    }
}
