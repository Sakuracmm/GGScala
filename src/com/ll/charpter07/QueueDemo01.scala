package com.ll.charpter07

import scala.collection.mutable

object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    val q1 = new mutable.Queue[Int]
    println(q1)   //Queue()

    //向队列中增加元素
    q1 += 20
    println(q1) //Queue(20)
    q1 ++= List(1,2,3,4)
    println(q1)   //  默认 直接加在队列后面   Queue(20, 1, 2, 3, 4)
    val q2 = new mutable.Queue[Any]()
    println(q2)   //Queue()
    q2 += List(123,223)   //表示在队列中增加一个List类型的元素 Queue(List(123, 223))
    println(q2)

    //出队列, 默认从队列头取出
    println(q1) //  Queue(20, 1, 2, 3, 4)
    val queueElement = q1.dequeue()   //从队列的头部取出元素，q1本身会变
    println(queueElement)   // 20
    println("queueElement = " + queueElement + "   q1 = " + q1)   // queueElement = 20   q1 = Queue(1, 2, 3, 4)
    //emqueue 入队列，默认是从队列的尾部加入
    q1.enqueue(100,10,100)
    println("q1 = " + q1)   //  q1 = Queue(1, 2, 3, 4, 100, 10, 100)

    println(q1.last)    // 100
    println(q1.head)    //1
    println(q1.tail)    //Queue(2, 3, 4, 100, 10, 100)
    println(q1.tail.tail)   // Queue(3, 4, 100, 10, 100)
  }
}
