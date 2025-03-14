package com.ybh.designpattern.singleton;

/**
 * enum 자체가 싱글톤임.
 * 장점
 *      구현이 간단
 * 단점
 *      지연 초기화 불가
 *      Enum 이외의 클래스에 상속 불가
 */
public enum Singleton6 {
    INSTANCE;

    public void doSomething() {
        System.out.println("Hello from Singleton!");
    }
}
