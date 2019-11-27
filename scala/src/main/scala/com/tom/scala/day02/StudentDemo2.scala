package com.tom.scala.day02

/**
 * ClassName: StudentDemo2
 * Description: 
 *
 * @date 2019/11/26 23:39
 * @author Mi_dad
 */
object StudentDemo2 {
  def main(args: Array[String]): Unit = {
//    val student = new Student2
//    println(student.name)

    val student = new Student2
    println(student.name)

//    val person: Person2 = new Person2 {}
//    println(person.name)
  }

}
abstract class Person2{
  lazy val prefix :String = "person_"
  var name:String = prefix + "_name"
}
class Student2 extends Person2{
  override lazy val prefix: String = "student_"

}
