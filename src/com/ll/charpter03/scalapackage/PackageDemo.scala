
//代码说明
//1. package com.ll,表示我们创建了包com.ll，在{}中
// 我们可以继续写它的子包 scala  //com.ll.scala,还可以写类，特质，object
//2. 即scala支持，在一个文件中可以同时创建多个包，以及给各个包创建类，trait和object
//
package com.ll {


  class User { //在包com.ll包下创建了个User类
    println("I'm in com.ll !")

    def sayHello(): Unit = {
      //想使用scala2下的Monster
      import com.ll.scala2.Monster //包cam.ll
      val monster = new Monster //I'm in com.ll.scala2.Monster!
    }
  }

  //    val name = "king"
  //    def sayHi()
  //说明
  //1.在包中直接写方法，或者定义变量，就错误  ==> 使用包对象的技术来解决
  //2.package object scala表示创建一个包对象scala,它是com.ll.scala对应的包对象
  //3.每一个包都可以有且仅有一个包对象，并且在对应的包的同级目录
  //4.包对象的名字需要和子包保持一致
  //5.在包对象中可以定义变量，方法
  //6.在包对象中定义的变量和方法，就可以在对应的包中使用
  //7.在底层这个包对象会 生成两个类，package.class，和package$.class
  package object scala{
    val name = "Alice"
    def sayHi():Unit = {
      println("package object scala sayHi ~ ")
    }
  }

  package scala { //包com.ll.scala

    class Person { //表示在包com.ll.scala下创建类Person
      val name = "Nick"

      def play(message: String): Unit = {
        println(this.name + " " + message)
      }
    }

    class User {
      println("I'm in com.ll.scala !")
      def testUser(): Unit = {
        println("name " + name)
        sayHi()
      }
    }

    object Test { //表示在com.ll.scala创建object
      def main(args: Array[String]): Unit = {
        println("ok")
        //我们可以直接使用父包中的内容
        val user = new User //com.ll.scala.User
        user.testUser()

        val user2 = new com.ll.User //com.ll.User
        user2.sayHello() //I'm in com.ll.scala2.Monster!

        val user3 = new com.ll.scala2.User //com.ll.scala2.User

        //使用包对象中的变量
        println("使用 name = " + name)
        //使用包对象中的方法
        sayHi()
      }
    }

  }

  package scala2 { //创建包com.ll.scala2
  class User {
    println("I'm in com.ll.scala2 !")
  }

    class Monster {
      println("I'm in com.ll.scala2.Monster!")
    }

  }

}
