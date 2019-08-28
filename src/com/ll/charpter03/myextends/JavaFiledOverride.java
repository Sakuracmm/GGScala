package com.ll.charpter03.myextends;

/**
 * @author LL
 * @date 2019/8/22
 * @description java字段名覆盖
 */
public class JavaFiledOverride {
    public static void main(String[] args) {
        //创建两个对象
        //下面的代码的小结
        //1.对于同一个对象，用父类的引用去取值（字段），会取到父类的字段的值
        //2.用子类的引用去取值（字段，则取到子类字段的值）
        Sub2 c1 = new Sub2();
        System.out.println(c1.s);   //sub
        System.out.println(((Super)c1).s);  //通过强转，访问父类中被隐藏的的s字段
        Super c2 = new Sub2();
        System.out.println(c2.s);   //super
    }
}

class Super{
    String s = "super";
}

class Sub2 extends Super{
    String s = "sub";
}
