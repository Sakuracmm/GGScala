package com.ll.charpter09

object MatchList {
  def main(args: Array[String]): Unit = {
    for (list <- Array(List(0),List(1,0),List(0,0,0),List(88),List(1,0,0))){
      val res = list match {
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " " + y
        case x :: Nil => x
        case 0 :: tailxx => "0 ..."
        case _ => "something else"
      }
      println("res = " + res)
      /**
        * res = 0
        * res = 1 0
        * res = 0 ...
        * res = 88
        * res = something else
        */
    }
    //如果要匹配List(88)这样的只含有一个元素的列表，并原值返回

  }

}
