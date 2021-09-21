package com.wang.prototype.demo02;

import java.util.Date;

public class VideoClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        // 原型对象
        Video v1 = new Video("v1",date);
        // 克隆对象
        Video v2 = (Video) v1.clone();
        System.out.println("v1=>" + v1);
        System.out.println("v2=>" + v2);

        System.out.println("=========================");


        date.setTime(38123681);
        System.out.println("v1=>" + v1);
        System.out.println("v2=>" + v2);
    }
}
