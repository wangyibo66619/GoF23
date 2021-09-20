package com.wang.builder.demo02;

public class test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker
                .builderA("全家桶")
                .getProduct();


        System.out.println(product);
    }
}
