package com.ll.charpter02.fundetails

/**
  * @package com.ll.charpter02.fundetails
  * @Author LL
  * @ClassName details02
  * @Date 2019/8/20  16:48
  */
object details02 {
  def main(args: Array[String]): Unit = {
    println(getSum2(1,1)) //()
  }
  //如果写了return,返回值的类型就不能省略
  def getSum(n1:Int, n2:Int): Int ={
    return n1 + n2
  }
  //如果返回值这里什么都没写，则表示该函数没有返回值
  //这时return无效
  def getSum2(n1:Int, n2:Int){
    return n1 + n2
  }
  def getSum3(n1:Int, n2:Int)= {
    n1 + n2
  }

  //如果函数明确声明无返回值（声明Unit）,那么函数体中即使使用return关键字也不会有返回值
  def getSum4(n1: Int, n2:Int): Unit = {
    return n1 + n2
  }
}
