package com.ll.charpter09

object MatchVar {
  def main(args: Array[String]): Unit = {
    val ch = 'V'
    ch match {
      case '+' => println("ok~")
        //下面case mychar的含义是 mychar = ch
      case mychar => println("ok~" + mychar)    //ok~V
      case _ => println("ok !")
    }

    //match 是一个表达式，因此可以有返回值
    //返回值就是匹配到的代码块中的最后一句话
    var ch1 = '+'
    var res = ch1 match {
      case '+' => ch + " hello "
      case _ => println("ok~~~")
    }
    println("res = " + res) //res = V hello
  }
}
