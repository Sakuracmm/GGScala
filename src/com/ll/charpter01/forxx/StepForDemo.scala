package com.ll.charpter01.forxx

/**
  * @package com.ll.charpter01.forxx
  * @Author LL
  * @ClassName StepForDemo
  * @Date 2019/8/20  10:45
  */
object StepForDemo {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10){
      println("i = " + i)
    }
    //将步长控制为2
    println("#######")
    for(i <- Range(1, 10, 2)){
      println("i = " + i)
    }
    println("#######")
    //控制步长的第二种方法
    //控制守卫
    for(i <- 1 to 10 if i % 2 == 1){
      println("i = " + i)
    }
  }
}
