package com.ybh.designpattern.proxy;

public class Main {
    public static void main(String[] args) {
        RealSubjectInterface realSubject = new RealSubjectProxy(new RealSubject());
        realSubject.run();
    }
}
