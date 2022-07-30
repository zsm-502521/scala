package pattern

/**
 * @author 赵世敏
 * @date 2022/7/29
 *       1208676641@qq.com
 * @description 模式匹配 样例类
 */
/*
样例类仍然是类，和普通类相比，只是其自动生成了伴生对象，并且伴生对象中自动提供了一些常用的方法，如 apply、unapply、toString、equals、hashCode 和 copy。
样例类是为模式匹配而优化的类，因为其默认提供了 unapply 方法，因此，样例类可以直接使用模式匹配，而无需自己实现 unapply 方法
构造器中的每一个参数都成为 val，除非它被显式地声明为 var（不建议这样做）
 */
object MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1("zhangsan", 20)
    student1 match {
      case Student1("zhangsan", 20) => println("name is zhangsan, age is 20")
      case _ => println("other")
    }
  }
}

//定义样例类
case class Student1(name: String, age: Int)
