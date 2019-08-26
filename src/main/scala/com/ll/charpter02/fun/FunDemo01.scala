package com.ll.charpter02.fun

/**
  * @package com.ll.charpter02.fun
  * @Author LL
  * @ClassName FunDemo01
  * @Date 2019/8/20  15:27
  */
object FunDemo01 {

  def main(args: Array[String]): Unit = {

    val n1 = 10
    val n2 = 20
    println("res = " + getRes(n1,n2,')'))
  }

  //定义函数/方法
  def getRes(n1: Int, n2: Int, oper: Char) = {
    if(oper == '+'){
      n1 + n2
    }else if (oper == '-'){
      n1 - n2
    }else{
      //返回一个null
      null
    }
  }

}
