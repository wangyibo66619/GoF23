package com.wang.adapter;

// 客户端类：想上网，插不上网线
public class Computer {
    // 电脑需要连接上转接器才可以上网
    public void net(NetToUsb net) {
        // 上网的具体实现，找一个转接头
        net.handRequest();
    }

    public static void main(String[] args) {
        // 电脑，适配器，网线
        Computer computer = new Computer();// 电脑
        Adaptee adaptee = new Adaptee();// 网线
        Adapter adapter = new Adapter(adaptee);// 转接器
        computer.net(adapter);

    }
}
