package com.ll.charpter03.oop

/**
  * @package com.ll.charpter03.oop
  * @Author LL
  * @ClassName MemState
  * @Date 2019/8/21  11:35
  */
object MemState {
  def main(args: Array[String]): Unit = {
    val p1 = new Person2
    p1.name = "jack"
    p1.age = 10

    val p2 = p1
    println(p2 == p1)
    println("p2.name = " + p2.name) //jack
    p1.name = "Alice"
    println("p2.name = " + p2.name )  //Alice
  }
}
class Person2{
  var name = " "
  var age: Int = _    //如果是用_方式给默认值，则属性必须制定类型
}
