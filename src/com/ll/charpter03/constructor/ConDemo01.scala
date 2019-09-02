package com.ll.charpter03.constructor

/**
  * @package com.ll.charpter03.constor
  * @Author LL
  * @ClassName ConDemo01
  * @Date 2019/8/21  14:15
  */
object ConDemo01 {
  def main(args: Array[String]): Unit = {
    var p1 = new Person("Jack",20)
    println(p1)

    var A = new A
    var A2 = new A()
  }
}

//构造器快速入门
//创建Person对象的同时初始化对象的age属性和那么属性值
class Person(inName:String, inAge: Int){
  var name:String = inName
  var age:Int = inAge

  override def toString: String = {
    "name = " + this.name + "\t age = " + this.age
  }

  def this(name:String){
    //辅助构造器，必须在第一行显式的调用主构造器
    this("jack",10)
    //this//error
    this.name = name  //重新赋值
  }
}

class A(){

}
