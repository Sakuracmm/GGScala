package com.ll.charpter09

object MatchTypeDetail {
  def main(args: Array[String]): Unit = {
    val obj = 10
    val result = obj match {
      case a: Int => a
//      case b: Map[String, Int] => "Map 集合"    //compile error
      case _ => "啥也不是"
    }
  }
}
