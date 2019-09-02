package com.ll.charpter02.myexception

/**
  * @package com.ll.charpter02.myexception
  * @Author LL
  * @ClassName ExceptionDemo
  * @Date 2019/8/21  9:42
  */
object ExceptionDemo {
  def main(args: Array[String]): Unit = {
    try{
      val r = 10 / 0
    }catch {
      //说明
      //1. 在scala中只有一个catch
      //2. 在catch中有多个case,每个case可以匹配到一种异常case ex：ArithmeticException
      //3. =>关键符号，表示后面是对该异常处理代码块
      //4. finally最终要执行的
      case ax: ArithmeticException =>{
        println("捕获了除数为零的算数异常")
      }
      case ex: Exception => println("捕获了异常")
    }finally {
      //最终要执行的代码
      println("scala finally ...")
    }
  }
}
