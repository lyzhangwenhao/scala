package com.tom.scala.day02

/**
 * ClassName: PersonDemo
 * Description: 
 *
 * @date 2019/11/26 11:14
 * @author Mi_dad
 */
object PersonDemo {
  def main(args: Array[String]): Unit = {
    //如果Person不使用，则new Person不会执行，lazy表示懒加载
    lazy val person = new Person("张三",22,"北京")
//    person work()
    person.work()
    println("----------")

    val student = Student()
    println(student)
    val student1 = Student("zhangsan")
    println(student1)

  }

}
class Student{

}
object Student{
  def apply(): Student = new Student()

  def apply(name:String): Student = new Student()
}
