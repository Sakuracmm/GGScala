package com.ll.charpter02.fundetails

/**
  * @package com.ll.charpter02.fundetails
  * @Author LL
  * @ClassName details01
  * @Date 2019/8/20  16:41
  */
object details01 {
  def main(args: Array[String]): Unit = {
    //形参列表和返回值列表的数据类型可以是值类型也可以是引用类型
    var tiger = new Tiger
    println(tiger.hashCode())  //1516369375
    val tiger2 = test01(10,tiger)
    println(tiger2.hashCode()) //1516369375
  }
  def test01(n1: Int, tiger:Tiger) ={
    println("n1 = " + n1)
    tiger.name = "jack"
    tiger
  }
}
class Tiger{
  //一个名字属性
  var name = " "
}
