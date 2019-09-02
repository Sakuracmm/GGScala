package com.ll.charpter03.scalapackage.visit

/**
  * @package com.ll.charpter03.scalapackage.visit
  * @Author LL
  * @ClassName TestVisit
  * @Date 2019/8/21  18:46
  */
object TestVisit {
  def main(args: Array[String]): Unit = {
    val c = new Clerk()
    c.showInfo()
    println("---------------------")
    Clerk.test(c)
    println("---------------------")
    val p1 = new Person
    println(p1.name)
    println(p1.job)
  }
}

//类
class Clerk(){
  var name: String = "jack"   //在底层会生成一个可读的方法，同时也会生成一个可写的方法
  private var sal: Double = 9999.9

  def showInfo(): Unit = {
    //在本类中可以使用私有的
    println(" name = " + name + " sal = " + sal)
  }
}

//当一个文件中出现了class clerk 和 object clerk
//1、class clerk称之为伴生类
//2、object clerk称之为伴生对象
//3、因为scala设计者将static关键字拿掉了，就设计出伴生类和伴生对象的概念
//4、伴生类，写非静态的内容 伴生对象 就是静态内容
//5、伴生对象中可以访问私有属性
object Clerk{
  def test(c: Clerk): Unit = {
    //这里体现出伴生对象中，可以访问c.sal
    println("test() name = " + c.name + " sal = " + c.sal)
  }
}

class Person {
  //这里我们增加一个包访问权限
  //下面private[visit]:1、仍然是private
  // 2、在visit包下【包括其子包】也可以使用name属性，相当于扩大了访问范围
  private[visit] val name = "jetty"
  protected[visit] val job = "worker"
}
