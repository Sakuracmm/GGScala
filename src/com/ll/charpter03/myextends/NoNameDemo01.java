package com.ll.charpter03.myextends;

/**
 * @author LL
 * @date 2019/8/22
 * @description 匿名类
 */
public class NoNameDemo01 {
    public static void main(String[] args) {
        A2 a2  = new A2() {
            @Override
            public void cry() {
                System.out.println("嘤嘤嘤~");
            }
        };
        a2.cry();
    }
}
abstract class A2{
    abstract public void cry();
}
