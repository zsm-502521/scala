package standard

/**
 * @author 赵世敏
 * @date 2022/7/5
 *       1208676641@qq.com
 * @description 构造器
 */
object Constructor {
  def main(args: Array[String]): Unit = {
    val stu: Stu = new Stu()
    stu.Stu()
    stu.name ="alice"
    val s1 = new Stu("赵世敏")
    val s2 = new Stu("赵世敏", 20)

  }

}

//定义一个类
class Stu() {
  var name: String = _
  var age: Int = _

  println("1.主构造器被调用")

  //辅助构造方法
  def this(name: String) {
    this() //调用主构造器
    this.name = name
    println("2.辅助构造器被调用")
    println(s"${name}\t${age}")
  }

  def this(name: String, age: Int) {
    this()
    this.age = age
    println("3.辅助构造器被调用")
    println(s"${name}\t${age}")
  }

  def Stu(): Unit = {
    println("4.一般方法被调用")
    println(s"${name}\t${age}")
  }
}