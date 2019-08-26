package com.ll.charpter01.dataconvert

/**
  * @package com.ll.charpter01.dataconvert
  * @Author LL
  * @ClassName Demo02
  * @Date 2019/8/19  18:56
  */
object Demo02 {

  def main(args: Array[String]): Unit = {

    //(1)当进行数据的从大--->就需要使用到强制类型转换
    //(2)强制符号只针对于最近的操作数有效，往往可以使用小括号提升优先级
    var x: Int = 10 * 3.5.toInt + 10 * 1.5.toInt
    var y: Int = (10 * 3.5 + 10 * 1.5).toInt

    println( x + " " + y)

    //(3)Char类型可以保存Int的常量值，但不能保存Int的变量值，需要强转
    val char1: Char = 1
    val num3 = 1
//    val char2: Char = num3  //error

    //(4)Byte和Short类型在进行运算时，均当做Int类型处理


  }

}
