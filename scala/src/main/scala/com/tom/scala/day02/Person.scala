package com.tom.scala.day02

/**
 * ClassName: Person
 * Description: 
 *
 * @date 2019/11/26 11:12
 * @author Mi_dad
 */
class Person() {
  private var name:String = _
  private var age:Int = _
  private var address:String = _

  println("测试辅助构造")

  def this(name:String,age:Int,address:String){
    this()
    this.name=name
    this.age=age
    this.address=address
  }

  def work(): Unit ={
    println(this.name+"在"+address+"工作")
  }

}
