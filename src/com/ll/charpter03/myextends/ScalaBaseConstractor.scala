package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName ScalaBaseConstractor
  * @Date 2019/8/22  10:29
  */
object ScalaBaseConstractor {
  def main(args: Array[String]): Unit = {
    //分析一下执行流程
    /**
      * 1. 因为scala遵守先构造父类部分 extends Person2
      * 2. Person...
      * 3. 父类中的辅助构造器！
      * 4. Emp ....（Emp2的主构造器）
      * 5. Emp 辅助构造器~
      */
    val emp = new Emp2("Alice")
    println("=========================")
    val emp2 = new Emp2()
  }
}

//父类Person
class Person2(inName: String) {
  var name = inName
  println("Person ...")
  def this(){
    this("默认的名字")
    println("父类中的辅助构造器！")
  }
}
class Emp2 extends Person2(){
  println("Emp ...")

  //辅助构造器
  def this(name:String){
    this  //必须调用主构造器
    this.name = name
    println("Emp 辅助构造器")
  }
}
