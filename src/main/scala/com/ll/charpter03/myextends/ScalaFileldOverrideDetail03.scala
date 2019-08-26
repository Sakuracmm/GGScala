package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName ScalaFileldOverrideDetails03
  * @Date 2019/8/22  14:33
  */
object ScalaFileldOverrideDetail03 {
  def main(args: Array[String]): Unit = {
    println("hello")
  }
}

//在A03中有一个抽象的字段（属性）
//1. 抽象的字段（属性：就是没有初始化的字段（属性））
//2. 当一个类含有抽象属性时，则该类需要标记为abstract
//3. 对于抽象的属性，在底层不会生成对应的属性声明，而
// 是生成两个对应的 抽象方法（name,name_$eq）
//4. 如果该属性是一个var的，但并不是抽象的，就不能重写
abstract class A03{
  var name: String    //抽象
  var age: Int = 10   //非抽象，有初始值
}

class Sub_A03 extends A03{
  //说明
  //1. 如果我们在子类中去重写父类中的抽象属性，本质是实现了抽象方法
  //2. 因此这里我们可以写override,也可以不写
//  override var name: String = "Alice"   //ok，这里可以写override也可以不写
  var name: String = "Bob"
//  override var age: Int = 10  //error 执行时错误
}



