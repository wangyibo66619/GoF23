package com.wang.factory.abstract1;
// 小米路由器
public class XiaoMiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void startWifi() {
        System.out.println("打开小米WiFi");
    }

    @Override
    public void setting() {
        System.out.println("小米设置");
    }
}
