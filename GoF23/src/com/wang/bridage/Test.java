package com.wang.bridage;

public class Test {
    public static void main(String[] args) {
        // 苹果台式机
        Computer computer = new Desktop(new apple());
        computer.info();
        // 联想笔记本
        Computer computer1 = new Laptop(new lenovo());
        computer1.info();
    }
}
