package com.ll.charpter09

import scala.collection.mutable.ArrayBuffer

object MatchArr {
  def main(args: Array[String]): Unit = {
    val arrs = Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0),Array(1,1,0,1));
    for(arr <- arrs){
      val result = arr match{
        case Array(0) => "0"
        case Array(x,y) => x  + "=" + y
        case Array(0,_*) => "以0开头的数组"
        case _ => "什么都不是"
      }
      println("result = " + result)
      /**
        * result = 0
        * result = 1=0
        * result = 以0开头的数组
        * result = 什么都不是
        * result = 什么都不是
        */
      //有一个数组集合，如果里面的元素是Array(x,y)类型，那么把他变为Array(y,x)
      val arrs2 = Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0),Array(1,1,0,1));
      for(arr <- arrs2){
        val res = arr match {
          case Array(x,y) => ArrayBuffer(y,x)
          case _ => "不进行处理"
        }
        println("res = " + res)

        /**
          * res = 不进行处理
          * res = ArrayBuffer(0, 1)
          * res = 不进行处理
          * res = 不进行处理
          * res = 不进行处理
          */
      }
    }
  }
}
