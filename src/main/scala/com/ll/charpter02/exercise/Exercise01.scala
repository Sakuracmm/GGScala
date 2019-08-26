package com.ll.charpter02.exercise

/**
  * @package com.ll.charpter02.exercise
  * @Author LL
  * @ClassName Exercise01
  * @Date 2019/8/21  10:11
  */
object Exercise01 {

  def main(args: Array[String]): Unit = {
    print99(9)
  }
  //编写一个函数，输出99乘法表
  def print99(n:Int): Unit ={
    for (i <- 1 to n){
      for(j <- 1 to i){
        printf("%d * %d = %d \t\t", j, i, j * i)
      }
      println()
    }
  }

}
