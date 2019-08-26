package com.ll.charpter03.scalapackage.hello

/**
  * @package com.ll.charpter03.scalapackage
  * @Author LL
  * @ClassName TestCat
  * @Date 2019/8/21  15:50
  */
object TestCat {

  def main(args: Array[String]): Unit = {
    //使用xh的Tiger
    val tiger1 = new com.ll.charpter03.scalapackage.xh.Cat
    //使用xm的Tiger
    val tiger2 = new com.ll.charpter03.scalapackage.xm.Cat
    println("tiger1 = " + tiger1 + "\n" + "tiger2 = " +  tiger2)
  }

}

class Employee{

}
