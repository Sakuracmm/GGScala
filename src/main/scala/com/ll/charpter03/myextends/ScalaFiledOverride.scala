package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName ScalaFiledOverride
  * @Date 2019/8/22  14:08
  */
object ScalaFiledOverride {
  def main(args: Array[String]): Unit = {
    val obj1: A = new B
    val obj2: B = new B
    //obj1.age => obj1.age()    //动态绑定机制
    //obj2.age => obj2.age()
    println("obj1.age = " + obj1.age + " \t obj2.age = " + obj2.age) // obj1.age = 20 	 obj2.age = 20
  }
}

class A {
  val age: Int = 10   //会生成public age()
}

class B extends A{
  override val age: Int = 20    //会生成public age()
}
