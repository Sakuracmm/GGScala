package com.ll.charpter02.fundetails

/**
  * @package com.ll.charpter02.fundetails
  * @Author LL
  * @ClassName VarParameters
  * @Date 2019/8/21  9:02
  */
object VarParameters {
  def main(args: Array[String]): Unit = {
    //编写一个函数sum，可以求出1到多个int的和
    println(sum(1,2,3,4,5))// 4 14
  }
  def sum(n1:Int, args: Int*): Int ={
    println("args.length = " + args.length)
    //遍历
    var sum = n1
    for(item <- args){
      sum += item
    }
    sum
  }
}

object Hello01{
  def main(args: Array[String]): Unit = {
    def f1 = "vernassa"
    println(f1)
  }
  def f1 = "vernassa"
  //等价于
  def f2() = {
    "vernassa"
  }
}

