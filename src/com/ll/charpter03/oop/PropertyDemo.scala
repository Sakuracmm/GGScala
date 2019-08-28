package com.ll.charpter03.oop

/**
  * @package com.ll.charpter03.oop
  * @Author LL
  * @ClassName PropertyDemo
  * @Date 2019/8/21  10:38
  */
object PropertyDemo {
  def main(args: Array[String]): Unit = {
    val p1 = new Person3
    println(p1.name)    //null
    println(p1.address) //String类型

    val A1 = new A
    println(A1.v1)
    println(A1.v2)
    println(A1.v3)
    println(A1.v4)

  }
}

class Person3{
  var age: Int = 10
  var sal  = 8090.0
  var name = null //name是什么类型
  var address: String = null //ok
}

class A{
  var v1: String = _    //null
  var v2: Byte = _    //0
  var v3: Double = _  //0.0
  var v4: Boolean = _ //false
}

class Worker{
  var name: String = _
}