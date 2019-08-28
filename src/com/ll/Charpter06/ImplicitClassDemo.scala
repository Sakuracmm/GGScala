package com.ll.Charpter06

object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {
    //DB1会对应生成隐式类
    //DB1是一个隐式类，当我们在隐式类的作用域范围，创建MySQL1实例
    //该隐式类会生效
    //看底层...
    implicit class DB1(val m: MySQL1){  //ImplicitClassDemo$DB1$2
      def addSuffix(): String = {
        println(m + "Scala")
        m + "Scala"
      }
    }
    //创建一个MySQL1实例
    val mySQL1 = new MySQL1
    mySQL1.sayOk()
    mySQL1.addSuffix()    //研究 如何关联到DB1里面的addSuffix方法
  }
}

class DN1{}

class MySQL1{
  def sayOk(): Unit = {
    println("sayOk")
  }
}
