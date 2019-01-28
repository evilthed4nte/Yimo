package com.yimo.Service.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Myhandler implements InvocationHandler {

    //目标对象
    private Object target;

    public Myhandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        /**
         * 做一些额外的处理
         * 日志记录
         * 权限控制
         * 事务处理
         */
        System.out.println("------------------------这里加入额外的处理(增强)--------------------------");

        return method.invoke(target,args);
    }


    public static void main(String[] args) {
        Demo demo = new DemoImpl();
        Myhandler myhandler = new Myhandler(demo);
        Demo proxy = (Demo) Proxy.newProxyInstance(Myhandler.class.getClassLoader(),
                new Class[]{Demo.class},
                myhandler);
        proxy.parent();
        proxy.child();
    }
}
