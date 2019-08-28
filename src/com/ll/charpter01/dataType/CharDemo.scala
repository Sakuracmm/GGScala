package com.ll.charpter01.dataType

/**
  * @package com.ll.charpter01.dataType
  * @Author LL
  * @ClassName CharDemo
  * @Date 2019/8/19  16:07
  */
object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1: Char = 97
    //当我们输出一个char类型时，会输出该数字对应的字符（Unicode 码值表）
    println("char1 = " + char1)   //a
    var char2: Char = 7734
    println("char2 = " + char2)

    //char可以当做数字进行运算
    var num = 10 + char1
    println("num = " + num)

    //原因和分析
    //1.当把一个计算的结果赋值给一个变量，则编译器会进行类型转换及判断
    //  及会看范围和类型
    //2. 当把一个字面量赋值给一个变量，则编译器只会进行范围判定
//    var c2: Char = 'a' + 1 //error
//    var c3: Char = 97 + 1 //error
    var c4: Char = 98 //true
//    var c5: Char = 99999 //error
    var c6: Char = 12349
    println("c6 = " + c6)
  }

}
