package com.tom.scala.day01

/**
 * ClassName: Variable2
 * Description: 
 *
 * @date 2019/11/25 19:20
 * @author Mi_dad
 */
object Variable2 {
  def main(args: Array[String]): Unit = {
//    println(sum(2,3))
//    var age = 12;

    var v1=f2 _
    v1()

  }


  def sum(a: Int,b:Int): Int ={
    a+b
  }
  def sum2(a:Double,b:Double)={
    a+b
  }

  def f1(): Unit ={
    println("f1---")
  }

  def f2(): Unit ={
    f1
  }

}
