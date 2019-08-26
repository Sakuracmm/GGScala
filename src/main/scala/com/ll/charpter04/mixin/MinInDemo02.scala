package com.ll.charpter04.mixin

/**
  * @package com.ll.charpter04.mixin
  * @Author LL
  * @ClassName MinInDemo02
  * @Date 2019/8/23  10:55
  */
object MinInDemo02 {
  def main(args: Array[String]): Unit = {
    println("xxx")
    val mySql5 = new MySql5 with DB5 with File5
    mySql5.insert(111)

    //error
    //这种情况下就必须考虑到混入顺序的问题
//    val mySql5_ = new MySql5 with File5 with DB5  //error
//    mySql5_.insert(222)
//    val mySql5__ = new MySql5 with File5    //compile error
  }
}

trait Operate5{
  def insert(id: Int)
}
trait File5 extends Operate5{
  //说明
  //1. 如果我们在子特质中重写/实现了一个父特质的抽象方法，但是同时调用super
  //2. 这时我们的方法不是完全实现，因此需要声明为abstract override
  //3. 这时super.insert(id)的调用就和动态混入的顺序有密切关系
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中...")
    super.insert(id)
  }
}

trait DB5 extends Operate5{ //我们继承Operate5,并实现了Operate的insert
  override def insert(id: Int): Unit = {
    println("将数据保存到数据库中")
  }
}

class MySql5{

}

