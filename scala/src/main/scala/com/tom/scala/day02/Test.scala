package com.tom.scala.day02

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * ClassName: Test
 * Description: 
 *
 * @date 2019/11/26 9:19
 * @author Mi_dad
 */
object Test {

  def main(args: Array[String]): Unit = {
    val arr = Array("hadoop","hadoop","hadoop","hive","spark","hbase")

    arr.map(x=>(x,1)).groupBy(_._1).mapValues(sum=>sum.map(_._2).sum).foreach(println(_))

    val tuples = arr.map(x=>(x,1))
    println(tuples.toBuffer)
    println("----------------")
    val stringToTuples = tuples.groupBy(_._1)
    stringToTuples.foreach(x=>println(x._1,x._2.toBuffer))
    println("----------------")
    val stringToInt = stringToTuples.mapValues(m=>m.length)
    for (elem <- stringToInt) {println(elem)}

    println("----------------")
    val seq = stringToInt.toBuffer
    println(seq)

    println("===============")
    val map = mutable.HashMap(("tom",12),("jerry",13))
    println(map.exists(x=>x._2>10))
    println("================")

    val ints = for (i<- 1 to 10) yield i*2
    println(ints)

  }
}
