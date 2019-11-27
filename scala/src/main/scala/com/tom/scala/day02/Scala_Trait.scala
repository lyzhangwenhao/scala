package com.tom.scala.day02

/**
 * ClassName: Scala_Trait
 * Description: 
 *
 * @date 2019/11/27 0:26
 * @author Mi_dad
 */
object Scala_Trait {
  def main(args: Array[String]): Unit = {
    val mysql = new MySQL with DBOperate
    mysql.insert(12)
  }
}
trait DBOperate {
  def insert( id : Int ) {
    println("插入主键【"+id+ "】数据" )
  }
}
class MySQL {
}