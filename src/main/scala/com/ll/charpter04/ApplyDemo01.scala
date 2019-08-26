package com.ll.charpter04

/**
  * @package com.ll.charpter04
  * @Author LL
  * @ClassName ApplyDemo01
  * @Date 2019/8/22  16:33
  */
object ApplyDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,5)
    println(list)

    val pig = new Pig("小猪")

    //使用apply方法创建对象
    val pig2 = Pig("小黑猪")
    val pig3 = Pig()

    println("pog2.name = " + pig2.name)
    println("pig3.name = " + pig3.name)
  }
}
//案例演示apply方法
class Pig(pName: String) {
  var name: String = pName
}
object  Pig{
  //编写一个apply
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名^(*￣(oo)￣)^")
}