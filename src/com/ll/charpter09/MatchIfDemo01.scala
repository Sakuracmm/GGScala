package com.ll.charpter09

object MatchIfDemo01 {
  def main(args: Array[String]): Unit = {
    for(ch <- "+-3!"){    //是对“+-3！”遍历
      var sign = 0
      var digit = 0
      ch match{
        case '+' => sign = 1
        case '-' => sign = -1
          //说明
          //如果case后面有条件守卫即if，那么这时的 _ 不是表示默认匹配
          //表示忽略传入的ch
        case _ if ch.toString.equals("3") => digit = 3
        case _ if (ch > 11100 && ch < 100000) => println("ch > 10")
        case _ => sign =2
      }
      //分析
      // + 1 0
      // - -1 0
      // 3 0 3
      // ! 2 0
      println(ch + " " + sign + " " + digit)
    }
    println("================================================")
    //test
    for(ch <- "+-3!"){
      var sign = 0
      var digit = 0
      ch match{
        case '+' => sign = 1
        case '-' => sign = -1
          //说明
        case _ => digit = 3
        case _ => sign = 2
      }
      // + 1 0
      // - -1 0
      // 3 0 3
      // ! 0 3
      println(ch + " " + sign + " " + digit)
    }
    println("=================================================")
    for(ch <- "+-3!"){
      var sign = 0
      var digit = 0
      ch match{
        case _ => digit = 3
        case '+' => sign = 1
        case '-' => sign = -1
          //说明

      }
      // + 0 3
      // - 0 3
      // 3 0 3
      // ! 0 3
      println(ch + " " + sign + " " + digit)
    }
  }
}
