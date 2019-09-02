package com.ll.charpter01.dataType

/**
  * @package com.ll.charpter01.dataType
  * @Author LL
  * @ClassName TypeDemo01
  * @Date 2019/8/19  15:02
  */
object TypeDemo01 {

  def main(args: Array[String]): Unit = {
    //数据类型
    //scala数据类型介绍
    //（1）Scala与java有着相同的数据类型，在Scala中数据类型都是对象，也就是说scala中没有java
    //中的那样原生对象，scala中一切皆对象
    //（2）Scala数据类型分为AnyVal(值类型)和AnyRef(引用类型)，注意不管是AnyVal还是AnyRef都是
    // 对象，都是Any的子类
    //（3）相对于java的类型系统，scala要复杂些！也正是因为这个复杂多变的类型系统使得函数式编程
    //和面向对象编程完美的融合在了一起

    //（1）在scala中有一个根类型，它是所有类的父类
    //（2）scala一切皆为对象，分为AnyVal和AnyRef(引用类型)两大类
    //（3）Null是scala的特别类型，它只有一个值，null，它是bottom class,是所有AnyRef的子类
    //（4）Nothing类型也是bottom class，它是所有类的子类，在开发过程中可以将Nothing类型的值
    // 返回给任意变量或者函数，这里抛出异常使用很多。
    //（5）在scala中仍然遵守低精度的值向高精度的值自动转换（implicit conversion）隐式转换


    var num1: Int = 10
    //因为Int是一个类，因此他的一个实例，就可以使用很多方法
    //Scala中如果一个方法没有形参，那么可以省略后面的扩号
    println(num1.toDouble + "\t" + num1.toString + "\t" + 100.toDouble)

    var isPass = true
    println(isPass.toString)

    sayHi
    sayHi()

  }
  def sayHi(): Unit = {
    println("hello scala")
  }
}
