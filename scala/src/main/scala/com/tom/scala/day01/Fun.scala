package com.tom.scala.day01

/**
 * ClassName: Fun
 * Description: 
 *
 * @date 2019/11/25 20:37
 * @author Mi_dad
 */
object Fun {
  def main(args: Array[String]): Unit = {
    //double ==> int
    implicit def a(d:Double):Int={
      d.toInt
    }
    val num:Int =3.5
    println(num)
  }


}
