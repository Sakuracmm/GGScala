package com.ll.charpter03.homework

/**
  * @package com.ll.charpter03.homework
  * @Author LL
  * @ClassName Exercise05
  * @Date 2019/8/21  11:59
  */
/**
  * 编写一个for循环，计算字符串中所有字母的Unicode代码（toLong方法）的
  * 乘积。举例来说，“hello”中所有字符串的乘积为9415087488L
  */
object Exercise05 {
  def main(args: Array[String]): Unit = {
    val v1: Long = getRes("Hello")
    print(v1)

    println("\n ----------------------- ")
    var res = 1L
    //说明
    //1.
    "Hello".foreach(res *= _.toLong)
    println("res = " + res)
    println("----------------")
    res = 1L
    "Hello".foreach(myCount)
    println("res = " + res)

    println("-----------------")
    res = 1L
    res = product("Hello")
    println(res)

    println("-----------------")
    res = 1L
    res = product2("Hello")
    println(res)


    def myCount(char: Char): Unit = {
      res *= char.toLong
    }
  }



  def getRes(input:String):Long = {
    var res:Long = 1L
    for(i <- input){
      res *= i.toLong
    }
    res
  }

  def product(s: String): Long = {
    var r: Long = 1L
    for(i <- s){
      r *= i.toLong
    }
    r
  }

  //递归
  def product2(s: String): Long = {
    //如果字符串长度为1，直接返回 s.charAt(0).toLong
    if(s.length == 1)
      s.charAt(0).toLong
    //如果不是 = 1，s.take(1)就是返回s的第一个字符
    //s.drop(1)就是返回s去除掉第一个字符后得到的字符串
    else
      s.take(1).charAt(0).toLong * product(s.drop(1))
  }
}

