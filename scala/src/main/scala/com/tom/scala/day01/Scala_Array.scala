package com.tom.scala.day01

/**
 * ClassName: Array
 * Description:
 *
 * @date 2019/11/25 21:17
 * @author Mi_dad
 */
object Scala_Array {
  def main(args: Array[String]): Unit = {
    //    val arr1 = new Array[Int](10)
    //    arr1(0)=1
    //    println(arr1(0))
    //    println(arr1.toBuffer)

    //使用apply方法创建数组对象
    //    val arr2 = Array(1,2,"qw")
    //    arr2(2)="as"
    //    println(arr2.toBuffer)

    //    val arr3 = ArrayBuffer[Int]()
    //    arr3.append(1,2,3,4,5,6)
    //    println(arr3.toArray)


    //    val arr4 = Array.ofDim[Double](3,4)
    //    arr4(0)(0)=1.0
    //    println(arr4(0).toBuffer)


    //数组遍历
    val arr5 = Array(1, 2, 3, 4, 5, 6, 7, 8, 91, 12)
    for (item <- arr5) {
      println(item)
    }
    println("-----------------")
    println(arr5.max)
    println(arr5.min)
    println(arr5.sum)
    val sorted = arr5.sorted
    println("-----------------")
    for (item<-sorted){
      println(item)
    }

  }

}
