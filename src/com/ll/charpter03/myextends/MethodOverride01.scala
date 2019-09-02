package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName MethodOverride01
  * @Date 2019/8/22  9:59
  */
object MethodOverride01 {
  def main(args: Array[String]): Unit = {
    val emp: Person1= new Person1 //Person printName() tom
    emp.printName()
    println(" !!!!!!!!!!!!!!!!!!! ")
    val emp2 = new Emp
    emp2.printName()//Emp printName() tom
                    //Person printName() tom
  }
}

class Person1{
  var name: String = "tom"
  def printName(): Unit ={
    println("Person printName() " + name)
  }
  def sayHi(): Unit ={
    println("sayHi ! ")
  }
}
class Emp extends Person1{
  //这里需要显式的使用override
  override def printName(): Unit = {
    println("Emp printName() " + name)
    //在子类中需要去调用父类的方法，使用super关键字
    //不加super的话相当于本类中递归调用自己
    super.printName()
    sayHi()
  }
}
