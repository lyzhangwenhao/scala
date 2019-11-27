package com.tom.scala.day01

/**
 * ClassName: Scala_For
 * Description: 
 *
 * @date 2019/11/26 0:47
 * @author Mi_dad
 */
object Scala_For {
  def main(args: Array[String]): Unit = {
    //    for(i <- 1 to 3){
    //      print(i)
    //    }
    //    println()
    //
    //    for(i <- 1 until 3) {
    //      print(i)
    //    }
    //    println()

    //    for (i <- 1 to 3;j <- 1 to 4){
    //      println("i:"+i+"---j:"+j)
    //    }

    //循环产生新的集合
    val for1 = for (i <- 1 to 10) yield i
    println(for1)

    for {
      i <- 1 to 3
      j <- 1 to 4
    } {
      println("i:" + i + "---j:" + j)
    }

  }

}
