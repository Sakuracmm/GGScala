package com.ll.charpter01.iden

/**
  * @package com.ll.charpter01.iden
  * @Author LL
  * @ClassName IdenDemo01
  * @Date 2019/8/19  19:22
  */
object IdenDemo01 {

  def main(args: Array[String]): Unit = {
    //首字符为操作符（比如 + - * /）,但是后续也必须跟一个操作符
    val ++ = "hello, world!"
    println(++)

    val -+*/ = 90 //ok
    println("res = " + -+*/)

//    val +q = "abc"  //error
//    val +q- = "abc"  //error
//    val +q-d = "abc"  //error
//    val +-d = "abc"  //error

    //看看编译器怎么处理这个问题
    // ++ => $plus$plus

    //用反引号``可以包括任何字符，包括39个关键字，例如`true`
    var `true` = "hello scala!"
    println(`true`)
    //但是在scala中，Int不是关键字，而是预定义标识符，可以用，但不推荐
    var Int = 90.67
    println(Int)
    //Scala中的_有很多的作用,不能使用单独的_作为标识符
//    var _ = "jack"
//    println(_)  //error

  }

}
