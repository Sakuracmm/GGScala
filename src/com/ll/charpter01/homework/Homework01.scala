package com.ll.charpter01.homework

import util.control.Breaks._
/**
  * @package com.ll.charpter01.homework
  * @Author LL
  * @ClassName Homework01
  * @Date 2019/8/20  14:13
  */
object Homework01 {
  def main(args: Array[String]): Unit = {
    /**
      * 100以内的整数求和，求出当和第一次大于20的当前数
      */
    var sum = 0
    breakable {
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20) {
          printf("第一次和大于20的当前数为：%d 当前和为：%d",i,sum)
          break()
        }
      }
    }

    println()
    //除了上面的break机制来中断，也可以使用循环守卫实现中断效果
    println("====================================")
    var loop = true
    var sum2 = 0
    for(i <- 1 to 100 if loop){
      sum2 += i
      if(sum2 > 20){
        println("break!")
        loop = false
        printf("第一次和大于20的当前数为：%d 当前和为：%d",i,sum2)
      }
    }
  }

}
