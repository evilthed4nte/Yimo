package com.yimo;

public class TestReverse {
    public static void main(String[] args) {
        String s = "abcdef";

        /**
         * StringBuffer 线程安全
         * StringBuilder 不安全 但是速度快
         */
        int length = s.length();
        String newS = s.replaceAll(s,"hello char");
        System.out.println(newS);

        StringBuffer sbuf = new StringBuffer(s);

        for (int i = length; i < length; i--) {
            sbuf.append(s.charAt(i));
        }
    }
}
