package com.ll.charpter08

object ScanDemo01 {
  def main(args: Array[String]): Unit = {
    //普通函数
    def minus(num1: Int, num2: Int) :Int = {
      num1 - num2
    }

    val list1 = (1 to 5).scanLeft(5)(minus)
    println("list1 = " + list1) //list1 = Vector(5, 4, 2, -1, -5, -10)

    val list2 = (1 to 5).scanRight(5)((n:Int,m:Int) => {
      m + n
    })
    println("list2 = " + list2) //list2 = Vector(20, 19, 17, 14, 10, 5)
  }
}
