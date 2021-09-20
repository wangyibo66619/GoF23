package com.wang.builder.demo;

// 具体构造者：工人
public class Worker extends Builder{
    private Product product;

    public Worker() {
        product =new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBuildA("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildA("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildA("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
