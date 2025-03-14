package com.ybh.designpattern.singleton;

/**
 * 장점: 인스턴스가 없는 경우에만 synchronized 를 사용해서 리소스 절약.
 * 단점:
 *      구현 복잡
 *      volatile 은 JVM 1.5 이상만 지원됨
 */
public class Singleton4 {
    // Double-checked locking 에는 가시성 문제가 존재하므로, volatile 설정.
    // 그럼 Singleton3 에는 가시성 문제가 없나? -> 없다. 이유는 JVM의 happens-before 규칙에 의해서 synchronized 블록 내에서 수행된 모든 변경 사항은 다른 스레드가 블록을 진입할 때 반드시 보이도록 보장됨
    // 하지만 Double-checked locking 은 부분적으로 synchronized 가 적용되어 있어서 보장이 안됨.
    private static volatile Singleton4 singleton4;

    private Singleton4() {}

    // singleton4 가 null 인 경우만 synchronized 를 수행하기 위해 Double-checked locking 적용
    // synchronized 안에 if (singleton4 == null) 조건이 없으면 객체가 2개 이상 만들어 질수 있음.
    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
