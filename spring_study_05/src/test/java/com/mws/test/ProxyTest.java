package com.mws.test;

import com.mws.proxy.Car;
import com.mws.proxy.Eatable;
import com.mws.proxy.Person;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void testProxy() {
        Person p = new Person("马威山");

        ClassLoader cl = p.getClass().getClassLoader();
        Class<?>[] interfaces = p.getClass().getInterfaces();

        Eatable eat = (Eatable) Proxy.newProxyInstance(cl, interfaces, (Object proxy, Method method, Object[] args) -> {
            System.out.println("proxy invoked!");
            //System.out.println(proxy);
            System.out.println(method);
            for(int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
            System.out.println("<before>");
            System.out.println("--------------------------");
            method.invoke(p, args);
            System.out.println("--------------------------");
            System.out.println("<after>");
            return null;
        });

        eat.eat("羊肉串");
    }

    @Test
    public void GCLibProxyTest() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Car.class);
        MethodInterceptor interceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if(method.getName().equals("run")) {
                    System.out.println("挂挡");
                    methodProxy.invokeSuper(o, objects);
                    System.out.println("刹车");
                }else{
                    methodProxy.invokeSuper(o, objects);
                }
                return null;
            }
        };
        enhancer.setCallback(interceptor);
        Car car = (Car)enhancer.create();
        car.run();
    }
}
