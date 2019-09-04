package com.ll.charpter08

object HighOrderFunDemo02 {
  def main(args: Array[String]): Unit = {
//    test2(sayHi())    //error type mismatch
//    test2(sayOK())  //error 这样的话会执行这个sayOK函数得到()再传给test2,导致type mismatch
    test2(sayOK)  //ok
//    val aaa = sayOK
//    test2(aaa)  //error  同上
    val bbb = sayOK _
    test2(bbb)    //ok
  }

  //说明test2是一个高阶函数，可以接收一个没有输入，返回值为Unit的函数
  def test2(f: () => Unit): Unit = {
    f()
  }
  def sayOK(): Unit = {
    println("sayOkOK ~")
  }
  def sayHi(name:String) = {
    println("hello " + name)
  }
}
