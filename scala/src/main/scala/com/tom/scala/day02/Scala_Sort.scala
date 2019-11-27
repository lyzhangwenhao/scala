package com.tom.scala.day02

import scala.collection.mutable.ArrayBuffer
import util.control.Breaks._

/**
 * ClassName: Scala_Sort
 * Description: 
 *
 * @date 2019/11/27 14:05
 * @author Mi_dad
 */
object Scala_Sort {
  def main(args: Array[String]): Unit = {

    val arr: ArrayBuffer[Int] = ArrayBuffer(4, 3, 5, 1, 2, 23, 99, 54, 45, 56)
    //    val sortArr: ArrayBuffer[Int] = maopaoSort(arr)

    insertSort(arr)
    println(arr)
    //    println(end-start)
  }

  def maopaoSort(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    for (i <- arr.indices; j <- i until arr.length) {
      var temp = 0
      if (arr(i) > arr(j)) {
        temp = arr(i)
        arr(i) = arr(j)
        arr(j) = temp
      }
    }
    return arr
  }

  //  def insertSort(arr:ArrayBuffer[Int]):ArrayBuffer[Int]={
  //    for (i <- 1 until arr.length){
  //      var j = i-1
  //      breakable{
  //        while (j>=0 && arr(j)>arr(i)){
  //          val temp: Int = arr(i)
  //          arr.remove(i)
  //          arr.insert(j-1,temp)
  //          j-=1
  //          break()
  //        }
  //      }
  //    }
  //    arr
  //  }

  def insertSort(arr: ArrayBuffer[Int]) {
    var key = 0
    var i = 0
    for (j <- 1 until arr.length) {
      key = arr(j)
      i = j - 1
      while (i > -1 && arr(i) > key) {
        arr(i + 1) = arr(i)
        i = i - 1
      }
      arr(i + 1) = key
    }
  }
}
