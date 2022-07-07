package standard

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper

/**
 * @author 赵世敏
 * @date 2022/7/7
 *       1208676641@qq.com
 * @description 继承
 */
object Extends {
  def main(args: Array[String]): Unit = {
    val son:Son1 = new Son1(name = "alice",age =18)
    son.printInfo()
    println("*******************")
    val son1:Son1 = new Son1(name = "alice",age =18,id = 1001)
    son1.printInfo()
  }
}

class Per1() {
  var name: String = _
  var age: Int = _

  println("1.父类的构造器")

  def this(name: String, age: Int) {
    this()
    this.name = name
    this.age = age
    println("2.父类的辅助构造器")
  }

  def printInfo(): Unit = {
    println(s"Person = ${name},age = ${age}")
  }

}

//定义子类
//继承的父类的主构造器  如果继承父类的辅助构造器 则父类的辅助构造器也被调用
class Son1(name: String, age: Int) extends Per1() {
  var id: Int = _
  println("3.子类的主构造器")

  def this(name: String, age: Int, id: Int) {
    this(name, age)
    this.id = id
    println("4.子类的辅助构造器")
  }

  override def printInfo(): Unit = {
    println(s"Son = ${name},age = ${age},id = ${id}")
  }
}