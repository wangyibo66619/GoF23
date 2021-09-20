package com.wang.builder.demo02;

public class Worker extends Builder{
    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder builderA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setBuildA(msg);
        return this;
    }


    @Override
    Product getProduct() {
        return product;
    }


}
