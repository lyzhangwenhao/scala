package com.tom.scala.day02

/**
 * ClassName: StudentDemo
 * Description: 
 *
 * @date 2019/11/26 21:53
 * @author Mi_dad
 */
object StudentDemo {
  def main(args: Array[String]): Unit = {

    val student = new Student1
    student.show()
  }
}
abstract class Person1{
  //一个变量没有初始化，那么这个属性就是抽象属性
  //抽象属性在编译成字节码文件时，会自动生成抽象方法，所以类必须声明为抽象类，属性并不会声明
  var name:String
  def show(): Unit ={
    println("我是"+name)
  }
}
class Student1 extends Person1 {
  var name:String = "student"
  override def show(): Unit = {
    println("我是"+name)
  }
}
