package com.ll.charpter07

object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    //说明
    //1. 创建了一个Array对象
    //2. 【Int】表示泛型，即该数组中，只能存放Int
    //3. 【Any】表示在没有赋值的情况下，各个元素的值为0
    val arr01 = new Array[Int](10)    //底层是int[] arr01 = new int[10]
    println(arr01.length)

    println("arr01(0) = " + arr01(0))
    //数组的遍历
    for(i <- arr01){
      print(i + " ")
    }
    println("\n--------------")
    arr01(3) = 10
    for (i <- arr01){
      print( i + "  ")
    }

    //说明
    //1. 使用的是object Array的Apply方法
    //2. 直接初始化数组，这时因为你给了整数和""，这个数组泛型就是Any
    //3. 遍历方式一样
    println("\n-------------")
    var arr02 = Array(1,2,"Hello","Collection")
    for(item <- arr02){
      print(item + "  ")
    }
    println()
    for(index <- 0 until(arr02.length)){
      print(s"arr02($index) = ${arr02(index)}  ")
    }


  }
}
