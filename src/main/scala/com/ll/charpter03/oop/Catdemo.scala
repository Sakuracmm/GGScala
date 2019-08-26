package com.ll.charpter03.oop

/**
  * @package com.ll.charpter03.oop
  * @Author LL
  * @ClassName Catdemo
  * @Date 2019/8/21  10:20
  */
object Catdemo {
  def main(args: Array[String]): Unit = {

    //创建一只猫
    val cat = new Cat

    //给猫的属性赋值
    //说明
    //1. cat.name = "小猫" 其实不是直接访问属性，而是 cat.name_$eq("小白")
    //2. cat.name 等价于 cat.name()
    cat.name = "小猫"
    cat.age = 10
    cat.color = "White"

    printf("\n小猫信息如下：%s %d %s", cat.name, cat.age, cat.color)
  }
}

//定义一个类Cat
//这里一个class Cat对应的字节码文件只有一个Cat.class
class Cat{
  //定义/声明三个属性
  //说明
  //1.当我们声明了var name: String时，在底层对应private name
  //2. 同时会生成两个public方法 name()  <==类似于==> getter
  //                            public name_$eq()     <==类似于==> setter
  var name: String = " "    //给定初始值
  var age: Int = _ // _表示给age 一个默认的值，如果是Int，默认值是0
  var color: String = _ // _给color默认值，如果是String，默认值是""
}
