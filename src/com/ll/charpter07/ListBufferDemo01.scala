package com.ll.charpter07

import scala.collection.mutable.ListBuffer

object ListBufferDemo01 {
  def main(args: Array[String]): Unit = {
    //创建listBuffer
    val list0 = ListBuffer[Int](1,2,3)
    //访问ListBuffer中的元素
    println("list0(2) = " + list0(2))   // list0(2) = 3
    for(item <- list0){   //遍历ListBuffer（有序）
      print(item + "\t")    // 1	2	3
    }
    println()
    //动态的增加元素，list1就会变化,增加一个一个的元素
    val list1 = new ListBuffer[Int] //声明一个空的ListBuffer
    println(list1)    //ListBuffer()
    list1 += 4
    list1.append(5)
    println(list1)    //ListBuffer(4, 5)

    //在list1原来的基础上将list0中的元素打散后增加到list1中
    list1 ++= list0
    println(list1)    // ListBuffer(4, 5)
    //在list0的基础上打散后增加list1
    val list2 = list0 ++ list1
    println(list2)    //ListBuffer(1, 2, 3, 4, 5, 1, 2, 3)
    //list0不会改变，list3为在list0的基础上加上5这个元素
    val list3 = list0 :+ 5    //ListBuffer(1, 2, 3, 5)
    println(list3)

    println("======删除元素========")
    println("list1 = " + list1)   //list1 = ListBuffer(4, 5, 1, 2, 3)
    //表示将下标为1的元素删除
    list1.remove(1)
    println(list1)    //ListBuffer(4, 1, 2, 3)
    val list = list1.drop(1)
    println(list)    //ListBuffer(1, 2, 3)
    val lisrr = list1.dropRight(2)
    println(lisrr)    //ListBuffer(4, 1)
    list1.dropInPlace(2)
    println(list1)  //ListBuffer(2, 3)

    println(list0)  //ListBuffer(1, 2, 3)
    println(list1)  //ListBuffer(2, 3)
    list0 ++= list1
    println(list0)  //ListBuffer(1, 2, 3, 2, 3)
    val list4 = list0 ++: list1
    println(list4)    //ListBuffer(1, 2, 3, 2, 3, 2, 3)
    val list5 = list1 :++ list0
    println(list5)    //ListBuffer(2, 3, 1, 2, 3, 2, 3)
    list0 ++=: list1
    println(list0)

  }
}
