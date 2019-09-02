package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName AbstactDetail
  * @Date 2019/8/22  14:47
  */
object AbstactDetail {
  def main(args: Array[String]): Unit = {
    //默认情况下，一个抽象类是不能实例化，但是在实例化时
    //动态的实现了实现了抽象类的所有方法是可以的，如下：
    val animal = new Animal03 {
      override def sayHello(): Unit = {
        println("say Hello~")
      }
      override var food: String = "fish"
    }
    animal.sayHello()
    val cat = new Cat
    cat.sayHello()
    println(cat.food)
  }

}

abstract class Animal02{
  //在抽象类中可以有实现的方法
  def sayHi(): Unit = {
    println("xxx")
  }
}
abstract class Animal03{
  def sayHello()
  var food: String
}

class Cat extends Animal03{
  override def sayHello(): Unit = {
    println("cat say Hello ~")
  }

  override var food: String = "meat!"
}
