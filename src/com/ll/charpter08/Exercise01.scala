package com.ll.charpter08

object Exercise01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    println(names)    //List(Alice, Bob, Nick)
    val names2 = names.map( a => {
      a.toUpperCase
    })
    println(names2)   //List(ALICE, BOB, NICK)
    val names3 = names.map(f)
    println(names3)   //List(alice, bob, nick)
  }

  def f(s: String):String = {
    s.toLowerCase
  }
}
