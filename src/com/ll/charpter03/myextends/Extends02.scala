package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName Extends02
  * @Date 2019/8/22  9:42
  */
/**
  * 1. 在scala中，紫烈继承了父类的所有属性
  * 2. 但是private的属性和方法无法访问
  */
object Extends02  {
  def main(args: Array[String]): Unit = {
    val sub = new Sub
//    sub.sayOk()// protected为受保护权限，scala中受保护权限比Java中更加
                //严格，只能子类访问，同包无法访问（编译器决定的）
//    sub.test200() //error
  }
}

//父类（基类）
class Base{
  var n1: Int = 1   // public n1()   public n1_$eq()
  protected var n2: Int = 2
  private var n3: Int = 3 //private n1()   private n1_$eq()
  def test100():Unit = {    //默认是public
    println("base 100")
  }
  protected def test200(): Unit ={    // ? -->底层是public
    println("base 200")
  }
  private def test300(): Unit = {   //private
    println("base 300")
  }
}

class Sub extends Base{
  def sayOk(): Unit = {
    this.n1 = 20    //这里访问的本质是this.n1_$eq()
    this.n2 = 40
//    this.n3 = 60 //error
    println("范围 " + this.n1 + "  " + this .n2)
    this.test100()
    this.test200()  //子类中可以使用protected修饰的方法
//    this.test300()//error
  }
}