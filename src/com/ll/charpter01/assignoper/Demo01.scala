package com.ll.charpter01.assignoper

/**
  * @package com.ll.charpter01.assignoper
  * @Author LL
  * @ClassName Demo01
  * @Date 2019/8/19  20:14
  */
object Demo01 {

  def main(args: Array[String]): Unit = {
    var num = 3
    num <<= 3   //3 * 2^3
    println("num= " + num)

    num >>= 2   //3 * 2^(-2)
    println("num= " + num)

    num &= 2    //2
    println("num= " + num)

    num |= 6    //6
    println("num= " + num)

    num ^= 7    //1
    println("num= " + num)

    //赋值运算的特点
    //1)、运算顺序从右往左走
    //2)、赋值运算符的左边，只能是变量，右边可以是变量、常量、表达式/字面量
    //3）、复合赋值运算符等价于下面的效果，比如：a += 3 等价于 a = a+3

    //scala中支持代码块，返回值
    val res = {
      if(num > 1) "hello,ok" else 100
    }
    println("res = " + res)

    //有两个变量，a和b,要求对其进行交换，要求不使用中间变量 --- 位运算
    var a = 10
    var b = 20
    a = a + b
    b = a - b // ==> (a + b) - b = a
    a = a - b // ==> (a + b) - a = b
    println("a = " + a + " b = " + b)

    //位运算
    //a = 0 1010
    //b = 1 0100
    //a = a ^ b = 0 0001
    //b = b ^ a = 0 1010
    //a = a ^ b = 1 0100
    a = a ^ b
    b = b ^ a
    a = a ^ b
    println("a = " + a + " b = " + b)


    /**
      * 求两个数的最大值
      * 求三个数的最大值
      */
    val n1 = 4
    val n2 = 8
    var res1 = if(n1 > n2) n1 else n2
    println("res = " + res1)

    val n3 = 11
    res1 = if(res1 > n3) res1 else n3
    println("res = " + n3)



  }

}
