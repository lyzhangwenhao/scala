package com.tom.scala.day01

import scala.util.control.Breaks.{break, breakable}

/**
 * ClassName: Scala_While
 * Description: 
 *
 * @date 2019/11/26 0:28
 * @author Mi_dad
 */
object Scala_While {
  def main(args: Array[String]): Unit = {

   /* var n=1
    val while1 = while (n<10){
      n+=1
    }
    println(n)
    //while没有返回值，所以返回()
    println(while1)*/

    //函数的参数列表声明可以使用大括号代替小括号
    //将一段逻辑代码作为参数传给另外一个方法，这个函数称之为高阶函数，拉姆特表达式
    //breakable()
    var n=1
    breakable{
      while (n<10){
        n+=1
        if (n==6){
          break()
        }
      }
    }
    println(n)


  }

}
