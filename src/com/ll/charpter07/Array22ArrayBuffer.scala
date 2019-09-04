package com.ll.charpter07

import scala.collection.mutable.ArrayBuffer

object Array22ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr2 = ArrayBuffer[Int]()
    //追加值
    arr2.append(1,2,3)
    println(arr2)   //  ArrayBuffer(1, 2, 3)

    //说明
    //1. arr2.toArray 调用arr2 的方法toArray
    //2. 将ArrayBuffer ---> Array
    //3. arr2本省没有任何变化
    val newArr = arr2.toArray
    println(newArr) // [I@7ca48474  --> Array类型

    //说明
    //1. newArr.toBuffer 是把Array -> ArrayBuffer
    //2. 底层实现
    /**
      * override def toBuffer[A1 >: A]: mutable.Buffer[A1] = {
      *   val result = new mutable.ArrayBuffer[A1](size)
      *   copyToBuffer(result)
      *   result
      * }
      */
    //newArray2 本身没有变化
    val newArr2 = arr2.toBuffer
    newArr2.append(123)
    println(newArr2)  //   ArrayBuffer(1, 2, 3, 123)
  }
}
