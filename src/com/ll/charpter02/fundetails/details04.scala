package com.ll.charpter02.fundetails

/**
  * @package com.ll.charpter02.fundetails
  * @Author LL
  * @ClassName details04
  * @Date 2019/8/20  17:15
  */
object details04 {
  def main(args: Array[String]): Unit = {
    mysqlCon()
    mysqlCon("127.0.0.1", 7777) //从左往右覆盖

    //如果我们希望指定覆盖某个默认值，则使用[带名参数]即可，比如修改用户名和密码
    mysqlCon(user = "tom",pwd = "123")
//    f6("v2")  //error
    f6(p2 = "v2") // v1v2
  }
  def mysqlCon(add:String = "localhost", port: Int = 3306,
               user: String="root", pwd: String="licuanlei.123"): Any = {
    println("add = " + add)
    println("port = " + port)
    println("root = " + user)
    println("pwd = " + pwd)
  }
  def f6(p1: String = "v1", p2: String): Unit = {
    println(p1 + p2)
  }
}
