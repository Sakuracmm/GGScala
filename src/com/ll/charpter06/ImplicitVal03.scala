package com.ll.charpter06

object ImplicitVal03 {
  def main(args: Array[String]): Unit = {
//    implicit val str1: String = "Candy"
    //说明
    //当一个隐式参数匹配不到隐式值，仍然会使用默认值，而不会去匹配
    implicit val num1: Int = 10
    def hello(implicit content: String = "Alice"): Unit = {
      println("hello，" + content)
    }
    hello

    def hello2(implicit content: String): Unit = {
      println("Hello2: " + content)
    }
//    hello2//error
  }
}
