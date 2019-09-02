package com.ll.charpter02.fun

/**
  * @package com.ll.charpter02.fun
  * @Author LL
  * @ClassName Recursion
  * @Date 2019/8/20  15:47
  */
object Recursion {
  def main(args: Array[String]): Unit = {
    test(4) //2,3,4
    test2(4)  //2
    println("斐波那契结果为： " + fbn(7))
    println("结果为： " + f(2))
    println("第一天的桃子数量为：" + peach(1))
  }
  //递归原理
  def test(n:Int): Unit ={
    if(n > 2){
      test(n - 1)
    }
    println("n = " + n)
  }
  def test2(n: Int): Unit ={
    if(n > 2){
      test2(n - 1)
    }else{
      println("n = " + n)
    }
  }




  //斐波那契数列
  /**
    * 请使用递归的方式，求菲波那切数列1，1，2，3，5，8，13...
    * 给你一个整数，求出他的斐波那契数是多少？
    */
  def fbn(n: Int):Int = {
    //分析
    //1. 当n = 1 结果为1
    //2. 当n = 2 结果为1
    //3. 当n > 2 时，结果就是前面两个数的和
    if(n == 1 || n == 2){
      1
    }else{
      fbn(n - 1) + fbn(n - 2)
    }
  }
  //求函数值
  /**
    * 已知f(1) = 3; f(n) = 2*f(n - 1) + 1
    * 简单的套用公式即可
    * 请使用递归的思想编程，求出f(n)的值？
    */
  def f(n: Int): Int = {
    if(n == 1){
      3
    }else{
      2 * f(n - 1) + 1
    }
  }
  //猴子吃桃子
  /**
    * 有一堆桃子，猴子第一天吃了其中一半，并再多吃了一个！
    * 以后每天猴子都吃其中的一半，并且多吃一个。当到了第十
    * 天的时候，想再吃时（还没吃），发现只有一个桃子了。问
    * 题：最初共有多少个桃子？
    * 分析：
    * 1. day = 10 桃子有 1
    * 2. day = 9 桃子有  （day10[1] + 1） * 2
    * 3. day = 8 桃子有  （day9[4] + 1） * 2
    */
  def peach(day: Int):Int = {
    if(day == 10){
      1
    }else{
      (peach(day+1) + 1) * 2
    }
  }


}
