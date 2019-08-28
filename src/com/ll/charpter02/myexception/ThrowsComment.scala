package com.ll.charpter02.myexception

/**
  * @package com.ll.charpter02.myexception
  * @Author LL
  * @ClassName ThrowsComment
  * @Date 2019/8/21  10:05
  */
object ThrowsComment {
  def main(args: Array[String]): Unit = {
    f()
  }
  @throws(classOf[NumberFormatException])   //等同于Java NumberFormatException.class
  def f()={
    "abc".toInt
  }
}
