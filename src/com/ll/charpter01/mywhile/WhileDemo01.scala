package com.ll.charpter01.mywhile

/**
  * @package com.ll.charpter01.mywhile
  * @Author LL
  * @ClassName WhileDemo01
  * @Date 2019/8/20  10:57
  */
object WhileDemo01 {

  def main(args: Array[String]): Unit = {
    //输出10句hello scala
    //定义循环变量
    var i = 0
    while(i < 10){
      println("hello scala " + i)
      //循环遍历迭代
      i += 1
    }
    println(" ========  ")
    //do while
    var j = 0
    do{
      println("hello scala " + j)
      j += 1
    }while(j < 10)
  }

}
