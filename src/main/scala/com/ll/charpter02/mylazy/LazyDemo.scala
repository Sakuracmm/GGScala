package com.ll.charpter02.mylazy

/**
  * @package com.ll.charpter02.mylazy
  * @Author LL
  * @ClassName LazyDemo
  * @Date 2019/8/21  9:27
  */
object LazyDemo {

  def main(args: Array[String]): Unit = {
    lazy val res = sum(10,20)
    println("-------------")
    println("res = " + res)  //在要使用res前，才执行
  }
  def sum(m1: Int, m2: Int): Int = {
    println("sum()执行了...")
    return m1+m2
  }

}
