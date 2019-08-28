package com.ll.charpter05.mixin

object MixInPro {
  def main(args: Array[String]): Unit = {
    val mySQL6 = new MySQL6 with DB6 {
      override var sal: Int = _
    }
  }
}

trait  DB6{
  var sal:Int
  var opertype: String = "insert"
  def insert: Unit = {

  }
}
class MySQL6{

}