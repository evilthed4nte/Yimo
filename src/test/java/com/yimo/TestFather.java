package com.yimo;

import com.yimo.Model.Father;
import com.yimo.Model.Son;

public class TestFather {

    public static void main(String[] args) {
        Son son = new Son();

//        引用类型时父类 实例是子类 向上转型
        Father father = son;
        father.smoke();
    }
}
