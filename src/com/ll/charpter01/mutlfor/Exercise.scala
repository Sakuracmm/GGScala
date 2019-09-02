package com.ll.charpter01.mutlfor

import scala.io.StdIn

/**
  * @package com.ll.charpter01.mutlfor
  * @Author LL
  * @ClassName Exercise
  * @Date 2019/8/20  11:16
  */
object Exercise {
  def main(args: Array[String]): Unit = {

    /**
      * 统计三个班的成绩情况，求每个班的平均分和所有班的平均分
      * 分析思路
      * （1）classNum表示班级的个数，stuNum表示学生的个数
      * （2）classcore表示各个班级的总分，total表示所有班级的总分
      * （3）score表示各个学生的分数
      * （4）使用循环的方式输入成绩
      */
    val classNum = 3
    val stuNum = 5
    var score = 0.0 //分数
    var classScore = 0.0
    var totalScore = 0.0
    for (i <- 1 to classNum) {
      //现将classScore清零
      classScore = 0.0
      for (j <- 1 to stuNum) {
        printf("请输入第%d班的第%d个学生的分数： \n", i, j)
        score = StdIn.readDouble()
        classScore += score
      }
      printf("第%d班级的平均分为%.2f", i, classScore / stuNum)
      println()
      totalScore += classScore
    }
    println()
    printf("所有班的平均分为%.2f",totalScore / (stuNum * classNum))
  }
}
