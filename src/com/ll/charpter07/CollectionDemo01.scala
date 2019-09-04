package com.ll.charpter07

object CollectionDemo01 {
  def main(args: Array[String]): Unit = {
    val str: String = "hello"
    for(item <- str){
      println(item)
    }
    println(str(2))
  }
}
