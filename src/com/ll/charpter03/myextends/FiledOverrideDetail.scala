package com.ll.charpter03.myextends

/**
  * @package com.ll.charpter03.myextends
  * @Author LL
  * @ClassName FiledOverrideDetail
  * @Date 2019/8/22  14:19
  */
object FiledOverrideDetail {
  def main(args: Array[String]): Unit = {
    println("xx")
    val bbbb = new BBBB
    println("bbbbb.sal = " + bbbb.sal)   //动态绑定 -> 10
    val b2: AAAA = new BBBB
    println("b2.sal = " + b2.sal)   //动态绑定 -> 10
    //bbbb.name = "jack" 相当于调用了父类的name_$eq()
    //println(bbbb.name)相当于调用了子类的name()
    //这样出现数据设置和数据获取的不一致
  }
}

class AAAA{
  //1. def只能重写另一个def
  var name: String = "" //底层会生成public name() 和 public name_$eq()
  // 2. val只能重写另一个val属性或者重写不带参数的def
  def sal: Int = {
    10
  }
}
class BBBB extends AAAA{
  //  override var name: String = "jj"    //error
  //  override val name: String = "jj"    //error
  override val sal: Int = 10    //ok
}
