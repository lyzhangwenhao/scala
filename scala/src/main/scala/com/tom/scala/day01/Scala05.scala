package com.tom.scala.day01

/**
 * ClassName: Scala05
 * Description: 
 *
 * @date 2019/11/25 20:54
 * @author Mi_dad
 */
object Scala05 {
  def main(args: Array[String]): Unit = {
    //隐式变量
    implicit val name = "Nick"
    //不能存在多个相同类型的隐式值，否则报错（根据类型查找）
//    implicit val addr = "tom"
    //可以声明implicit关键字，当函数调用时没有传入参数，去查找隐式值
    def hello(implicit str:String)={
      println("hello "+str)
    }
    //没有传入参数，去查找缺省值
    hello
  }

}
