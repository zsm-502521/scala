package standard

/**
 * @author 赵世敏
 * @date 2022/7/9
 *       1208676641@qq.com
 * @description 匿名子类 ???
 */
object AnonymousClass {
  def main(args: Array[String]): Unit = {
    val per1 = new Per10 {
      override var name: String = "alice"
      override def printInfo(): Unit = println("Per10 method")
    }
    println(per1.name)
    per1.printInfo()
  }
}

//定义一个abstract 类
abstract class Per10 {
  var name: String
  def printInfo(): Unit
}