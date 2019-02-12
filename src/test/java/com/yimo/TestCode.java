package com.yimo;

public class TestCode {
    public static void main(String[] args) {
        double height = 100;
        double distance = 0;

        for (int i = 0; i < 10; i++) {

            distance = distance + height + height/2;
            height = height/2;
            System.out.println(height);
        }
        System.out.println(distance);
        System.out.println(height);
    }
}
