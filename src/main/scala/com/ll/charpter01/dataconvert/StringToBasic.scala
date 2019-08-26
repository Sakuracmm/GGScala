package com.ll.charpter01.dataconvert

/**
  * @package com.ll.charpter01.dataconvert
  * @Author LL
  * @ClassName StringToBasic
  * @Date 2019/8/19  19:10
  */
object StringToBasic {
  def main(args: Array[String]): Unit = {
    val d1 = 1.2
    val s1 = d1 + ""  //以后看到有划线表示进行了类型转换

    //String类型转基本数据类型
    val s2 = "12"
    val num1 = s2.toInt
    val num2 = s2.toByte
    val num3 = s2.toLong
    val num4 = s2.toShort

    println("ok ~")

    //再讲String类型转成基本数据类型时，要确保string类型能够转成有效数据
    //比如可以把“123”，转成一个整数，但是不能把“hello”转成一个整数
    val s3 = "hello"
//    println(s3.toInt) Exception

    //思考，要是把"12.5"这个字符串转成Int可以吗？
    //Scala中，不是将小数点后的数据进行截取，而是会抛出异常
    val s4 = "12.5"
//    println(s4.toInt) //Exception
    println(s4.toDouble)  //ok
    println(s4.toFloat)   //ok
  }
}
