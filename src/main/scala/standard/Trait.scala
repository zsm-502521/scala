package standard

/**
 * @author 赵世敏
 * @date 2022/7/10
 *       1208676641@qq.com
 * @description 特质
 */
object Trait {
  def main(args: Array[String]): Unit = {
    val stu13 = new Student13
    stu13.sayHello()
    stu13.study()
    stu13.dating()
    stu13.printInfoYoung()
  }
}

class Person13 {
  val name: String = "zhangsan"
  var age: Int = 18

  def sayHello: Unit = {
    println("hello person " + name)
  }
}

//特质  和抽象类相似  但是特质可以有实现
trait Young {
  //抽象和非抽象属性
  var age: Int
  val name = "young"

  //抽象和非抽象方法
  def printInfoYoung(): Unit = {
    println("Young\t" + name)
  }

  def dating: Unit
}

class Student13 extends Person13 with Young {
  //重写冲突的属性 name
  override val name: String = "Student"
  //实现抽象方法
  override def dating(): Unit = {
    println("dating\t"+name)
  }
  def study ():Unit={
    println("study\t"+ name)
  }
  //重写父类的方法
  override def sayHello(): Unit = {
    super.sayHello
    println("hello student " + name)
  }
}