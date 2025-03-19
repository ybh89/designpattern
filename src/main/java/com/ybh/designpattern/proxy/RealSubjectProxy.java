package com.ybh.designpattern.proxy;

public class RealSubjectProxy implements RealSubjectInterface {
    private final RealSubject realSubject;

    public RealSubjectProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void run() {
        System.out.println("before run");
        realSubject.run();
        System.out.println("after run");
    }
}
