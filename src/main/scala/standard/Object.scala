package standard

/**
 * @author 赵世敏
 * @date 2022/7/9
 *       1208676641@qq.com
 * @description 伴生类和伴生对象
 */
object Object {
  def main(args: Array[String]): Unit = {
    //定义为私有化之后不可以直接调用
    //    val stu11 = new Stu111("alice", 18)
    //    stu11.printInfo()
    val bob: Stu111 = Stu111.newStu("bob", 20)
    bob.printInfo()
    val bob1: Stu111 = Stu111.apply("bob1", 20)
    bob1.printInfo()
    //调用的其实是Stu111 的apply方法  可以省略apply
    val bob2: Stu111 = Stu111("bob2", 20)
    bob2.printInfo()
  }
}

//定义类  构造方法私有化
class Stu111 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: ${name}\t${age}\t${Stu111.school}")
  }
}

//伴生对象
object Stu111 {
  val school: String = "atguigu"

  //定义一个类的对象实例的创建方法
  def newStu(name: String, age: Int): Stu111 = new Stu111(name, age)

  def apply(name: String, age: Int): Stu111 = new Stu111(name, age)
}
