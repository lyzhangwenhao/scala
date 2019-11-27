package com.tom.scala.day01

import scala.collection.mutable

/**
 * ClassName: Scala_Map
 * Description: 
 *
 * @date 2019/11/26 0:23
 * @author Mi_dad
 */
object Scala_Map {
  def main(args: Array[String]): Unit = {
    //创建映射集合Map
    //构造不可变Map
    val map1 = Map("jerry1"->3,"tom"->1,"jerry"->2)
    println(map1)

    //构造可变集合Map
    val map2 = mutable.Map("jerry1"->3,"tom"->1,"jerry"->2)
    println(map2)

    //创建空的集合
    val map3 = new mutable.HashMap[String,Int]()
    println(map3)

    //使用元组的方式构建Map集合
    val map4 = Map(("A",1),("B",2),("C",3))
    println(map4)
    //获取数据
    println(map4("B"))

    //遍历

    for((k,v) <- map4){
      println(k+"~~~"+v)
    }
    println("-----------------")
    for (m<-map4){
      println(m)
      println(m._1,m._2)
    }
    println("-----------------")
    map4.foreach(m=>println(m))

    println("-----------------")
    map4.foreach(m=>println(m._1,m._2))

    println("-----------------")
    for (m<-map4.keys){
      println(map4.get(m))
    }

  }

}
