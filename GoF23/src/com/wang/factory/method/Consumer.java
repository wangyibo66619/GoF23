package com.wang.factory.method;



public class Consumer {
    public static void main(String[] args) {
        Car car = new TeslaFactory().getCar();
        Car car2 = new WuLingFactory().getCar();

        car.name();
        car2.name();
        Car car3 = new MoBaiFactory().getCar();
        car3.name();

    }
}
