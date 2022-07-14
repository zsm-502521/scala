package standard

/**
 * @author 赵世敏
 * @date 2022/7/13
 *       1208676641@qq.com
 * @description 类型判断  枚举
 */
object TypeJudgment {
  def main(args: Array[String]): Unit = {
    val stu17 = new Student17(name = "alice", 18)
    stu17.study()
    stu17.sayHi()
    //子类对象赋值给父类 调用的还是子类方法
    val per17: Person17 = new Student17("bob", 20)
    per17.sayHi()
    println("**********")
    // todo 类型检测和判断
    println(stu17.isInstanceOf[Student17])
    println(stu17.isInstanceOf[Person17])
    println(per17.isInstanceOf[Student17])
    println(per17.isInstanceOf[Person17])
    val per = new Person17("cary", 28)
    println(per.isInstanceOf[Person17])
    println(per.isInstanceOf[Student17])
    println("************")
    //todo 类型转换
    if (per17.isInstanceOf[Student17]) {
      val study = per17.asInstanceOf[Student17]
      study.study()
    }
    // todo 类型检测
    println(classOf[Student17])

    //todo 测试枚举类
    println(WorkDay.MONDAY)
  }
}

class Person17(name: String, age: Int) {
  def sayHi(): Unit = {
    println("person\t" + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age) {
  override def sayHi(): Unit = println("student\t" + name)

  def study(): Unit = {
    println("student study")
  }
}

//定义枚举类对象
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "monday")
  val TUESDAY = Value(2,"tuesday")
}

//应用类
object TestApp extends App{
  println("is app class")
  //定义类型
  type myString =String
  var a:myString = "abc"
  println(a)
}