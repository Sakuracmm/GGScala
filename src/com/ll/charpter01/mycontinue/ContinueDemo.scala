package com.ll.charpter01.mycontinue

/**
  * @package com.ll.charpter01.mycontinue
  * @Author LL
  * @ClassName ContinueDemo
  * @Date 2019/8/20  14:06
  */
object ContinueDemo {
  def main(args: Array[String]): Unit = {
    //说明
    //1. 1 to 10
    //2. 循环守卫,当if后面的条件为真时才会执行循环体中的代码
    for(i <- 1 to 10 if i != 2 && i != 3){
      println("i = " + i )
    }

    //等价于
    for(i <- 1 to 10){
      if(i != 2 && i != 3){
        println("i = " + i)
      }
    }
  }

}
