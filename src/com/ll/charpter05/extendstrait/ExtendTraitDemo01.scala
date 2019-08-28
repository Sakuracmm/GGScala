package com.ll.charpter05.extendstrait

object ExtendTraitDemo01 {
  def main(args: Array[String]): Unit = {
    println("Hhha")
  }
}

//说明
//1. LoggedException 继承了Exception
//2. LoggedException特助就可以使用Exception的功能
trait LoggedException extends Exception{
  def log():Unit = {
    println(getMessage)   //getMessage方法来源于Exception
  }
}

class UnhappyException extends LoggedException{
  override def getMessage = "错误消息"
}

class UnhappyException2 extends IndexOutOfBoundsException with LoggedException{
  override def getMessage: String = "错误消息2"
}   //ok

//class UnhappyException3 extends CC with LoggedException{
//  override def log(): Unit = "hello"
//} //error

class CC{

}