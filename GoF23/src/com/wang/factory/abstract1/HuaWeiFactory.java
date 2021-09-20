package com.wang.factory.abstract1;

public class HuaWeiFactory implements IProductFactory{

    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new HuaWeiRouter();
    }
}
