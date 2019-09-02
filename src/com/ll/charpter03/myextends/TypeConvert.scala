package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName TypeConvert
  * @Date 2019/8/22  10:08
  */
object TypeConvert {
  def main(args: Array[String]): Unit = {
    //classOf的使用，可以得到类名
    println(classOf[String])    //输出
    val s = "king"
    println(s.getClass.getName) //反射机制获取全类名

    //isInstanceOf asInstanceOf
    var p1 = new Person1
    var emp = new Emp
    //将子类引用给父类（向上转型，自动转换）
    p1 = emp
    //将父类的引用重新转成子类引用（多态）,即向下转型
    var emp2 = p1.asInstanceOf[Emp]
    emp2.printName()
  }
}
