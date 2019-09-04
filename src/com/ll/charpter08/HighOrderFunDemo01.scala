package com.ll.charpter08

object HighOrderFunDemo01 {
  def main(args: Array[String]): Unit = {
    //使用高阶函数
    val res = test(sum, 3.5)
//    val res = test(sum _, 3.5)
    println(res)

    //在scala中，可以把一个函数直接赋给一个变量
    val f1 = myprint
    //这样的话就不会执行这个函数，只会把这个函数的签名赋给这个变量
    val f2 = myprint _
    f2      //不执行
    f2()    //执行
  }

  def myprint(): Unit = {
    println("hello scala!")
  }

  //说明
  //1. test是一个高阶函数
  //2. f: Double => Double 表示一个函数， 该函数可以接受一个Double，并且返回一个Double
  //3. n1: Double是一个普通参数
  //4. f(n1) 在test函数中执行你传入的函数
  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  //普通的函数
  def sum(d: Double): Double ={
    println("sum被调用")
    d + d
  }
}