package com.tom.scala.day01

import scala.collection.mutable

/**
 * ClassName: Scala_Set
 * Description: 
 *
 * @date 2019/11/26 8:32
 * @author Mi_dad
 */
object Scala_Set {
  def main(args: Array[String]): Unit = {
    val s1 = Set(1,2,3,4,5)
    val s2 = s1.+(4,5,6,7,8)
    println(s1)
    println(s2)
    val hashSet1 = new mutable.HashSet[Int]()
    hashSet1.add(1)
    hashSet1.add(6)
    hashSet1.add(3)
    val builder = hashSet1
      .addString(new mutable.StringBuilder(2))
    println(builder)
    println(hashSet1)

  }

}
