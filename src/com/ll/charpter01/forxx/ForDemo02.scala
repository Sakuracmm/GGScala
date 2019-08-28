package com.ll.charpter01.forxx

/**
  * @package com.ll.charpter01.forxx
  * @Author LL
  * @ClassName ForDemo2
  * @Date 2019/8/20  10:42
  */
object ForDemo02 {

  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3; j = i * 2){
      print(j + " ")
    }
    println()
    println("===========================")
    //等价于
    for{
      i <- 1 to 3
      j = i * 2}{
      print(j + " ")
    }
  }

}
