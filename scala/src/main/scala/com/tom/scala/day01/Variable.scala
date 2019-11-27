package com.tom.scala.day01

/**
 * ClassName: Variable
 * Description: 
 *
 * @date 2019/11/25 16:28
 * @author Mi_dad
 */
object Variable {

  def main(args: Array[String]): Unit = {
    val v1 = 10
    //val为不可变量，所以不能改变其值
//    v1 = 12
    //var为可变变量，可以改变值
    var v2 = 12
    v2 = 19
//    println(v2.toString())
//    println(v1-v2)


//    println("abc".concat("def"))
//    println("abc".length)
//
//    val intNum:Int = 12
//    println(intNum)

//    val x = -9;
//    val flag = if(x>0) 1 else "负数"
//    println(flag)

    val f=(x:Int,y:Int) => x-y
    println(f(8,5))
    def m1(a: Int,b: Int)={
      f(a,b)
    }
    val i = m1(10,2)
    println(i)

    def m2(f:(Int,Int)=>Int)={
      f(2,3)
    }
    val r1 = m2(f);
    println(r1+"---")



  }
}
