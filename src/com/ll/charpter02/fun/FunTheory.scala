package com.ll.charpter02.fun

/**
  * @package com.ll.charpter02.fun
  * @Author LL
  * @ClassName FunTheory
  * @Date 2019/8/20  15:33
  */
object FunTheory {
  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 3
    val res = sum(n1 ,n2)
    println(res)
  }
  def sum(n1: Int, n2: Int) = {
    n1 + n2
  }

  val subtract = (n1: Int, n2: Int) => {
    n1 - n2
  }
}
