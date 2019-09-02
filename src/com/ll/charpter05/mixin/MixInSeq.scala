package com.ll.charpter05.mixin

object MixInSeq {
  def main(args: Array[String]): Unit = {
    //这时FF是这样的形式 class FF extends EE with CC with DD
    /**
      * 1. 调用当前类的超类构造器
      * 2. 第一个特质的父特质构造器
      * 3. 第一个特质构造器
      * 4. 第二个特质构造器的父特质构造器，如果已经执行过，就不会再执行
      * 5. 第二个特质构造器
      * ......重复4,5,的步骤（如果有第三个，第四个特质）.
      */
    /**
      * 1. E...
      * 2. A...
      * 3. B...
      * 4. C...
      * 5. D...
      */

    val ff1 = new FF()
    println(ff1)

    /**
      * 这时我们使用动态混入,
      * 先创建new KK对象，然后再混入其他特质
      * 1. 调用当前了类的超类构造器
      * 2. 当前类构造器
      * 3. 第一个特质构造器的父特质构造器，
      * 4. 第一个特质构造器
      * 5. 第二个特质构造器的父特质构造器，如果已经执行过，就不再执行
      * 6. 第二个特质构造器
      * ......重复5,6的步骤（如果有第三个，第四个特质）
      * 当前类构造器
      */
    /**
      * 1. E...
      * 2. K...
      * 3. A...
      * 4. B...
      * 5. C...
      */
    println("==============")
    val ff2 = new KK with CC with DD
    println(ff2)
  }
}

trait AA {
  println("A......")
}

trait BB extends AA {
  println("B......")
}

trait CC extends BB {
  println("C......")
}

trait DD extends BB {
  println("D......")
}

class EE { //普通类
  println("E......")
}

class FF extends EE with CC with DD { //先继承了一个普通类再继承了两个特质
  println("F......")
}

class KK extends EE {
  println("K......")
}