package study

import scala.util.control.Breaks
import scala.util.control.Breaks.break

/**
 * @author 赵世敏
 * @date 2022/6/1
 *       1208676641@qq.com
 *
 */
object loops {
  def main(args: Array[String]): Unit = {
    //while循环
    var i = 0
    while (i < 10) {
      println("this is while loop\t" + i)
      //为了防止死循环，需要加一个条件
      i += 1
    }
    //
    separate.sepatator(
      //打印当前时间
      s"${System.currentTimeMillis().toString}")
    separate.sepatator(
      //打印当前时间
      new java.util.Date().toString)
    //do while循环
    var b = 0
    do {
      println("this is do while loop\t" + b)
      b += 1
    } while (b < 10)
  }
}

/** *
 * break 退出循环
 */
object demo1 {
  def main(args: Array[String]): Unit = {
    //    var i = 0
    //    while (i < 10) {
    //      if (i == 5) {
    //        println("退出循环")
    //        break
    //      }
    //      println("this is while loop\t" + i)
    //      i += 1
    //    }
    //do while循环 退出
    //    var b = 0
    //    do {
    //      if (b == 5) {
    //        println("退出循环")
    //        break
    //      }
    //      println("this is do while loop\t" + b)
    //      b += 1
    //    } while (b < 10)
    //分割线
    separate.sepatator("Breaks.break")
    //try catch 退出 while循环
    Breaks.breakable(
      for (elem <- 1 to 10) {
        if (elem == 8)
          Breaks.break()
        println("" + elem)
      }
    )
    //fengexian
    separate.sepatator("try catch")
    var c = 0
    try {
      while (c < 10) {
        println("this is while loop\t" + c)
        c += 1
        if (c ==2)
          throw new Exception("出错了")
      }
    }catch {
      case e: Exception => println("try catch 退出循环")
    }
  }
}
