package com.ll.charpter01.forxx

/**
  * @package com.ll.charpter01.forxx
  * @Author LL
  * @ClassName ForExercise
  * @Date 2019/8/20  10:51
  */
object ForExercise {
  def main(args: Array[String]): Unit = {
    val start = 1
    val stop = 100
    var count = 0
    var sum = 0
    for(i <- start to stop){
      if(i % 9 == 0){
        count += 1
        sum += i
      }
    }

    println("count = " + count + " , sum = " + sum)

    //输出加法的循环表达式
    val num = 6
    for(i <- 0 to num){
      printf("%d + %d = %d\n", i, num - i, num )
    }
  }

  var list = List(1, 2, 3)

  

}
