package com.ll.charpter01.dataconvert

/**
  * @package com.ll.charpter01.dataconvert
  * @Author LL
  * @ClassName Demo01
  * @Date 2019/8/19  18:32
  */
class Demo01 {

  def main(args: Array[String]): Unit = {
    var n1 = 10
    var n2 = 1.1

    //1. 多种类型的数据混合运算的时候，会自动转换为精度高的类型进行计算
    var n3 = n1 + n2

    //2. (byte,short)和char之间不会自动转换类型
    var n4: Byte = 10
//    var char1: Char = n4 //error
    var char1: Char = n4.toChar //true

    //3. byte,short,char三者间可以进行计算，在计算时先转换为int再进行计算
    //4. 自动提升原则，表达式结果的类型自动提升为操作数中最大的类型
    var b: Byte = 10  //true
    var c: Char = 90  //true
//    var s: Short = b + c  //error
//    var s1: Short = 10 + 90 //error
    var s2: Short = 100   //true


  }

}
