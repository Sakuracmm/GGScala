package com.ll.charpter08

object MapOperateDemo02 {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,34,22)
    //说明 list2 = list.map(multipke)做了什么
    //1. 将list这个集合的元素依次遍历
    //2. 将各个元素传递给multiple函数 =》 新 Int
    //3. 将得到新Int，放入到一个新的集合并返回
    //4. 因此multiple函数调用了4次
    val list2 = list.map(multiple)
    println(list2)    //List(2, 4, 68, 44)

    val list3 = list.map(a => { a * 3})   //List(3, 6, 102, 66)
    println(list3)

    val myList = MyList()
    val myList2 = myList.map(multiple)
    println(myList2)    //List(6, 10, 14, 18)
  }

  def multiple(n :Int): Int = {
    println("调用函数multiple")
    n * 2
  }
}

//深刻理解map映射函数机制-模拟实现
class MyList{
  val list1 = List(3,5,7,9)
  var list2 = List[Int]()
  //写map
  def map(f: Int => Int): List[Int] = {
    //遍历集合
    for(item <- this.list1){
      //还可以进行过滤，扁平化等操作
      list2 = list2 :+ f(item)
    }
    list2
  }
}

object MyList{
  def apply(): MyList = new MyList()
}