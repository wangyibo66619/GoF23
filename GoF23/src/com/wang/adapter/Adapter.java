package com.wang.adapter;

// 真正的适配器
public class Adapter implements NetToUsb{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void handRequest() {
        adaptee.request();// 可以上网了
    }
}
