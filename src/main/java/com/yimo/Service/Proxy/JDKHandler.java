package com.yimo.Service.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKHandler implements InvocationHandler {

    private Object target;

    public JDKHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(target,args);

    }

    public static void main(String[] args) {

        Demo demo = new DemoImpl();
        JDKHandler jdkHandler = new JDKHandler(demo);
        //新建一个代理 把自己定义 类读取器 接口 控制器 作为参数
        Demo proxy = (Demo) Proxy.newProxyInstance(jdkHandler.getClass().getClassLoader(), new Class[]{Demo.class}, jdkHandler);
        proxy.parent();
    }
}
