package com.ll.charpter07

import scala.collection.mutable

object MapDemo01 {
  def main(args: Array[String]): Unit = {
    //1. 默认Map是immutable.Map
    //2. key-value,类型支持Any
    //3. 在Map底层，每对key-value是tuple2
    //4. 不可变map是有序的（虽然没有实际的价值）
    val  map = Map("Alice" -> 20, "Bob" -> 21, "Kotlin" -> "北京")
    println(map)  //Map(Alice -> 20, Bob -> 21, Kotlin -> 北京)

    //构建可变map
    //1. 可变的map输出的顺序和声明的顺序不一致
    //2. 支持动态的变化
    val map2 = mutable.Map("Alice" -> 20, "Bob" -> 21, "Kotlin" -> "北京")    //HashMap(Bob -> 21, Alice -> 20, Kotlin -> 北京)
    println(map2)

    //创建一个空的映射
    val map3 = new mutable.HashMap[String, Int]
    println(map3)     //HashMap()

    //对偶元组
    val map4 = mutable.Map(("Alice",20),("Bob",21),("Kotlin","北京"))
    println(map4)   //HashMap(kotlin -> 北京, Bob -> 21, Alice -> 20)

    //从map中取值
    println(map("Alice"))   //20
//    println(map2("kotlin"))   //java.util.NoSuchElementException: key not found: kotlin
    println(map4("Kotlin")) //北京

    //检查key是否存在
    println(map.contains("Alice"))  //true
    println(map.contains("Candy"))  //false


    //使用map.get(key).get
    //1. 如果key存在 map.get(key) 就会返回some(值)，然后some(值).get就可以取出key对应的值
    println(map2.get("Alice"))  //Some(20)
    println(map2.get("Alice").get)  //20,从some()中取出
    println(map2.get("Candy"))  //None
//    println(map2.get("Candy").get)  //java.util.NoSuchElementException: None.get

    //使用函数getOrElse()取值
    println(map4.getOrElse("A","默认"))   //默认
    println(map4.getOrElse("Alice","默认"))   //20


    //更新或者添加map中的元素
    map4("Candy") = "上海"
    println(map4)   //HashMap(Candy -> 上海, Bob -> 21, Alice -> 20, Kotlin -> 北京)
//    map("Candy") = "香港"
//    println(map)  //error
    map4("Alice") = "New York"
    println(map4)   //HashMap(Candy -> 上海, Bob -> 21, Alice -> New York, Kotlin -> 北京)

    //添加map元素
    //增加单个元素
    val map6 = mutable.Map(("A",1),("B",2),("C","Hongkong"))
    map6 += ("D" -> 20)   //添加一对key-value值
//    map6 += ("E",3) //error
//    map6 += (("E",3)) //ok
    map6 += ("A" -> 10)   //如果要增加的key已经存在，会进行更新操作
    println(map6)   //HashMap(A -> 10, B -> 2, C -> Hongkong, D -> 20)

    //一次性添加多个元素
    map6 += (("E","NewYork"),("F","Tokyo"))   //HashMap(A -> 10, B -> 2, C -> Hongkong, D -> 20, E -> NewYork, F -> Tokyo)
    println(map6) //HashMap(A -> 10, B -> 2, C -> Hongkong, D -> 20, E -> NewYork, F -> Tokyo)
    val map7 = map6 + ("G" -> "Gelin") + ("H" -> true)
    println(map7) //(A -> 10, B -> 2, C -> Hongkong, D -> 20, E -> NewYork, F -> Tokyo, G -> Gelin, H -> true)

    //删除map元素
    println(map6)
    map6 -= ("A","B") //不等价于 map5 = map5 - ("A","B")
//    map6 = map6 - ("A","B")   //error
    println(map6)   //HashMap(C -> Hongkong, D -> 20, E -> NewYork, F -> Tokyo)
    val map8 = map6 - ("C","D","DDS")   //如果删除一个不存在的key也不会报错
    println(map8)   //HashMap(E -> NewYork, F -> Tokyo)

    //map的遍历
    println("----------------第一种遍历方式-----------")
    for((k,v) <- map6) println(k + " is mapped to " + v)
    println("-----第二种遍历方式（遍历了key）---------")
    for(k <- map6.keys) println(k)
    println("-----第三种遍历方式（遍历了value）-------")
    for(v <- map6.values) println(v)
    println("---第四种遍历方式（遍历的结果是tuple2）--")
    for(v <- map6) println(v._1 + " is mapped to " + v._2)
  }
}
