package com.tom.scala.day02

/**
 * ClassName: Scala_Trait2
 * Description: 
 *
 * @date 2019/11/27 0:35
 * @author Mi_dad
 */
object Scala_Trait2 {
  def main(args: Array[String]): Unit = {
    //Scala在叠加的特质的时候，会首先从后面的特质开始执行
    //Scala中特质中如果调用super，并不是表示调用父特质的方法，而是向前面（左边）继续查找特质，如果找不到，才会去父特质查找
    val mysql = new MySql1 with File1 with DB1
    mysql.insert(12)
  }
}
trait Operate1{
  def insert(id:Int)
}
trait Data1 extends Operate1{
  override def insert(id: Int): Unit = {
    println("插入数据"+id)
  }
}
trait File1 extends Data1{
  override def insert(id: Int): Unit = {
    print("向文件中")
    super.insert(id)
  }
}
trait DB1 extends Data1{
  override def insert(id: Int): Unit = {
    print("向数据库")
    super.insert(id)
  }
}
class MySql1{

}
