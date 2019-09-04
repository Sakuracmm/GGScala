package com.ll.charpter08

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    val res1 = list.reduceLeft((a,b) => {
      a - b
    })
    println(res1)   //-13
    val res2 = list.reduceRight((a,b) => {
      a - b
    })
    println(res2) //3
    val res3 = list.reduce((a, b) => {
      a - b
    })
    println(res3) //-13

    val res4 = list.reduce((a, b) => {
      if(a>b)
        b
      else
        a
    })
    println(res4)   //1

    val res5 = list.reduceLeft(_+_)
    println(res5)   //15
    val res6 = list.reduceLeft(_-_)
    println(res6)   //-13
  }
}
