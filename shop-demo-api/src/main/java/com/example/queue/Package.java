package com.example.queue;

/**
 * @className: Package
 * @author: YanBo
 * @date: 2023/9/14 14:20
 */
public class Package {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void execute() {
        System.out.println(Thread.currentThread().getName() + "executed " + this);
    }
}
