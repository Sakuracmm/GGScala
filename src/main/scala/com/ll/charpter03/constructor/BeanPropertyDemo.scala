package com.ll.charpter03.constructor



/**
  * @package com.ll.charpter03.constructor
  * @Author LL
  * @ClassName BeanPropertyDemo
  * @Date 2019/8/21  15:19
  */
object BeanPropertyDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "BWM"
    println(car.name)
    //使用@BeanProperty自动生成的get或set方法
    car.setName("Bens")
    println(car.getName)
  }
}

import scala.beans.BeanProperty
class Car{
  @BeanProperty var name: String = _
}
