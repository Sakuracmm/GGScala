package com.ll.charpter03.myextends;

/**
 * @author LL
 * @date 2019/8/22
 * @description java动态绑定机制demo
 */
public class JavaDaynamicBind {
    public static void main(String[] args) {

        //将一个子类的对象地址，交给了一个AA(父类的引用)
        //java的动态绑定机制的小结
        //1. 如果调用的是方法，则jvm机会将该方法和对象的内存地址绑定
        //2. 如果调用的是一个属性，则没有动态绑定机制，在哪里调用就返回对应的值
        AA aa = new BB();
        System.out.println(aa.sum());       //40  -> 30
        System.out.println(aa.sum1());      //30  ->20
    }
}
class AA{
    public int i = 10;

    public int sum(){
        return getI() + 10;
    }
    public int getI() {
        return i;
    }

    public int sum1(){
        return i + 10;
    }
}

class BB extends AA{
    public int i = 20;
//    @Override
//    public int sum(){           如果没有这一段，main中第一个打印输出30
//        return getI() + 20;
//    }
    @Override
    public int getI(){
        return i;
    }
//    @Override                    如果没有这一段，main中第二个打印输出20
//    public int sum1(){
//        return i + 10;
//    }
}

