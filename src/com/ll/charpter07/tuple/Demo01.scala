package com.ll.charpter07.tuple

object Demo01 {
  def main(args: Array[String]): Unit = {

    //创建
    //说明：1. tuple1就是一个Tuple   类型是Tuple4
    //简单说明，为了高效操作元组，编译器根据元素的个数的不同，对应不同的元组类型
    //分别从tuple1 ---> tuple22
    //说明2.
    val tuple1 = (2,3,"hello","Tuple")
    println(tuple1)

    /**
      * override def productElement(n : scala.Int) : scala.Any = { /* compiled code */ }
      * def _1 : T1
      * def _2 : T2
      * def _3 : T3
      * def _4 : T4
      * def _5 : T5
      */
    //访问元组
    val t1 = (1,"a","b",true,2)
    println(t1._2)  //访问数组的第二个元素，这种方式元组下标从1开始   //a
    println(t1.productElement(1)) //访问元组的第二个元素，这种访问方式从0开始   //a

    //元组的遍历
    for(item <- t1.productIterator){
      print(item + "\t")
    }



  }
}
