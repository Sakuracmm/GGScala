package com.ll.charpter09

object MatchTypeDemo01 {
  def main(args: Array[String]): Unit = {
    val a = 7
    //说明obj实例的类型根据a的值来返回
    val obj = if(a == 1) 1
    else if(a == 2) "2"
    else if(a == 3) BigInt(3)
    else if(a == 4) Map("aa" -> 1)
    else if(a == 5) Map(1 -> "aa")
    else if(a == 6) Array(1,2,3)
    else if(a == 7) Array("aa",1)
    else if(a == 8) Array("aa")
    println("obj = " + obj.toString)

    println(" =====  = = == == = = == = == = == = == = =")
    //说明
    //1. 根据obj的类型来匹配  返回值
    //2. 可以避免isInstanceOf或者asInstanceOf的使用
    val result = obj match {
      case a: Int => a
      case b: Map[String,Int] => "对象是一个字符串-数字的集合"
      case c: Map[Int, String] => "对象是一个数字-字符串的集合"
      case d: Array[String] => "对象是一个字符串类型的数组"
      case e: Array[Int] => "对象是一个数字数组"
      case f: BigInt => Int.MaxValue
      case g: Array[Any] => "对象是一个Any类型的数组"
      case _ => "啥也不是"
    }
    println("result = " + result) //result = 对象是一个Any类型的数组
  }
}
