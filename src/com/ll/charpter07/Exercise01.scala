package com.ll.charpter07

object Exercise01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,"abc")
    val list2 = 4 :: 5 :: 6 :: list1 :: list1 :: Nil
    val list3 = 4 :: 5 :: 6 :: list1
    println(list2)    //  List(4, 5, 6, List(1, 2, 3, abc), List(1, 2, 3, abc))
    println(list3)    //  List(4, 5, 6, 1, 2, 3, abc)
    val list4 = 4 :: 5 :: 6 :: list1 ::: list1 ::: Nil
    println(list4)  //List(4, 5, 6, 1, 2, 3, abc, 1, 2, 3, abc)
    val list5 = 4 :: 5 :: 6 :: list1 :: list1 ::: Nil       // List(4, 5, 6, (1, 2, 3, abc), 1, 2, 3, abc)  或者  List(4, 5, 6, 1, 2, 3, abc, 1, 2, 3, abc)
    println(list5)    // List(4, 5, 6, (1, 2, 3, abc), 1, 2, 3, abc)
    val list6 = "scala" +: list1
    val list7 = list1 :+ true
    println(list6)    //  List(scala, 1, 2, 3, abc)
    println(list7)    // List(1, 2, 3, abc, true)
    val list8 = list1.drop(1)
    println(list8)    //  List(2, 3, abc)
    val list9 = list1.dropRight(1)
    println(list9)    //  List(1, 2, 3)
  }
}
