package com.ll.charpter07

object MultiplyArray {
  def main(args: Array[String]): Unit = {

    //创建
    val arr = Array.ofDim[Int](3,4)

    //遍历
    for(item1 <- arr){
      for(itemm2 <- item1){   //  取出二维数组的各个元素（一维数组）
        print(itemm2 + "\t")    //    遍历取到的一维数组（遍历）
      }
      println()
    }

    println("===============")
    //取出指定位置元素
    println(arr(1)(1))
    //修改值
    arr(1)(1) = 100
    //遍历
    for(item1 <- arr){
      for(itemm2 <- item1){   //  取出二维数组的各个元素（一维数组）
        print(itemm2 + "\t")    //    遍历取到的一维数组（遍历）
      }
      println()
    }

    println("===============")
    for(i <- 0 until arr.length){
      for(j <- 0 until arr(0).length){
        printf("arr[%d][%d] = %d \t",i,j,arr(i)(j))
      }
      println()
    }
  }
}
