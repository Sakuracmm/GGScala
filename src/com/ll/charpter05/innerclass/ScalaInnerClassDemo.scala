package com.ll.charpter05.innerclass

import com.ll.charpter05
import com.ll.charpter05.innerclass

object ScalaInnerClassDemo {
  def main(args: Array[String]): Unit = {
   //测试，创建两个外部类的实例
    val outer1: ScalaOuterClass = new ScalaOuterClass()
    val outer2: ScalaOuterClass = new ScalaOuterClass()

    //在scala中，创建成员内部类的语法
    //对象.内部类 的方式创建，这语法可以看出scala中，默认情况下，内部类实例和外部对象关联
    val inner1 = new outer1.ScalaInnerClass
    val inner2 = new outer2.ScalaInnerClass

    //测试一下使用inner1去调用info()
    inner1.info()
    inner2.info()

    //这里我们去调用test
    inner1.test(inner1)
    //在默认情况下，scala的内部类的实例和创建该内部类的外部对象实例关联的
    //
    inner1.test(inner2)
    inner2.test(inner2)

    //创建静态内部类的实例
    val staticInner = new charpter05.innerclass.ScalaOuterClass.ScalaStaticInnerClass()
  }
}

//外部类,内部类访问外部类属性的方法1，外部类名.this.属性名
//class ScalaOuterClass {
//  val name: String = "Alice"
//  private val sal: Double = 100.0
//  class ScalaInnerClass { //成员内部类，去访问
//    def info() = {
//      //访问方式：外部类名.this.属性名
//      //怎么理解ScalaOuterClass.this 就相当于是ScalaOuterClass这个外部类的一个实例
//      //然后通过ScalaOuterClass.this 实例对象去访问相关属性
//      //只是这种写法比较特别，学习java的的人可能更加容易理解ScalaOuterClass.class这种写法
//      println("name = " + ScalaOuterClass.this.name
//        + " sal = " + ScalaOuterClass.this.sal)
//    }
//  }
//}

//外部类,内部类访问外部类属性的方法2 使用别名的方式
//1. 将外部类属性，写在别名后面
class ScalaOuterClass {
  myOuter =>      //可以理解为，myouter就是外部类的一个别名 看做是外部类的一个实例
  class ScalaInnerClass { //成员内部类，去访问
    def info() = {
      //访问方式：外部类名.this.属性名
      //怎么理解ScalaOuterClass.this 就相当于是ScalaOuterClass这个外部类的一个实例
      //然后通过ScalaOuterClass.this 实例对象去访问相关属性
      //只是这种写法比较特别，学习java的的人可能更加容易理解ScalaOuterClass.class这种写法
      println("name = " + myOuter.name
        + " sal = " + myOuter.sal)
    }
    //这里有一个方法可以接收ScalaInnerclass实例
    //下面的ScalaOuterClass#ScalaInnerClass称为类型投影
    //作用是，屏蔽外部对象对内部类对象的影响
    def test(ic: ScalaOuterClass#ScalaInnerClass): Unit ={
      println("使用了类型投影：" + ic)
    }
  }
  val name: String = "Alice Brunce"
  private val sal: Double = 100.021
}

object ScalaOuterClass { //伴生对象
  class ScalaStaticInnerClass { //静态内部类

  }
}
