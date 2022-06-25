package study

import java.io.{File, PrintWriter}
import scala.io.{Source, StdIn}

/**
 * @author 赵世敏
 * @date 2022/5/27
 * 1208676641@qq.com
 */
/**
 * 键盘输入
 */
object stdin {
  def main(args: Array[String]): Unit = {
    println("输入姓名：")
    val name: String = StdIn.readLine()
    println("输入年龄")
    val age: Int = StdIn.readInt()
    println(name + age)
    //打印输出
    println(s"${name}${age}岁")
  }
}
/**
 * 文件输入
 */
object fileIo {
  def main(args: Array[String]): Unit = {
    //从文件读取数据
    Source.fromFile("D:\\huaguoshang1\\sunwukong.txt").foreach(System.out.print)
    println("**************************")
//    Source.fromFile("").foreach(print)
    //将数据写入文件
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello scala")
    writer.close()
  }
}
