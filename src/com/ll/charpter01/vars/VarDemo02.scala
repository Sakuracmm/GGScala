package com.ll.charpter01.vars

/**
  * @package com.ll.charpter01.vars
  * @Author LL
  * @ClassName VarDemo02
  * @Date 2019/8/19  14:40
  */
object VarDemo02 {
  def main(args: Array[String]): Unit = {

    //类型推导
    var num = 10  //这个num就是int
    //方式，利用idea的提示证明
    println(num)
    //使用函数isInstanceOf来判断
    println(num.isInstanceOf[Int])

    //当变量确定了类型之后，然后不能再改变数据类型，强类型语言，静态语言
//    num = 1.1

    //在声明/定义一个变量的时候，可以使用var来修饰，也可以使用val修饰
    //其中val修饰的变量值不能修改，而var修饰的变量值可以修改
    var age = 10    //即age是可以改变的
    age = 30  //ok

    val num2 = 30   //val修饰的变量不可以改变
//    num2 = 40   //修饰的变量是不可以改变的
    //but why? 又有val 和var
    //（1）在实际编程中，我们更多的需求是获取/创建一个对象后，读取该对象的属性，
    //     或者是修改这个对象的属性值，但是很少改变对象本身
    //        dog = new Dog()  dog.age = 19 ====?====> 一般很少 dog = new Dog()
    //（2）因为val没有线程安全问题，因此效率高，scala设计者推荐多使用val
    //（3）如果对象需要改变，则使用var
    //（4）val修饰的变量在编译后，等同于加上一个final,可以通过反编译查看底层代码
    //（5）变量声明时必须需要初始值
    //（6）var修饰的对象引用可以改变，val修饰的则不可改变，但是对象的状态（值）
    //  却是可以改变的（比如：自定义对象，数组，集合等等）

    val dog = new Dog
//    dog = new Dog   //Reassignment to val
    dog.age = 90  //ok
    dog.name = "小花" //ok

    //程序中 + 号的使用
    //（1）当左右两边都是数值型的时候，做加法运算
    //（2）当左右变量有一方为字符串的时候，则做拼接运算


  }
}

class Dog{
  //声明一个age属性，给了一个默认值 _
  var age: Int = 0  //
  var name: String = "" //
}
