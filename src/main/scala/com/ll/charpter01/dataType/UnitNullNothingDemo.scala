package com.ll.charpter01.dataType

/**
  * @package com.ll.charpter01.dataType
  * @Author LL
  * @ClassName UnitNullNothingDemo
  * @Date 2019/8/19  16:20
  */
object UnitNullNothingDemo {
  def main(args: Array[String]): Unit = {

    val res = sayHello()
    println("res = " + res)
  }

  //Unit等价于java的void，只有一个实例值()
  def sayHello(): Unit = {

  }

  val dog: Dog = null
//  val char1: Char = null  //error  Error:(22, 21) an expression of type Null is ineligible for implicit conversion
  println("ok~~~")
}

class Dog{

}
