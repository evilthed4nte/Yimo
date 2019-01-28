package com.yimo.Service.Proxy;

public class DemoImpl implements Demo {

    @Override
    public void parent() {
        System.out.println("-------parent--------");
        this.child();

    }

    @Override
    public void child() {
        System.out.println("-------child--------");

    }
}
