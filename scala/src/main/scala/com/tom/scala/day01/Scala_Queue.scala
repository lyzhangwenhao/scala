package com.tom.scala.day01

import scala.collection.mutable

/**
 * ClassName: Scala_Queue
 * Description: 
 *
 * @date 2019/11/26 0:13
 * @author Mi_dad
 */
object Scala_Queue {
  def main(args: Array[String]): Unit = {
    //队列
    val q = new mutable.Queue[Int]
    //追加元素
    q+=1
    //追加集合元素
    q ++= List(2,3,4)
    //删除元素,先进先出
    q.dequeue()
    //增加元素
    q.enqueue(5,6,7)
    //返回队列的头元素
    println(q.head)
    //返回队列中的最后一个元素
    println(q.last)
    //返回队列中的尾部数据,是一个集合，除了头之外的元素，（尾部还可以取尾部，递归用）
    println(q.tail)
    println(q)
  }

}
