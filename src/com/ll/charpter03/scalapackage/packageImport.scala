package com.ll.charpter03.scalapackage

/**
  * @package com.ll.charpter03.scalapackage
  * @Author LL
  * @ClassName packageImport
  * @Date 2019/8/21  16:01
  */
//在scala中java.lang.包 scala包（引入了Scala包不代表就能引入scala下的所有子包）
//Predef，预定义包
object packageImport {
  def main(args: Array[String]): Unit = {

    import scala.io.StdIn
  }
}
