package com.tom.scala.day02

/**
 * ClassName: Scala_Enum
 * Description: 
 *
 * @date 2019/11/26 20:34
 * @author Mi_dad
 */
object Scala_Enum{
  def main(args: Array[String]): Unit = {
    println(EnumTest.RED)
  }
}
object EnumTest extends Enumeration {

  val RED=Value(1,"red")
  val Yellow = Value(1, "Slow")
  val Green = Value(2, "Go")
}
