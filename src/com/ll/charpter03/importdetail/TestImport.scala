package com.ll.charpter03.importdetail

import scala.util._ //表示引入了该包下面的所有类
/**
  * @package com.ll.charpter03.importdetail
  * @Author LL
  * @ClassName TestImport
  * @Date 2019/8/21  19:27
  */
object TestImport {
  def main(args: Array[String]): Unit = {

  }
}

class User{
  import scala.beans.BeanProperty   //在需要时才引入，作用于在{}
  @BeanProperty var name: String = _

  def test(): Unit = {
    import scala.collection.mutable.{HashMap,HashSet}
    var map = new HashMap[Int, String]()
    var set = new HashSet[String]()
  }

  def test2(): Unit = {

    //下面的含义是java.util.HashMap 重命名为 JavaHashMap
    import java.util.{HashMap => JavaHashMap, List}
    import scala.collection.mutable.{HashSet => _,_}
    var map = new HashMap[String,String]()
    var javaMap = new JavaHashMap[Int, Int]()
  }
}
class Dog{
//  @BeanProperty var name: String = _  //error
}

