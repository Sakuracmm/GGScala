package com.ll.charpter03.abstaract

/**
  * @package com.ll.charpter03.abstaract
  * @Author LL
  * @ClassName BankDemo
  * @Date 2019/8/21  19:41
  */
object BankDemo {
  def main(args: Array[String]): Unit = {
    //开卡
    val account = new Account("gh000001",200,"123455")
    account.query("123455")
    account.withDraw("123455",88.1)
    account.query("123455")
  }
}

//编写一个Account类
class Account(inAccount: String,inBalance: Double,inPwd: String ){
  /**
    * 属性：
    *   账号，余额，密码
    * 方法：
    *   查询，取款，存款
    */
  private val accountNo = inAccount
  private var balance = inBalance
  private var pwd = inPwd

  //查询
  def query(pwd: String): Unit ={
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }
    printf("账号为%s 当前余额为 %.2f \n",this.accountNo,this.balance)
  }

  //取款
  def withDraw(pwd: String,money: Double): Any ={
    if(!this.pwd.equals(pwd)){
      println("密码错误！")
      return
    }

    //判断money是否合理
    if(money > balance){
      println("余额不足！")
      return
    }
    this.balance -= money
    money
  }


}