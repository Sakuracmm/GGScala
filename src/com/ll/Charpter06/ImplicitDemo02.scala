package com.ll.Charpter06

object ImplicitDemo02 {
  //编写一个隐式函数，丰富mySQL的功能
  implicit def addDelete(mysql: MySQL) = {
    new DB
  }
  def main(args: Array[String]): Unit = {

    //创建一个MySQL对象   编译器做了工作
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete()  //分析addDelete(mySQL).delete,如果隐式转换函数在main方法里面，那么使用的是addDeleete$1(mySQL)
    mySQL.update()




//    try{
//      小曾曾.表白(助教小哥)
//    }catch{
//      case e: 助教小哥NotReadyExcepton =>  println("助教小哥委婉拒绝")
//      case e: 助教小哥HasGrilFriendException => println("助教小哥名草有主")
//      case e: 助教小哥IsGayException => println("助教小哥不喜欢女人")
//    }finally {
//      小曾曾.get助教小哥()
//      println("what a nice day!^_^")
//    }
  }
}
class MySQL {
  def insert(): Unit = {
    println("insert!")
  }
}
class DB {
  def delete(): Unit = {
    println("delete")
  }
  def update(): Unit = {
    println("update")
  }
}
