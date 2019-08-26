package com.ll.charpter04.mixin

/**
  * @package com.ll.charpter04.mixin
  * @Author LL
  * @ClassName MinInDemo01
  * @Date 2019/8/23  10:04
  */
object MinInDemo01 {
  def main(args: Array[String]): Unit = {
    //在不修改类的定义的基础上，让他们使用trait方法
    val oracleDB = new OracleDB with Operate3
    oracleDB.insert(100)

    val mysql = new MySQL3 with Operate3
//    val t = new MySQL3 {} //true
    mysql.insert(200)

    val mysql_ = new MySQL3_ with Operate3 {
      override def say(): Unit = {
        println("Say Hello")
      }
    }
    mysql_.insert(999)
    mysql_.say()
  }
}

trait Operate3{ //特质
  def insert(id: Int):Unit = {  //方法、实现
    println("插入数据 = " + id)
  }
}

class OracleDB{ //空

}
abstract class MySQL3{

}
abstract class MySQL3_{
  def say()
}
