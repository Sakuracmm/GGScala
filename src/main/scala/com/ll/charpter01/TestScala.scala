package com.ll.charpter01

/**
  * @package com.ll.charpter01
  * @Author LL
  * @ClassName TestScala
  * @Date 2019/8/9  15:25
  */
object TestScala {

  def main(args: Array[String]): Unit = {
    val x:Int = 3

    var str1: String = "hello"
    var str2: String = "scala"
    println(str1 + str2)
    var name: String = "tom"
    var age: Int = 10
    var sal: Float = 10.67f
    var height: Double = 180.15
    //格式化输出
    printf("名字=%s 年龄是%d 薪水是%.2f 身高是%.3f \n",name, age,sal, height)
    //格式化输出
    println(s"hello scala $x")

  }

  /**
    * @description 整数求和
    * @example
    *          input 1,2  output 3
    * @param n1 参数1
    * @param n2 参数2
    */
  def sum(n1: Int, n2: Int): Unit ={
    n1 + n2
  }



}
