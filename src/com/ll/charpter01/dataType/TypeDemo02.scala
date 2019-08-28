package com.ll.charpter01.dataType

/**
  * @package com.ll.charpter01.dataType
  * @Author LL
  * @ClassName TypeDemo02
  * @Date 2019/8/19  15:19
  */
object TypeDemo02 {

  def main(args: Array[String]): Unit = {
    println(sayHello)

    var num = 1.2   //默认为Double
    var num2 = 1.7f   //Float
//    num2 = num  //error
    num2 = num.toFloat  //true
    num = num2  //true
  }

  //比如开发中，我们有一个方法，就会异常中断，这时就可以返回Nothing
  //当我们使用Nothing做返回值，就是明确说明该方法没有正常返回值
  def sayHello:Nothing = {
    throw new Exception("抛出异常")
  }

}
