package com.wang.builder.demo;
// 指挥:核心，负责指挥构建一个工程，工程如何构建，由它决定
public class Director {

    public Product getProduct(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProduct();
    }
}
