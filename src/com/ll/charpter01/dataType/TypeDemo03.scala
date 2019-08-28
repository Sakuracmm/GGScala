package com.ll.charpter01.dataType

/**
  * @package com.ll.charpter01.dataType
  * @Author LL
  * @ClassName TypeDemo3
  * @Date 2019/8/19  15:34
  */
object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("long的最大值： " + Long.MaxValue + "Long的最小值： " + Long.MinValue)

    var i = 10 //Int
    var j = 1000L //Long
    println(i.isInstanceOf[Int])
    println(j.isInstanceOf[Long])
  }
}
