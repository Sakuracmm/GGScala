package com.ll.charpter02.myexception

/**
  * @package com.ll.charpter02.myexception
  * @Author LL
  * @ClassName ThrowDemo
  * @Date 2019/8/21  9:57
  */
object ThrowDemo {
  def main(args: Array[String]): Unit = {
//    val res = test()
//    println(res.toString)
//    println("ok !") //不会处理

    //如果我们希望在test()抛出异常后，代码可以继续执行，则我们需要处理
    try{
      test()
    }catch {
      case ex: Exception => {
        println("捕获到一个异常： " + ex.getMessage)
        println("xxxx")
      }
      case ex: ArithmeticException => println("捕获到算术异常~~")  //范围小的异常放在范围大的异常没有意义
    }finally{

    }
    println("Ok !")

  }
  def test():Nothing = {
    throw new Exception("异常出现~")
  }

}
