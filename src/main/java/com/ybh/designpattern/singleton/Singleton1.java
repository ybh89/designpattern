package com.ybh.designpattern.singleton;

/**
 * 장점: 구현 간단
 * 단점:
 *      어플리케이션 실행시점에 무조건 객체를 할당받아야함.
 */
public class Singleton1 {
    // 외부에서 객체생성을 안해도 생성된 객체에 접근할 수 있도록 static 사용하여 클래스변수로 설정.
    private static final Singleton1 singleton1 = new Singleton1();

    /**
     * 외부에서 추가적인 객체 생성을 막을 수 있도록 private 설정.
     */
    private Singleton1() {}

    public static Singleton1 getSingleton1() {
        return singleton1;
    }
}
