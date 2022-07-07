package standard

/**
 * @author 赵世敏
 * @date 2022/7/5
 *       1208676641@qq.com
 * @description 访问权限
 */
object ClassForAccess {
  def main(args: Array[String]): Unit = {
  }
}

class Person {
  //私有属性:只能在当前类中访问
  private val idcard: String = "12314"
  //受保护的属性:只能在当前类和子类中访问
  protected var name = "alice"
  //常规属性:可以在任何地方访问
  var sex = "男"
  //访问权限包属性:只能在定义的包中访问
  private[standard] var age = 18

  def printForPerson(): Unit = {
    println(s"${idcard}\t${name}\t${sex}\t${age}")
  }

}
