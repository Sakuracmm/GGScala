package com.ll.charpter03.oop

/**
  * @package com.ll.charpter03.oop
  * @Author LL
  * @ClassName CreateObj
  * @Date 2019/8/21  11:30
  */
object CreateObj {
  def main(args: Array[String]): Unit = {
    val emp = new Emp //emp 类型就是Emp
    //如果希望将子类对象，交给父类的引用，这时需要写上类型
    val emp2: Person = new Emp
  }
}

class Person{

}

class Emp extends Person{

}