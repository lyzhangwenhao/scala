package com.tom.scala.day02

/**
 * ClassName: Scala_Object
 * Description: 
 *
 * @date 2019/11/26 19:53
 * @author Mi_dad
 */
object Scala_Object {
  def main(args: Array[String]): Unit = {
    //构造对象时，会执行主构造函数，所谓的主构造函数，其实就是类的主题内容
    //主构造方法如果没有参数，那么小括号可以省略，构造对象时调用的构造方法的小括号也可以省略
    val emp = new Emp

    val emp1 = new Emp1("zhangsan")

  }
  class Emp{
    //类体
    //构造方法体
    println("emp.....")
  }
  class Emp1 private(){
    //类体
    //构造方法体
    println("emp1.....")

    //辅助构造器不能直接构建对象，需要调用主构造器调用对象
    def this(name:String){
      //在辅助构造器中一定要有调用主构造器的逻辑
      this()
      println(name+"----")
    }
  }

}
