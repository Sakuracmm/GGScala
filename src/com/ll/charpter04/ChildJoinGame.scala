package com.ll.charpter04

/**
  * @package com.ll.charpter04
  * @Author LL
  * @ClassName ChildJoinGame
  * @Date 2019/8/22  16:16
  */
object ChildJoinGame {
  def main(args: Array[String]): Unit = {
    //创建三个小孩
    val childM1 = new ChildM("白骨精")
    val childM2 = new ChildM("蜘蛛精")
    val childM3 = new ChildM("蝎子精")

    ChildM.joinGame(childM1)
    ChildM.joinGame(childM2)
    ChildM.joinGame(childM3)
    ChildM.showNum()
  }
}

class ChildM(cName: String){
  var name = cName
}
object ChildM{
  //统计共有多少个小孩的属性
  var totalChildNum = 0
  def joinGame(child: ChildM): Unit ={
    printf("%s 小孩加入了游戏\n", child.name)
    totalChildNum += 1
  }

  def showNum(): Unit ={
    println(s"当前有$totalChildNum 小孩玩游戏 \n")
  }
}
