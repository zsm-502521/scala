package standard

/**
 * @author 赵世敏
 * @date 2022/7/9
 *       1208676641@qq.com
 * @description  设计模式
 */
object Singleton {
  def main(args: Array[String]): Unit = {
    val stu112: Stu112 = Stu112.getInstance()
    stu112.printInfo()
    val stu113: Stu112 = Stu112.getInstance()
    stu112.printInfo()
    val stu114: Stu112 = Stu112.getInstance()
    stu112.printInfo()
    println("****************")
    println(stu112)
    println(stu113)
  }
}
class Stu112 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: ${name}\t${age}\t${Stu111.school}")
  }
}
//饿汉式
//object Stu112{
//  private val stu112 = new Stu112("zhangsan", 18)
//  def getInstance(): Stu112 = stu112
//}
//懒汉式
object Stu112{
  private var stu111: Stu112 = _
  def getInstance(): Stu112 = {
    if (stu111 == null) {
      stu111 = new Stu112("lisi", 20)
    }
    stu111
  }
}