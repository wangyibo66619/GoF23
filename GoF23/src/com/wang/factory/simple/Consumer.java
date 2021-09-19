package com.wang.factory.simple;

public class Consumer {
    public static void main(String[] args) {
        // 接口，所有的实现类 工厂
        //Car car1 = new WuLing();
        //Car car2 = new Tesla();

        // 使用工厂创建
        Car car1 = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("特斯拉");
        car1.name();
        car2.name();
    }
}
