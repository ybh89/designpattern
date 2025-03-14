package com.ybh.designpattern.singleton;

/**
 * 장점: 스레드 세이프
 * 단점:
 *      인스턴스가 1개 생성된 이후 부터는, getInstance() 호출할때마다 쓸데없이 synchronized 때문에 락이 걸리고 리소스 낭비를 하게 됨.
 */
public class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {}

    // 스레드 세이프를 위해 synchronized 설정.
    public synchronized static Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
