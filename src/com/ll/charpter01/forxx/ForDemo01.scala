package com.ll.charpter01.forxx

/**
  * @package com.ll.charpter01.forxx
  * @Author LL
  * @ClassName ForDemo01
  * @Date 2019/8/20  10:18
  */
object ForDemo01 {

  def main(args: Array[String]): Unit = {
    var start = 1
    var stop = 10
    //to 前后闭合
    for(i <- start to stop){
      print("hello scala ! " + i + "   ")
    }
    println()

    //说明for这种推导时，也可以直接对集合进行遍历
    var list = List("hello",10,30,"tom")
    for(item <- list){
      println(item)
    }

    //until这种方式前闭后开
    for (i <- start until stop){
      print("hello linus ! " + i + "   ")
    }
    println()

    //循环守卫
    //也就是循环保护式，保护式为真时则进入循环体执行，为假时则跳过执行下一次循环
    for(i <- 1 to 3 if i != 2){
      print(i + " ")
    }
    println()
    //等价于
    for(i <- 1 to 3){
      if(i != 2){
        print(i + " ")
      }
    }
    println()
    //for循环时再引入变量
    for(i <- 1 to 3; j = 4 - i){
      print(j + " ")
    }
    println()
    println("------------")

    //嵌套循环
    for(i <- 1 to 3 ; j <- 1 to 3){
      println("i = " + i + ", j = " + j)
    }
    println("------------")
    //等价于
    for(i <- 1 to 3){
      for(j <- 1 to 3){
        println("i = " + i + ", j = " + j)
      }
    }
    println("------------")
    //循环返回，
    //1. 对1到10进行遍历，将每一次循环得到的i放入到集合Vector中再返回到res中
    //2. i在这里是一个代码块，这就意味着我们可以对i进行逻辑处理
    //体现出scala的一个重要的语法特点，擅长将集合中的各个数据进行处理再返回一个新的集合
    val res = for(i <- 1 to 10)
      yield
        {
          if(i % 2 == 0) {
            i * 2
          }else{
            "不是偶数"
          }
        }
    println(res)
    //将遍历过程中处理的结果返回到一个新的Vector集合中，使用关键字yield
  }

}
