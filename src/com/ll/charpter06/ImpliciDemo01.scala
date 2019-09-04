package com.ll.charpter06

object ImpliciDemo01 {
  def main(args: Array[String]): Unit = {


    //编写一个隐式转换函数，将Double -> Int 转换
    //隐式函数应当在作用域才能生效
    //这里我们必须保证隐式函数的匹配只能是唯一的
    implicit def f1(d:Double): Int = {    //在底层生成f1$1
      d.toInt
    }
    implicit def f2(f: Float): Int = {
      f.toInt
    }

    val num: Int = 3.5    //底层编译 f1$1(3.5)
    val num2: Int = 4.6f
    println("num = " + num)
    println("num2 = " + num2)
  }
}
