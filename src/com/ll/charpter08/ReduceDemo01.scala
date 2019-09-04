package com.ll.charpter08

object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * val list = List(1, 20, 30, 4 ,5) , 求出list的和.
      */

    val list = List(1,20,30,4,5)
    val res1 = list.reduceLeft((a, b) => {
      a + b
    })
    println(res1)    //60
    val res2 = list.reduceLeft(sum)
    println(res2)
    println("Ali" + "ce") //Alice

    val list1 = List("Scala ","is ","a ","beautiful ","language! ")
    val str1 = list1.reduce((s1, s2) => {
      s1 + s2
    })
    println(str1)   //Scala is a beautiful language!

    val str2 = list1.reduce(append)
    println(str2)   //Scala is a beautiful language!

    val str3 = list1.reduceRight((s1,s2) => {
      s1 + s2
    })
    println(str3)   //Scala is a beautiful language!

    val res3 = list.reduceLeft((x,y) => {
      x - y   //-58
    })
    println(res3)
    val res4 = list.reduceRight((x,y) => {
      x - y   //12
    })
    println(res4)
    val res5 = list.reduceLeft((x,y) => {
      y - x   //12
    })
    println(res5)
    val res6 = list.reduceRight((x,y) => {
      y - x //-50
    })
    println(res6)
  }

  def sum(m: Int, n:Int):Int = {
    m + n
  }

  def append(s1: String,s2: String): String = {
    s1 + s2
  }
}
