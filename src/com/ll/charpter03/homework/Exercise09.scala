package com.ll.charpter03.homework

/**
  * @package com.ll.charpter03.homework
  * @Author LL
  * @ClassName Exercise09
  * @Date 2019/8/21  12:24
  */
object Exercise09 {

  def main(args: Array[String]): Unit = {
    println(mi(2,3))
  }

  def mi(x: Double, n: Int):Double = {
    if(n == 0 )
      1
    else if(n > 0)
      x * mi(x,n - 1)
    else
      1 / (x * mi(x, n - 1))
  }

}
