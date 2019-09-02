package com.ll.charpter01.mybreak

import util.control.Breaks._
/**
  * @package com.ll.charpter01.mybreak
  * @Author LL
  * @ClassName WhileBreak
  * @Date 2019/8/20  13:53
  */
object WhileBreak {

  def main(args: Array[String]): Unit = {
    var n = 1
    //breakable()函数，注意引用相关的包
    //说明
    //1.breakable是一个高阶函数，可以接收函数的函数就是高阶函数
    /**
      * def breakable(op: => Unit) {
      *   try {
      *     op
      *   } catch {
      *     case ex: BreakControl =>
      *     if (ex ne breakException) throw ex
      *   }
      * }
      * (1)op: => Unit表示接收的就是一个没有输入，也没有返回值的函数，可以理解为一个代码块
      * (2)可以简单的理解breakable()可以接收一段代码块
      * (3)breakable 对break()抛出的异常做出了处理，代码就可以正常执行，现在ok就可以正常输出
      * (4)当传入的是代码块时，scala程序员会将小括号改成大括号
      */
    breakable {
      while (n <= 20) {
        n = n + 1
        if (n == 18) {
          //中断while循环
          //说明
          //1.在Scala中使用函数式的break函数中断循环
          //2.def break():nothing = {throw breakException }
          break()
        }
        print("n = " + n + " ")
      }
    }
    println()
    println("ok~")

    //注意break函数，可以使用在for循环或者do...while
    breakable {
      for (i <- 1 to 100) {
        if (i == 20) {
          println("break!")
          break()
        }
        println(" i = " + i)
      }
    }
    println("ok2 ~ ~ ~")
  }
}
