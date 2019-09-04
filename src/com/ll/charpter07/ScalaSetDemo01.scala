package com.ll.charpter07

import scala.collection.mutable

object ScalaSetDemo01 {
  def main(args: Array[String]): Unit = {
    val set1 = Set(1,2,3,4,"Alice",true)//默认是不可变的
    println(set1)   //HashSet(1, true, 2, 3, Alice, 4)
//    set1.add("Bob") //error没有这个方法

    val set2 = mutable.Set(1,2,3,4,"Alice",true)//默认是不可变的
    set2.add("Bob")
    println(set2)   //HashSet(1, 2, 3, 4, Bob, Alice, true)

    set2 += ("Candy")
    set2.+=("Eric")
    set2 -= ("David")   //如果集中没有此元素，那么既不删除，也不报错
    set2 -= 2
    set2 .remove(3)
    println(set2)   //HashSet(1, 4, Bob, Eric, Alice, Candy, true)

    println()
    //set集的遍历操作
    for(item <- set2){
      print(item + "\t")    //1	4	Bob	Eric	Alice	Candy	true
    }

    //set中的最大值
    val set3 = mutable.Set(1,23,423,33)
    println(set3.max)   //423
    println(set3 max)   //423
  }
}
