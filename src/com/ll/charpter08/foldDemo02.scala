package com.ll.charpter08

object foldDemo02 {
  def main(args: Array[String]): Unit = {
    val list4 = List(1,9)
    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }
    val res1 = (1 /: list4)(minus)
    println(res1)
    val res2 = (list4 :\ 3)(minus) // ==> list4.foldRight(3)(List(1,9))
    println(res2)
  }
}
