package standard

/**
 * @author 赵世敏
 * @date 2022/7/7
 *       1208676641@qq.com
 * @description 构造器参数
 */
object ConstructorParams {
  def main(args: Array[String]): Unit = {
    val stu2 = new Stu2
    stu2.name = "zhangsan"
    stu2.age = 18
    println(s"${stu2.name} ${stu2.age}")

    val stu3 = new Stu3("lisi", 20)
    println(s"${stu3.name} ${stu3.age}")

    val stu4 = new Stu4("wangwu", 30)
    //    println(s"${stu4.name} ${stu4.age}")   error
    stu4.printInfo()
    val stu5 = new Stu5("zhaosi", 40)
    println(s"${stu5.name} ${stu5.age}")
    //    stu5.age = 50 error
    stu5.printInfo()
    val stu6 = new Stu6("Bob", 20, "北京")
    println(s"${stu6.name} ${stu6.age} ${stu6.school}")
    stu6.printInfo()
  }

}

//定义类
//无参构造器
class Stu2 {
  var name: String = _
  var age: Int = _
}

//Stu2等价于Stu3(var name:String, var age:Int)
class Stu3(var name: String, var age: Int) {

}

//主构造器参数无修饰
class Stu4(name: String, age: Int) {
  def printInfo(): Unit = {
    println(s"${name} ${age}")
  }
}

//参数无法修改
class Stu5(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"${name} ${age}")
  }
}

class Stu6(var name: String, var age: Int) {
  var school: String = _

  def this(name: String, age: Int, school: String) {
    this(name, age)
    this.school = school
  }

  def printInfo(): Unit = {
    println(s"${name} ${age} ${school}")
  }
}