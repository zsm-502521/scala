package pattern

/**
 * @author 赵世敏
 * @date 2022/7/29
 *       1208676641@qq.com
 * @description 模式匹配 对象匹配 普通class
 */
object MatchObject {
  def main(args: Array[String]): Unit = {
    val student = new Student("zhangsan", 20)
    //根据对象实例内容分类
    val result = student match {
      case Student("zhangsan", 20) => "张三 20 "
      case _ => "else"
    }
    println(result)
  }
}

class Student(val name: String, val age: Int)

object Student {
  def apply(name: String, age: Int): Student = new Student(name, age)

  //实现unapply 方法 用来对对象属性进行拆解
  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null)
      None
    else
      Some(student.name, student.age)
  }
}