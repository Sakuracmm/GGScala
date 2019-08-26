package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName Extends01
  * @Date 2019/8/22  9:22
  */
object Extends01 {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.name = "Alice"    //调用了student.name()   //这个方法是从Person哪里继承过来的
    student.showInfo()
    student.studying()
  }
}
class Person{ //person类
  var name: String = _
  var age: Int = _
  def showInfo(): Unit = {
    println("学生信息如下： ")
    println("名字： " + name + "\t 年龄： " + age)
  }
}

//Student类继承Person
class Student extends Person{
  def studying(): Unit = {
    //这里可以使用父类的东西
    println(this.name + "学习 scala 中 ... ")
  }
}
