package com.ll.charpter04

/**
  * @package com.ll.charpter04
  * @Author LL
  * @ClassName SingleTonDemo
  * @Date 2019/8/23  9:58
  */
object SingleTonDemo {
  def main(args: Array[String]): Unit = {
    val dog = Dog
    val dog2 = Dog
    println(dog == dog2)  //true
  }
}
class Dog private(){

}
object Dog{
  var singleDog: Dog = null

  def apply(): Dog = {
    if(singleDog == null){
      singleDog = new Dog
    }
    singleDog
  }
}
