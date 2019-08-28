package com.ll.charpter04.mytrait

/**
  * @package com.ll.charpter04.mytrait
  * @Author LL
  * @ClassName TraitDemo02
  * @Date 2019/8/23  9:17
  */
object TraitDemo02 {
  def main(args: Array[String]): Unit = {
    val c = new C
    val e = new E
    c.getConnect()
    e.getConnect()
  }
}
//按照要求定义一个trait
trait Trait01{
  //定义一个规范
  def getConnect()
}
class A{}
class B extends A{}
class C extends A with Trait01 {
  override def getConnect(): Unit = {
    println("连接mysql数据库")
  }
}

class D{}
class E extends D with Trait01 {
  override def getConnect(): Unit = {
    println("连接Oracle数据库")
  }
}
class F extends D{}