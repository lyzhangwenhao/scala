package com.tom.scala.day02

/**
 * ClassName: ExceptionTest
 * Description: 
 *
 * @date 2019/11/26 19:09
 * @author Mi_dad
 */
object ExceptionTest {
  def main(args: Array[String]): Unit = {
//
//    try {
//      val num = 10/0
//    }catch {
//      //大异常在前面后面的case执行不了
//      case exception: Exception => println("捕获了异常")
//      case exception: ArithmeticException => println("捕获了除数为零的异常")
//    }finally {
//      println("finally....")
//    }
    exceptionFun()
  }
  @throws(classOf[NumberFormatException])
  def exceptionFun(): Unit ={
    "abc".toInt
  }

}
