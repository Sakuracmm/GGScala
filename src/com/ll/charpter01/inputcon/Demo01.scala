package com.ll.charpter01.inputcon

import scala.io.StdIn

/**
  * @package com.ll.charpter01.inputcon
  * @Author LL
  * @ClassName Demo01
  * @Date 2019/8/20  9:20
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 要求，可以从控制台；接收用户信息：【姓名年龄薪水】
      */
    println("请输入姓名： ")
    val name = StdIn.readLine()
    println("请输入年龄： ")
    val age = StdIn.readInt()
    println("请输入薪水： ")
    val sal = StdIn.readDouble()
    println(s"用户的信息为 name = $name 年龄为age = $age 薪水为 sal  = $sal")

    Cat.sayHi()
    Cat.sayHello()
  }

}

//声明了一个对象（伴生对象）
object Cat extends AAA{
  def sayHi(): Unit = {
    println("汪汪汪！")
  }
}

trait AAA{  //AAA是特质，等价于java中的interface + abstract class
  def sayHello(): Unit = {
    println("AAA sayHello")
  }
}