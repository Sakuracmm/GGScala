package com.ll.charpter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {
    //Scala集合和Java集合互相转换
    val arr = scala.collection.mutable.ArrayBuffer("1","2","3")
    import scala.collection.JavaConverters.asJava
    import scala.jdk.CollectionConverters
//    val javaArr = new ProcessBuilder(arr) //为什么可以这样使用
//    val arrList = javaArr.command()
//    println(arrList)    //
//
//    import scala.collection.JavaConverters.asScalaBuffer
//    import scala.collection.mutable
//    // java.util.List ==> Buffer
//    val scalaArr: mutable.Buffer[String] = arrList
//    scalaArr.append("jack")
//    println(scalaArr)

  }
}
