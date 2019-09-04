package com.ll.charpter07

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {

    val arr01 = ArrayBuffer[Any](3,2,6)
    //遍历
    for(i <- arr01){
      print(i + "  ") //  3  2  6
    }

    //通过下标访问元素
    println("\n" + arr01.length + "  " + arr01(1))  //  3  2
    println("arr01.hash = " + arr01.hashCode())   //   arr01.hash = -177166953

    //使用append追加数据，append支持可变参数
    //可以理解为java数组的扩容
    arr01.append(90.3,13)
    println("arr01.hash = " + arr01.hashCode())   //   arr01.hash = 347154682

    //修改其中一个元素
    arr01(1) = "Alice"
    println("arr01.hash = " + arr01.hashCode())   //   arr01.hash = 2020232967
    println("------------")
    for(i <- arr01){
      print(i + "  ")     //  3  Alice  6  90.3  13
    }

    //删除，根据下表删除
    arr01.remove(0)
    println("\n------------")
    for(i <- arr01){
      print(i + "  ")   //    Alice  6  90.3  13
    }
    println("\narr01.hash = " + arr01.hashCode())  //   arr01.hash = 595188335

    println("最新的长度 = " + arr01.length )   //    最新的长度 = 4


  }
}
