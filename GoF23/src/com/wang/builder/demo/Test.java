package com.wang.builder.demo;

public class Test {
    public static void main(String[] args) {
        // 指挥
        Director director = new Director();
        // 指挥具体的工人完成商品
        Product product = director.getProduct(new Worker());
        System.out.println(product.toString());
    }
}
