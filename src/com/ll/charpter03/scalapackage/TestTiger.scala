package com.liuliang {

  //每个包都可以有一个包对象。你需要在它的父包（com.ll）中定义它，
  //切名称与子包名一样
  package object scala {
    var name = "Alice"

    def packageFunc(): Unit = {
      println("package object function!")
    }
  }
  package scala {

    class Test {
      def test(): Unit = {
        //这里的name就是包对象scala中声明的name
        println(name)
        packageFunc() //这个方法就是在scala包对象总声明的方法
      }
    }

    object TestObj {
      def main(args: Array[String]): Unit = {
        val t = new Test
        t.test()
        //因为TestObj和scala这个包对象在一个包下，因此也可以使用
        println("name = " + name) //Alice
        packageFunc() //package object finction!
      }
    }

  }

  package scala2 {

    class User {
    }

  }

}
