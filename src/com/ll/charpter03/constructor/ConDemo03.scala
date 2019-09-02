package com.ll.charpter03.constructor

/**
  * @package com.ll.charpter03.constructor
  * @Author LL
  * @ClassName ConDemo03
  * @Date 2019/8/21  14:33
  */
object ConDemo03 {
  def main(args: Array[String]): Unit = {
    val p1 = new People("name")

  }
}

//定义了一个People类
//People有几个构造器呢？ 4个构造器，其中一个主构造器，三个辅助构造器
class People(){
  var name: String = _
  var age: Int = _

  def this(name: String){
    //辅助构造器无论是直接或间接，最终都一定要调用主构造器，执行主构造器的逻辑
    //而且需要放在辅助构造器的第一行【这点和Java一样，Java中一个构造器要调用同类的
    // 其他构造器，也需要放在第一行】
    this()    //直接调用主构造器
    this.name = name
  }

  def this(name: String, age: Int){
    this()  //直接调用主构造器
    this.name = name
    this.age = age
  }

  def this(age:Int){
    this("匿名")   //通过其他辅构造器间接调用主构造器
    this.age = age
  }

  def showInfo(): Unit = {
    println("People信息如下： ")
    println("name = " + name)
    println("age = " + age)
  }
}
