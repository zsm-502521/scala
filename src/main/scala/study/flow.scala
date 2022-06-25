package study

import java.util.Random
import scala.collection.immutable

import scala.io.StdIn


/**
 * @author 赵世敏
 * @date 2022/5/31
 *       1208676641@qq.com
 *
 */

/**
 * 循环语句返回值为 ()
 * 如果定义返回值的话 为当前执行语句的返回值
 */
object ifelse {
  def main(args: Array[String]): Unit = {
    println("输入年龄")
    val age: Int = StdIn.readInt()
    //双分支
    val a: String = if (age > 18) {
      println("成年")
      "成年"
    } else {
      println("未成年")
      "\"未成年\""
    }
    //多分支
    val res: Any = if (age < 6) {
      println("幼年")
      111
    } else if (age < 18) {
      println("童年")
      "222"
    } else if (age > 60) {
      println("老年")
      333
    } else {
      println("壮年")
      "444"
    }
    println(a)
    println(res)
    //类似三元运算符的scala语法 print（a？b：c）
    val name: String = StdIn.readLine()
    val str: String = if (name == "scala") "是scala" else "不是scala"
    println(str)
  }

}

/*
   定义方法
 */
//分割线方法
object separate {
  def sepatator(sep: String) = {
    println(sep * 30)
  }
}

object flowFor {
  def main(args: Array[String]): Unit = {
    //to 包含是 没有边界 until 不包含边界
    for (i <- 1 to 10) {
      println(i + "hello word")
    }
    // until
    for (elem <- 1 until 10) {
      println(elem)
    }
    val margin: String =
      s"""
         |
         | 你好
         |""".stripMargin
    println(margin)
    // 倒序排序循环
    for (a <- (1 until 10) reverse) {
      println(a)
    }
    //遍历数组  Array List Set 都可以
    for (b <- Array(12, 231, 31)) {
      println(b)
    }
    separate.sepatator("*")
    //循环守卫 当参数为某一值时不执行
    for (elem <- 1 to 10 if elem != 5) {
      println(elem)
    }
    separate.sepatator("***")
    //循环步长 by 不能为 0 可以为double 类型 需要参数为 double 1 => 1.0
    for (elem <- 1 to 10 by 3) {
      println(elem)
    }
    //0.3 步长  有可能会缺失精度
    for (elem <- 1.0 to 10.0 by 0.3) {
      println(elem)
    }
  }
}

object forfor {
  def main(args: Array[String]): Unit = {
    //循环变量
    for (a <- 1 to 9) {
      for (b <- 1 to a) {
        print("a*b=" + a * b + "\t")
      }
      println()
    }
    separate.sepatator("————")
    //简写
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$i * $j =${i * j} \t")
      if (i == j) {
        println()
      }
    }
    //引入变量
    for (elem <- 1 to 10; elem2 = elem - 1) {
      println(s"$elem***$elem2")
    }
  }
}

object work1 {
  def main(args: Array[String]): Unit = {
    //杨辉三角
    //i 行数
    for (i <- 1 until 10) {
      println(" " * (9 - i) + "*" * (i * 2 - 1))
    }
    //99乘法表
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$i * $j = ${i * j}\t")
      }
      println()
    }
  }
}

//copilot test demo
object work2 {
  //用户登录
  def main(args: Array[String]): Unit = {
    //定义变量
    var username: String = null
    var password: String = null
    //循环
    do {
      println("请输入用户名")
      username = StdIn.readLine()
      println("请输入密码")
      password = StdIn.readLine()
      if (username == "admin" && password == "123") {
        println("登录成功")
      } else {
        println("用户名或密码错误")
      }
    } while (username != "admin" && password != "123")
  }

  //用户注册
  def main1(args: Array[String]): Unit = {
    //定义变量
    var username: String = null
    var password: String = null
    //循环
    do {
      println("请输入用户名")
      username = StdIn.readLine()
      println("请输入密码")
      password = StdIn.readLine()
      if (username == "admin" && password == "123") {
        println("用户名已存在")
      } else {
        println("注册成功")
      }
    } while (username != "admin" && password != "123")
  }

  //生成验证码
  def main2(args: Array[String]): Unit = {
    //定义变量
    var code: String = null
    //循环
    do {
      //定义变量
      var code: String = null
      //生成随机数
      val random = new Random()
      //生成随机数
      val code1 = random.nextInt(10)
      val code2 = random.nextInt(10)
      val code3 = random.nextInt(10)
      val code4 = random.nextInt(10)
      //拼接字符串
      code = code1 + "" + code2 + "" + code3 + "" + code4
      println(code)
      println("请输入验证码")
      val code5 = StdIn.readLine()
      if (code == code5) {
        println("验证码正确")
      } else {
        println("验证码错误")
      }
    } while (code != code)
  }
}

object work3 {
  def main(args: Array[String]): Unit = {
    //循环返回值
    val unit: Unit = for (i <- 1 to 10) {
    }
    println(unit)
    //分割线
    separate.sepatator("————")
    //yield 后面的值为返回值
    val ints: immutable.IndexedSeq[Int] = for (elem <- 1 to 10) yield elem * 2
    val a = ints
    println(a)
    //
  }
}
