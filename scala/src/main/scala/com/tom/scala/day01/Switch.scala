package com.tom.scala.day01

/**
 * ClassName: MySql
 * Description:
 *
 * @date 2019/11/25 20:46
 * @author Mi_dad
 */
object Switch {
  def main(args: Array[String]): Unit = {
    //向已经编译的mysql类中添加功能
    implicit def addDelete(mySql: MySql):DB={
      new DB
    }
    val mySql=new MySql
    //已经进行隐式转换，可以调用DB的delete方法
    mySql.delete()
  }
  class MySql{
    def insert()={
      println("插入功能")
    }
  }
  class DB{
    def delete()={
      println("删除功能")
    }
  }

}
