package com.ybh.designpattern.proxy;

public class RealSubject implements RealSubjectInterface {
    @Override
    public void run() {
        System.out.println("hello world");
    }
}
