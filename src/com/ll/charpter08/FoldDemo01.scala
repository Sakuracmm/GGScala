package com.ll.charpter08

object FoldDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    //说明
    //1. 折叠的理解和化简的机制几乎一样
    //步骤1 list.foldLeft(5)(minus) 理解成list =（5 +： list）   list.reduceLeft(minus)

    println(list.foldLeft(5)(minus))  // -5
    println(list.foldRight(5)(minus)) //3   1 - (2 - (3 - (4 - 5)))

    val list2 = 5 +: list
    println(list2)

    println(list.foldLeft(List(5,6))((listItem, n) => {
      listItem.map(a => a+n)

    }))

    def listWithInt(list:List[Int],n:Int): List[Int] ={
      val listx = list.map(x => {
        x + n
      })
      listx
    }

    val list3 = list.foldLeft(List(2,3))(listWithInt)
    println(list3)

    def listWithList(list1:List[Int], list2: List[Int]):List[Int] = {
      var i = 0
      var resList: List[Int] = List()
      while(i < list1.size && i < list2.size ){
        i = i + 1
        resList = resList :+ (list1(i) + list2(i))
      }
      while (i < list1.size){
        resList = list1(i) :: resList
        i = i + 1
      }
      while (i < list2.size){
        resList = list2(i) :: resList
        i = i + 1
      }
      resList
    }
//    val list4 = list.foldLeft(List(7,9))(listWithList)  error
  }
}
