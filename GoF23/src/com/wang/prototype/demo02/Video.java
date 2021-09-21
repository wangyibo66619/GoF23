package com.wang.prototype.demo02;

import java.util.Date;

public class Video implements Cloneable{
    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Video v = (Video) obj;
        // 实现深克隆
        v.date = (Date) this.date.clone();// 将对象的属性也进行克隆
        return obj;
    }


    public Video() {
    }

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
