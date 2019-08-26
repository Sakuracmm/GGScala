package com.ll.charpter03.constructor

/**
  * @package com.ll.charpter03.constructor
  * @Author LL
  * @ClassName ConDemo04
  * @Date 2019/8/21  15:06
  */
object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("Smith")
    worker.name

    val worker2 = new Worker2("Smith")
    worker2.inName
    worker2.name

    val worker3 = new Worker3("jack")
    worker3.inName = "marh"
    println(worker3.inName)
  }
}

//1. 如果主构造器是Worker(inName: String),那么inName就是一个局部变量
class Worker(inName:String){
  var name = inName
}

//2. 如果主构造器是Worker2(val inName: String),那么inName就是Worler2的一个private
// 只读的属性
class Worker2(val inName: String){
  var name = inName
}

//3. 如果主构造器是Worker2(var inName: String),那么inName就是Worler3的一个private
// 可读写的属性
class Worker3(var inName: String){
  var name = inName
}
