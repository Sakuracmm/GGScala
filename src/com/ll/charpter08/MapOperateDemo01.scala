package com.ll.charpter08

object MapOperateDemo01 {
  def main(args: Array[String]): Unit = {
//    要求：请将List(3,5,7) 中的所有元素都 * 2 ，将其结果放到一个新的集合中返回，即返回一个新的List(6,10,14), 请编写程序实现.
    val list1 = List(3,5,7)   //原始集合
    var list2 = List[Int]()   //新的集合，准备放入新的内容
    for(item <- list1){
      list2 = list2 :+ item * 2
//      list2 = item *2:: list2   //list2 = List(14, 10, 6)
    }
    println("list2 = " + list2)   //list2 = List(6, 10, 14)
  }
}
