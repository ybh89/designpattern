package com.ybh.designpattern.singleton;

/**
 * 장점: 객체 생성 지연
 * 단점:
 *      멀티 스레드 환경에서 서로 다른 스레드가 동시에 getInstance()를 호출할시, 두 개 이상의 객체가 생성될 수 있음.
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        // 필요한 경우에 객체를 생성함. 객체생성 지연.
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
