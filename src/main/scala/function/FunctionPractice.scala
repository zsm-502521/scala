package function

/**
 * @author 赵世敏
 * @date 2022/6/25
 *       1208676641@qq.com
 *
 */
object FunctionPractice {
  //todo 测试一
  /*
  练习 1：定义一个匿名函数，并将它作为值赋给变量 fun。函数有三个参数，类型分别为 Int，String，Char，返回值类型为 Boolean。
  要求调用函数 fun(0, “”, ‘0’)得到返回值为 false，其它情况均返回 true。
   */
  def main(args: Array[String]): Unit = {
    val fun = (i: Int, string: String, char: Char) => {
      if (i == 0 && string == "" && char == '0')
        false else true
    }
    println(fun(0, "", '0'))
    println(fun(1, "", '0'))
    println(fun(1, "", '0'))
    println(fun(0, "hello", '0'))
  }

  //todo 测试二
  /*
  练习 2： 定义一个函数 func，它接收一个 Int 类型的参数，返回一个函数（记作 f1）。
  它返回的函数 f1，接收一个 String 类型的参数，同样返回一个函数（记作 f2）。函数 f2 接
 收一个 Char 类型的参数，返回一个 Boolean 的值。
  要求调用函数 func(0) (“”) (‘0’)得到返回值为 false，其它情况均返回 true。
   */
  def func(i: Int): String => (Char => Boolean) = {
    def f1(s: String): Char => Boolean = {
      def f2(c: Char): Boolean = {
        if (i == 0 && s == "" && c == '0')
          false else true
      }

      f2
    }

    f1
  }

  println(func(0)("")('0'))
  println(func(1)("")('0'))
  println(func(0)("d")('0'))
  println(func(0)("")('1'))

  println("*****************")

  //测试二 的简写
  def func1(i: Int): String => (Char => Boolean) = {
    (s: String) => (c: Char) => {
      if (i == 0 && s == "" && c == '0')
        false else true
    }
  }
  println(func1(0)("")('0'))
  println(func1(1)("")('0'))
  println(func1(0)("d")('0'))
  println(func1(0)("")('1'))

  //柯里化
  def func2(i: Int)(s: String)(c: Char): Boolean = {
    if (i == 0 && s == "" && c == '0')
      false else true
  }

  println("*****************")
  println(func2(0)("")('0'))
  println(func2(1)("")('0'))
  println(func2(0)("d")('0'))
  println(func2(0)("")('1'))
}
