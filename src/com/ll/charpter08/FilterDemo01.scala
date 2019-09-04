package com.ll.charpter08

object FilterDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 将  val names = List("Alice", "Bob", "Nick") 集合中首字母为'A'的筛选到新的集合。
      */
    val names = List("Alice","Bob","Candy")

    //传统方式  后面声明的String泛型必须指定
    var list0 = List[String]()
    for (item <- names){
      if(item.startsWith("A")){
        list0 =  list0 :+ item
      }
    }
    println(list0)  //  List(Alice)


    //filter方式
    val list1 = names.filter(startWithA)
    println(list1)  //  List(Alice)
  }
  def startWithA(s:String): Boolean ={
    if(s.startsWith("A")){
      true
    } else{
      false
    }
  }
}
