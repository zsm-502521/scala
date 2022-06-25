package study

import study.Student.school

/**
 * @author 赵世敏
 * @date 2022/5/27
 *       1208676641@qq.com
 *
 */

/**
 * 字符串模板
 * raw 直接输出
 * s 标准输出
 * f 格式输出
 *
 */
class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    //字符串模板
    println(s"${name}的年龄是${age}在${school}学习")
    //多次打印
    println(name * 3)
  }
}

//引入伴生对象 名字一样
object Student {
  val school = "atguigu"

  def main(args: Array[String]): Unit = {
    val a = new Student("a", 12)
    val b = new Student("b", 12)

    a.printInfo()
    b.printInfo()

  }
}

/**
 * f 格式输出 2.3保留三位小数 四舍五入法
 * 三引号 输出 自定义换行
 */
object printInfo {
  def main(args: Array[String]): Unit = {
    val name = "lisa"
    val a = 12121.3126
    val sql: String =
      s"""
         |select *
         |from
         |   emp
         |where
         |   name =${name}
         |""".stripMargin
    println(f"${a}%6.3f")
    println(sql)
  }
}

/**
 * b 的值为 a 的二进制值 取反加1 的结果
 */
object intByte {
  def main(args: Array[String]): Unit = {
    val a: Int = 1398
    val b: Byte = a.toByte
    println(b)
    println(1.+(123.12))
//    println(1.2 toInt toString)  需要在字符调用 【.toInt】方法
  }
}