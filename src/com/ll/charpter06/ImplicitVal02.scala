package com.ll.charpter06

object ImplicitVal02 {
  def main(args: Array[String]): Unit = {
    //test01
    implicit val name: String = "Scala"
//    implicit val name2: String = "Linus"

    //隐式参数
    def hi(implicit content: String="jack"): Unit = {
      println("Hello " + content)
    }
    //调用hi
    hi      //hello Scala
  }
}
