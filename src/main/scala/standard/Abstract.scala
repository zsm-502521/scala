package standard

/**
 * @author 赵世敏
 * @date 2022/7/8
 *       1208676641@qq.com
 * @description 抽象
 */
object Abstract {
  def main(args: Array[String]): Unit = {
    var abstractSon = new AbstractSon()
    abstractSon.printInfo()
    println("********")
    abstractSon.printInfo1()
  }
}

//定义抽象类
abstract class AbstractPer {
  //非抽象属性
  val age: Int = 18
  //抽象属性
  var name: String

  //非抽象属性
  def printInfo(): Unit = {
    println("非抽象方法")
  }

  //抽象方法  没有具体的方法体
  def printInfo1(): Unit
}

//定义抽象父类的子类   如果为非抽象子类必须实现抽象父类的抽象属性和方法
class AbstractSon extends AbstractPer {
  override var name: String = "alice"

  def printInfo1(): Unit = {
    println("抽象方法")
  }
  //重写抽象方法和抽象属性 加上override
  override val age :Int = 20

  override def printInfo(): Unit = {
    super.printInfo()
    println("重写抽象方法")
  }
}
