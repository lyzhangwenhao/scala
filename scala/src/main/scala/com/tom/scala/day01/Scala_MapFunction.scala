package com.tom.scala.day01

/**
 * ClassName: Scala_MapFunction
 * Description: 
 *
 * @date 2019/11/26 16:57
 * @author Mi_dad
 */
object Scala_MapFunction {
  def main(args: Array[String]): Unit = {
    //创建集合
    val list = List(1,2,3,4,5)
    //Map方法会将集合的每一个元素作为参数传递给函数，然后将结果放置在新的集合里
    def multiple(i:Int):Int={
      i*2
    }
    println(list.map(multiple))
    //与上面代码等效
    println(list.map(_*2))
//---------------------------------------------
    val list1: List[String] = List("add","black","case")
    println(list1.flatMap(_.toUpperCase))
    println(list1.map(_.toUpperCase))

    //filter
    val list2: List[String] = list1.filter(_.startsWith("b"))

    println(list2)
    

  }

}
