package com.ll.charpter05.innerclass;

public class JavaInnerClass {

    public static void main(String[] args) {
        OuterClass outer1 = new OuterClass();
        OuterClass outer2 = new OuterClass();
        //创建java成员内部类
        //说明在java中，将成员内部类当做一个属性，因此使用如下方式创建
        OuterClass.InnerClass inner1 = outer1.new InnerClass();
        OuterClass.InnerClass inner2 = outer2.new InnerClass();

        //下面的方法调用说明在java中，内部类只和类型相关，也就是说
        // 只要是OuterClass.InnerClass类型额对象就可以传给形参InnerClass ic
        inner1.test(inner2);
        inner2.test(inner1);

        inner1.test(inner1);

        //创建Java静态内部类
        //因为在Java中静态内部类和类相关的，使用new OuterClass.StaticInnerClass()
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.test(staticInner);
    }
}

class OuterClass{   //外部类
    class InnerClass{   //成员内部类
        public void test(InnerClass ic){
            System.out.println(ic);
        }
    }

    static class StaticInnerClass{
        public void test(StaticInnerClass sic){
            System.out.println(sic);
        }
    }
}
