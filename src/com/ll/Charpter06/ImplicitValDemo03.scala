package com.ll.Charpter06

object ImplicitValDemo03 {
  def main(args: Array[String]): Unit = {
    implicit val str1: String = "jack"  //这个就是隐式值
//    implicit val str2: String = "Alice"  //这个就是隐式值  //如果出现两个类型相同会报错
    implicit val str2: Int = 20  //这个就是隐式值  //如果出现两个类型不同不会报错

    //implicit val str1: String = "jack"    //这个就是隐式值
    def hello(implicit name:String) = {
      println("hello， " + name)
    }

    hello //底层 hello$1(str1)，使用隐式值不要带（）
//    hello() //error

  }
}
