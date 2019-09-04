package com.ll.charpter07

object ListDemo01 {
  def main(args: Array[String]): Unit = {

    //创建时直接分配元素
    //说明：
    //1. 在默认情况下引入的是scala.collection.immutable.List，即不可变
    //2, 如果需要使用可变的list，则 使用ListBuffer
    //3. List在package object scala做了  val List : scala.collection.immutable.List.type = { /* compiled code */ }
    //4. 空集合Nil // val Nil : scala.collection.immutable.Nil.type = { /* compiled code */ }
    val list01 = List(1,2,3,"hello")
    println(list01)

    //空集合
    val list02 = Nil
    println(list02)

    //访问List元素
    val value1 = list01(1)    //1是索引，List的索引从0开始

    val list03 = list01 :+ 3  //在list后面增加元素
    val list04 = "scala" +: list01  //在list前面追加元素
    println(list01)
    println(list03)
    println(list04)

    val list05 = List(1,2,3,"abc")
    //说明
    //  val list06 = 4 :: 5 :: 6 ::list05 :: Nil
    //1. lisr(List(1,2,3,"abc"))
    //2. list(6,List(1,2,3,"abc"))
    //3. list(5,6,List(1,2,3,"abc"))
    //4. list(4,5,6,List(1,2,3,"abc"))
    val list06 = 4 :: 5 :: 6 :: list05 :: Nil
    println(list06)   //List(4, 5, 6, List(1, 2, 3, abc))

    //这里的:::要求两边必须都是List
    val list07 = 4 :: 5 :: 6 :: list05 ::: Nil
    val list08 = 4 :: 5 :: 6 :: list05 ::: List(9)
    println(list07)   //List(4, 5, 6, 1, 2, 3, abc)
    println(list08)   //List(4, 5, 6, 1, 2, 3, abc, 9)

  }
}
