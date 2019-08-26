package com.ll.charpter03.constructor

/**
  * @package com.ll.charpter03.constructor
  * @Author LL
  * @ClassName ConDemo02
  * @Date 2019/8/21  14:27
  */
object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val aa = new AA
    println("-------------------")
    val aa2 = new AA("Alice")
    //执行的顺序是
    /**
      * b ~~~
      * AA()
      * A this(name：String)
      */
  }
}

class BB{
  println("b ~~~")
}

class AA extends BB{
  println("AA()")
  def this(name:String){
    this  //调用A的主构造器
    println("A this(name：String)")
  }
}
