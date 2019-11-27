package com.tom.scala.day01

import scala.collection.mutable.ListBuffer

/**
 * ClassName: Scala_List
 * Description: 
 *
 * @date 2019/11/25 23:07
 * @author Mi_dad
 */
object Scala_List {
  def main(args: Array[String]): Unit = {
    //创建列表数据
    //list默认为不可变的集合
    val arr1 = List(1,2,3)
    println(arr1)
    println(arr1(2))
    //创建空列表：Nil
    val arr2 = Nil
    println(arr2)

    //向列表后面追加元素
    val newArr1 = arr1:+4
    println("newArr1====>"+newArr1)
    //向列表前面追加元素
    val newArr2 = 4+:arr1
    println("newArr2====>"+newArr2)

    //使用::运算符来创建集合
    //使用时，集合对象一定要放在最右边，运算规则是从右向左
    val list1 = 1::2::3::4::arr1::Nil
    val list2 = 1::2::3::4::arr1:::Nil
    val list3 = 1::2::3::4::arr1
    val list4 = 1::2::3::4::Nil::arr1

    println(list1)
    println(list2)
    println(list3)
    println(list4)


    //可变列表
    val arr3 = ListBuffer(1,2,3)
    arr3.append(123)
    println("arr3====>"+arr3)

  }

}
