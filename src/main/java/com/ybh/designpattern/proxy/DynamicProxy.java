package com.ybh.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 리플렉션으로 프록시 동적으로 생성하는 예제
 */
public class DynamicProxy {
    public static void main(String[] args) {
        DynamicProxy main = new DynamicProxy();
        RealSubjectInterface proxy = main.getProxy(new RealSubject());
        proxy.run();
    }

    private RealSubjectInterface getProxy(RealSubjectInterface target) {
        return (RealSubjectInterface) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{RealSubjectInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before run");
                method.invoke(target, args);
                System.out.println("after run");
                return null;
            }
        });
    }
}
