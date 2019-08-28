package com.ll.charpter04

/**
  * @package com.ll.charpter04
  * @Author LL
  * @ClassName AccompanyObject
  * @Date 2019/8/22  15:48
  */
object AccompanyObject {
  def main(args: Array[String]): Unit = {
    println(ScalaPerson.sex)  //true 底层等价于ScalaPerson$.MODULE$.sex()
    ScalaPerson.sayHi() //在底层等价于ScalaPerson$.MODULE$.sayHi()
  }
}

//说明
//1. 当在同一个文件中，有class ScalaPerson和object ScalaPerson
//2. class ScalaPerson 称为伴生类，将非静态的内容写到该类中
//3. object ScalaPerson 称为伴生对象，将静态的内容写入到该对象（类）中
// （用这种特殊的方式模拟静态）
//4. class ScalaPerson 编译后底层生成 ScalaPerson类 ScalaPerson.class
//5. object ScalaPerson 编译后再底层生成ScalaPerson$类 ScalaPerson$.class
//6. 对于伴生对象中的内容，我们可以直接通过ScalaPerson.属性/方法来访问
//伴生类
class ScalaPerson{
  var name: String = _
}
//伴生对象
object ScalaPerson{
  var sex: Boolean = true
  def sayHi(): Unit = {
    println("object ScalaPerson sayHi ~ ")
  }
}
