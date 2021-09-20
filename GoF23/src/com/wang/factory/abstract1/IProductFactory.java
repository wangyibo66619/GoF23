package com.wang.factory.abstract1;

// 抽象产品工厂
public interface IProductFactory {
    // 手机
    IphoneProduct iphoneProduct();
    // 路由器
    IRouterProduct irouterProduct();
}
