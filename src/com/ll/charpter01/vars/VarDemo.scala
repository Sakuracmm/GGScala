package com.ll.charpter01.vars

/**
  * @package com.ll.charpter01.vars
  * @Author LL
  * @ClassName VarDemo
  * @Date 2019/8/19  14:34
  */
object VarDemo {
  def main(args: Array[String]): Unit = {
    //编译器，动态的（逃逸分析）
    var age: Int = 10
    var sal: Double = 10.9
    var name: String = "Tom"
    var isPass: Boolean = true
    var score: Float = 70.9f

    println(s"$age and $score")
  }
}
