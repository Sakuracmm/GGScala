//package com.ll.charpter03.homework
//
///**
//  * @package com.ll.charpter03.homework
//  * @Author LL
//  * @ClassName Exercise03
//  * @Date 2019/8/21  11:44
//  */
//object Exercise03 {
//
//  def main(args: Array[String]): Unit = {
//    //定义List集合
//    val list = List(1,2,3)
//    println(list)
//    println(list.reverse)
//    println(1 to 10)
//    println((1 to 10) reverse)
//    for( i <- 1 to 10 reverse){
//      print(i + " ")
//    }
//    println("\n-----------")
//    countDown(5)
//    println()
//    countDown2(10)
//  }
//
//  def countDown(n: Int): Unit = {
//    for(i <- 0 to n reverse){
//      print(i + " ")
//    }
//  }
//
//  def countDown2(n: Int): Unit = {
//    //这里我们使用的第二种方式，使用到高阶函数的特性
//    //foreach
//    //foreach 函数（f: Int => U）,即接收一个输入参数为Int,输出为U的函数
//    //说明
//    //1. 将结合中的每个元素依次便利出来，传递给print
//    (1 to n).reverse.foreach(printArr)
//  }
//
//  def printArr(n:Int):Unit = {
//    print(n + " * ")
//  }
//}
