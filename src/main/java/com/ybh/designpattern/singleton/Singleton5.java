package com.ybh.designpattern.singleton;

/**
 * 장점:
 *      지연 초기화 getInstance()가 호출되는 시점에 인스턴스가 생성됨.
 *      클래스 로딩 과정에서 한번만 초기화 되므로 synchronized 없이 스레드 세이프함.
 *      따라서 클래스 로딩은 한번 실행되고, 클래스 초기화는 필요한 시점에 실행됨.
 * 단점:
 *      리플렉션으로 private 생성자를 호출가능하게 해서 싱글톤을 꺠트릴수 있음. (생성자에 예외처리로 방어 가능)
 *      인스턴스를 직렬화 역직렬화를 통해서 새로운 인스턴스를 생성할 수 있음. (readResolve 구현하여 기존 인스턴스를 반환하도록 해서 방어 가능)
 */
public class Singleton5 {
    private Singleton5() {}

    private static class Singleton5Holder {
        private static final Singleton5 SINGLETON_5 = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return Singleton5Holder.SINGLETON_5;
    }
}
