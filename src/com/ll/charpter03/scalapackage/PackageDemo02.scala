package com.ll.charpter03.scalapackage

import java.beans.BeanProperty

/**
  * @package com.ll.charpter03.scalapackage
  * @Author LL
  * @ClassName PackageDemo02
  * @Date 2019/8/21  16:44
  */
class Manager(var name: String){
  //第一种形式【使用相对路径引入包】
  @BeanProperty var age: Int = _
  //第二种形式，和第一种一样，都是相对路径
  @scala.beans.BeanProperty var age2: Int = _
  //第三种形式，是绝对路劲引入，可以解决包名冲突
  @_root_.scala.beans.BeanProperty var age3: Int = _
}

object TestBean{
  def main(args: Array[String]): Unit = {
    val m = new Manager("Admin")
    print("m = " + m)
  }
}
