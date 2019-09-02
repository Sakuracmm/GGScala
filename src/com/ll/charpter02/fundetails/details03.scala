package com.ll.charpter02.fundetails

/**
  * @package com.ll.charpter02.fundetails
  * @Author LL
  * @ClassName detail03
  * @Date 2019/8/20  17:03
  */
object details03 {

  def main(args: Array[String]): Unit = {
    def f1():Unit = { //ok private final
      println("f1")
    }
    def sayOk():Unit = {    //private final sayOk$1()
      println("main here ok !")
      def sayOk(): Unit = {   //private final sayOk$2()
        println("sayok sayok")
      }
    }
    println("ok~~")
  }
  def sayOk(): Unit ={    //成员 sayOk
    println("main sayOK")
  }

}
