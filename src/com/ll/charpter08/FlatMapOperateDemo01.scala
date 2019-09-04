package com.ll.charpter08

object FlatMapOperateDemo01 {
  def main(args: Array[String]): Unit = {
    //注意，每一个String都是一个Char集合
    val list = List("Alice","Camdy")
    var list2 = list.flatMap(s => {
      s.toUpperCase
    })
    println(list2)    //List(A, L, I, C, E, C, A, M, D, Y)
    var list3 = list.flatMap(s => {
      s
    })
    println(list3)    //List(A, l, i, c, e, C, a, m, d, y)
    val list4 = list.flatMap(lower1)
    println(list4)    //List(a, l, i, c, e, c, a, m, d, y)

    val list5 = List(List("hello","scala"),List("hello","Jack"))
    val list6 = list5.flatMap(lower2)
    println(list6)    //List(hello, scala, hello, jack)
    val list7 = list5.flatMap(lower2).flatMap(lower1)
    println(list7)    //List(h, e, l, l, o, s, c, a, l, a, h, e, l, l, o, j, a, c, k)
    val list8 = list5.flatMap(listItem => {
      listItem.map(s => {
        s.toUpperCase
      })
    })
    println(list8)    //List(HELLO, SCALA, HELLO, JACK)
  }

  def lower1(s: String): String = {
    s.toLowerCase
  }

  def lower2(s: List[String]): List[String]= {
    s.map(a => {
      a.toLowerCase
    })
  }
}
