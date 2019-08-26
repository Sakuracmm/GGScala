package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName ScalaNoNamedemo02
  * @Date 2019/8/22  15:19
  */
object ScalaNoNamedemo02 {
  def main(args: Array[String]): Unit = {
    val fox = new Monster {
      override var name: String = "cute fox"

      override def cry(s: String): Unit = {
        println("It's a nice day! " + s )
      }
    }
    println(fox.name)
    fox.cry("Alice")
  }
}

abstract class Monster {
  var name: String

  def cry(s: String)
}
