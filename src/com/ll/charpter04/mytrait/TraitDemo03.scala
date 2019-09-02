package com.ll.charpter04.mytrait

/**
  * @package com.ll.charpter04.mytrait
  * @Author LL
  * @ClassName TraitDemo03
  * @Date 2019/8/23  9:23
  */
object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    println("@@@@@@@@@@@@")
    val sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello
  }
}
//当一个trait有抽象方法和非抽象方法时
//1. 一个trait在底层对应两个Trait03.class接口
//2. 还对应Trait03$class.class  Trait03$class抽象类
trait Trait03{
  //抽象方法
  def sayHi()
  //实现的普通方法
  def sayHello: Unit ={
    println("say hello ~ ")
  }
}
//当trait有接口和抽象类时
//1. class Sheep extends Trait03 在底层 对应
//2. class Sheep implements Trait03
//3.  当在Sheep类中要使用 Trait03的实现的方法，就通过Trait03$class调用实现的静态方法
class Sheep extends Trait03{
  override def sayHi(): Unit = {
    println("咩咩咩~")
  }
}
