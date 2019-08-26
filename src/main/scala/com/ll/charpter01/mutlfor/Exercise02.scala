package com.ll.charpter01.mutlfor

/**
  * @package com.ll.charpter01.mutlfor
  * @Author LL
  * @ClassName Exercise02
  * @Date 2019/8/20  11:27
  */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    //打印九九乘法表
    //思路分析
    /**
      * （1）使用两层循环，有9行，每一行的列数在增加
      * （2）根据逻辑，我们可以编写代码
      */
    val num = 9
    for(i <- 1 to num){
      for(j <- 1 to i) {
        printf("%d * %d = %d \t",j , i ,j * i)
      }
      println()
    }
  }
}
