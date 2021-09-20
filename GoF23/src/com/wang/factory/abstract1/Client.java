package com.wang.factory.abstract1;

public class Client {
    public static void main(String[] args) {

        System.out.println("-------------小米系列产品--------------");
        // 小米工厂
        IphoneProduct iphoneProduct = new XiaoMiFactory().iphoneProduct();
        iphoneProduct.call();
        iphoneProduct.sendSMS();
        IRouterProduct iRouterProduct = new XiaoMiFactory().irouterProduct();
        iRouterProduct.startWifi();

        System.out.println("-------------华为系列产品--------------");
        IphoneProduct iphoneProduct1 = new HuaWeiFactory().iphoneProduct();
        IRouterProduct iRouterProduct1 = new HuaWeiFactory().irouterProduct();
        iphoneProduct1.sendSMS();
        iRouterProduct1.startWifi();
    }
}
