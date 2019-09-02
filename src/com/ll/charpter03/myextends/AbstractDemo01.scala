package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName AbstractDemo01
  * @Date 2019/8/22  14:44
  */
object AbstractDemo01 {
  def main(args: Array[String]): Unit = {
    println("xxx")
  }
}
//抽象类
abstract class Animal{
  var name: String  //抽象的字段
  var age: Int  //抽象的字段
  var color: String  = "black" //普通字段
  def cry() //抽象方法  不能用abstract标记
}


